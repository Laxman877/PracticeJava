package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User01;

@WebServlet("/display")
public class DisplayController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDao dao=new UserDao();
		ArrayList<User01> al=dao.getAllEmp();
		req.setAttribute("data", al);
		req.getRequestDispatcher("display.jsp").forward(req, resp);
	}
}
