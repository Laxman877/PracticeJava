package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import model.User;

@WebServlet("/display")
public class DisplayData extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDao dao=new UserDao();
		HttpSession session = req.getSession();
		String email = (String)session.getAttribute("email");
		User data = dao.editByEmail(email);
		req.setAttribute("data", data);
		req.getRequestDispatcher("profile.jsp").forward(req, resp);
	}
}
