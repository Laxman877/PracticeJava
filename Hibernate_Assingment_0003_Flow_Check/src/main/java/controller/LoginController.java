package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import model.User;

@WebServlet("/login")
public class LoginController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		User u=new User();
		u.setEmail(email);
		u.setPass(pass);
		
		UserDao dao=new UserDao();
		boolean b=dao.logincheck(u);
		
		if(b) {
			User us=dao.isEmailExist(u);
			HttpSession session=req.getSession();
			session.setAttribute("user_email", us.getEmail());
			req.getRequestDispatcher("display").forward(req, resp);
		}else {
			req.setAttribute("err", "invalid username Or password!!");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
}
