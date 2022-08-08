package com;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/reg")
public class ValiateFilter extends HttpFilter{
	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String mobile=request.getParameter("mobile");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		if(fname==""||fname==null) {
			request.setAttribute("fnameE", "First Name Cannot be blank");
			rd.forward(request, response);
		}else if(!LetterValidation.letterCheck(fname)){
			request.setAttribute("fnameE", "Only Letters allowed");
			rd.forward(request, response);
		}
		if(lname==""||lname==null) {
			request.setAttribute("lnameE", "Last Name Cannot be blank");
			rd.forward(request, response);
		}else if(!CharValidation.charCheck(lname)){
			request.setAttribute("lnameE", "Only Letters allowed");
			rd.forward(request, response);
		}
		if(mobile==""||mobile==null) {
			request.setAttribute("mobileE", "Mobile number Cannot be blank");
			rd.forward(request, response);
		}else if(!NumberValidation.numCheck(mobile)){
			request.setAttribute("mobileE", "Please enter valid mobile");
			rd.forward(request, response);
		}
		if(email==""||email==null) {
			request.setAttribute("emailE", "Email Cannot be blank");
			rd.forward(request, response);
		}else if(!EmailValidation.emailCheck(email)) {
			request.setAttribute("emailE", "Invalid Email Format");
			rd.forward(request, response);
		}
		if(pass==""||pass==null) {
			request.setAttribute("passE", "Password Cannot be blank");
			rd.forward(request, response);
		}else if(!PasswordValidation.passCheck(pass)) {
			request.setAttribute("passE", "Required 1 capital,1 small,1 Digit and 1 special character!");
			rd.forward(request, response);	
		}
		chain.doFilter(request, response);
	}
}
