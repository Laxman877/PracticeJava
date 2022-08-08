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
public class Registration extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int uid = 0;
		String id = req.getParameter("id");
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String pass = req.getParameter("pass");
		String gender = req.getParameter("gender");
		if (!id.equals("")) {
			uid = Integer.parseInt(id);
		}
		Student std = new Student();
		std.setId(uid);
		std.setFname(fname);
		std.setLname(lname);
		std.setEmail(email);
		std.setMobile(mobile);
		std.setPass(pass);
		std.setGender(gender);

		StudentDao dao = new StudentDao();

		if (id.equals("")) {
			Student email1 = dao.isEmailExist(std);
			if (email1 != null) {
				req.setAttribute("warn", "Email already exist!!");
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			} else {
				dao.regStudent(std);
				req.setAttribute("msg", "Register Successfully!!");
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			}
		}
		else
		{
			dao.regStudent(std);
			req.getRequestDispatcher("display").forward(req, resp);
		}

		
		
	}
}
