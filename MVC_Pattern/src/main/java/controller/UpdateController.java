package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;

@WebServlet("/update")
public class UpdateController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action=req.getParameter("action");
		int uid=Integer.parseInt(req.getParameter("uid"));
		UserDao ud=new UserDao();
		if(action.equals("delete")) {
			int i=ud.deleteUser(uid);
			if(i>0) {
				req.getRequestDispatcher("displayuser").forward(req, resp);
			}
		}else if(action.equals("update")){
			User u=ud.getDataById(uid);
			req.setAttribute("user", u);
			ArrayList<User> al=ud.getAllUser();
			req.setAttribute("data", al);
			req.getRequestDispatcher("displayuser.jsp").forward(req, resp);
		}
	}
}
