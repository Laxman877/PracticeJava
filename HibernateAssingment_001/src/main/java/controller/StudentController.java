package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import model.Student;

@WebServlet("/reg")
public class StudentController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String pass=req.getParameter("pass");
		String gender=req.getParameter("gender");
		
		Student std=new Student();
		std.setFname(fname);
		std.setLname(lname);
		std.setEmail(email);
		std.setMobile(mobile);
		std.setPass(pass);
		std.setGender(gender);
		
		StudentDao dao=new StudentDao();
		dao.addStudent(std);
	}
}
