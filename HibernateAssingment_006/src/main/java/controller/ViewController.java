package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReaderDao;
@WebServlet("/viewadd")
public class ViewController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ReaderDao dao=new ReaderDao();
		
		req.setAttribute("data", dao.viewAllSubscrib());
		req.setAttribute("rdata", dao.viewAllReader());
		req.getRequestDispatcher("reader.jsp").forward(req, resp);
	}
}
