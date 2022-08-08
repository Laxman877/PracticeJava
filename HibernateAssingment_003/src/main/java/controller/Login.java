package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.StudentDao;
import model.Student;

@WebServlet("/login")
public class Login extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		Student st=new Student();
		st.setEmail(email);
		st.setPass(pass);
		
		StudentDao dao=new StudentDao();
		boolean b=dao.loginCheck(st);
		
		if(b) {
			Student std=dao.isEmailExist(st);
			HttpSession session=req.getSession();
			session.setAttribute("user_email", std.getEmail());
			req.getRequestDispatcher("display").forward(req, resp);
		}else {
			req.setAttribute("err", "Invalid Username Or Password!!");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
}
