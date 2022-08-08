package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.StudentDao;
import model.Student;

@WebServlet("/display")
public class Display extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentDao dao=new StudentDao();
		
		HttpSession session = req.getSession(false);
		String user = (String) session.getAttribute("user_email");
		
		Student std=dao.getStudent(user);
		req.setAttribute("dt", std);
		req.getRequestDispatcher("profile.jsp").forward(req, resp);
	}
}
