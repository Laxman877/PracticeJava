package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User01;

@WebServlet("/reg")
public class RegistrationController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int uid=0;
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String dept=req.getParameter("dept");
		if(!id.equals("")) {
			uid=Integer.parseInt(id);
		}
		User01 u=new User01();
		u.setName(name);
		u.setEmail(email);
		u.setDept(dept);
		
		UserDao dao=new UserDao();
		dao.addEmp(u);
	}
}
