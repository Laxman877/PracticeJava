package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import model.User;

@WebServlet("/reg")
public class UserController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		int uid=Integer.parseInt(id);

		UserDao dao=new UserDao();
		if(uid>0) {
			User u=new User();
			u.setUid(uid);
			u.setFname(fname);
			u.setLname(lname);
			u.setEmail(email);
			u.setMobile(mobile);
			HttpSession session = req.getSession();
			email = (String)session.getAttribute("email");
			int i=dao.updateData(u);
			if(i>0) {
			req.setAttribute("msg", "data updated!!");
			req.getRequestDispatcher("edit.jsp").forward(req, resp);
			}
		}
		else {
			User u=new User();
			u.setFname(fname);
			u.setLname(lname);
			u.setEmail(email);
			u.setMobile(mobile);
		String user=dao.isExist(u);
		if(user!=null) {
			req.setAttribute("warn", "Email or Mobile already exist!!");
			req.getRequestDispatcher("reg.jsp").forward(req, resp);
		}else {
			int i=dao.regUser(u);
			if(i>0) {
				req.setAttribute("msg", "Registration successfull...");
				req.getRequestDispatcher("reg.jsp").forward(req, resp);
			}
		}
		}
	}
}
