package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;

@WebServlet("/edit")
public class EditController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action=req.getParameter("action");
		int uid=Integer.parseInt(req.getParameter("uid"));
		UserDao dao=new UserDao();
		User u=dao.editById(uid);
		req.setAttribute("data", u);
		req.getRequestDispatcher("edit.jsp").forward(req, resp);
	}
}
