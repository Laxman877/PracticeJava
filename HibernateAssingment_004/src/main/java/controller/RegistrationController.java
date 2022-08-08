package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import model.Address;
import model.Student;

@WebServlet("/reg")
public class RegistrationController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int uid=0;
		String stid=req.getParameter("stid");
		String std_name=req.getParameter("std_name");
		String street=req.getParameter("street");
		String city=req.getParameter("city");
		String state=req.getParameter("state");
		String zipcode=req.getParameter("zipcode");
		if(!stid.equals("")) {
			uid=Integer.parseInt(stid);
		}
		Address adr=new Address();
		adr.setStreet(street);
		adr.setCity(city);
		adr.setState(state);
		adr.setZipcode(zipcode);
		
		Student st=new Student();
		st.setId(uid);
		st.setStd_name(std_name);
		st.setAddress(adr);
		
		StudentDao dao=new StudentDao();
		dao.regStudent(st);
		req.setAttribute("msg", "Registration Successfull!!");
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
