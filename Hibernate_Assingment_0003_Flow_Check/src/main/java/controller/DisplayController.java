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

@WebServlet("/display")
public class DisplayController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDao dao=new UserDao();
		
		HttpSession session=req.getSession(false);
		String user=(String) session.getAttribute("user_email");
		
		User u=dao.getUser(user);
		req.setAttribute("dt", u);
		req.getRequestDispatcher("display.jsp").forward(req, resp);
	}
}
