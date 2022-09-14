package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReaderDao;
import model.Reader;
import model.Subscription;

@WebServlet("/addreader")
public class ReaderAdd extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer subid=Integer.parseInt(req.getParameter("subid"));
		String firstname=req.getParameter("firstname");
		String lastname=req.getParameter("lastname");
		String email=req.getParameter("email");
		
		Subscription sub=new Subscription();
		sub.setSubscriptionid(subid);
		
		Reader reader=new Reader();
		reader.setFirstName(firstname);
		reader.setLastName(lastname);
		reader.setEmail(email);
		
		ReaderDao dao=new ReaderDao();
		dao.aadReader(reader);
		req.setAttribute("msg1", "Reader added..");
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
