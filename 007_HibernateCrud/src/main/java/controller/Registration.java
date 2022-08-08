package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.Employee;

@WebServlet("/reg")
public class Registration extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		Employee emp=new Employee();
		emp.setName(name);
		emp.setEmail(email);
		emp.setPass(pass);
		
		UserDao dao=new UserDao();
		Employee e=dao.isExist(emp);
		if(e!=null){
			req.setAttribute("warn", "Email Already exist!!");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}else {
			dao.regUser(emp);
			req.setAttribute("msg", "Registration Successfull!!");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
	}
}
