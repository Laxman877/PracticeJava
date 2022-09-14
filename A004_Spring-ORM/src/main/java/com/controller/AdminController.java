package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Admin;
import com.service.AdminService;
import com.service.UserService;

@Controller
public class AdminController {
	@Autowired
	AdminService adminService;
	@Autowired
	UserService userService;
	@RequestMapping("/adminsys")
	public ModelAndView adminlogin() {
		ModelAndView model=new ModelAndView();
		model.addObject("adminlogpro",new Admin());
		model.setViewName("adminlogin");
		return model;
	}
	@RequestMapping(value = "/adminlog",method = RequestMethod.POST)
	public ModelAndView adminLogin(@ModelAttribute("adminlogpro") Admin adlogin,HttpServletRequest req) {
		ModelAndView model=new ModelAndView();
		Admin admin=adminService.adminValidate(adlogin);
		if(admin==null) {
			model.addObject("error","Invalid UaerName Or Password..");
			model.setViewName("adminlogin");
		}else {
			HttpSession session=req.getSession();
			session.setAttribute("admin", admin.getUserName());
			model.addObject("data",adminService.getAllUser());
			model.setViewName("admindashboard");
		}
		return model;
	}
	@RequestMapping("/delete")
	public ModelAndView deleteUser(@RequestParam("did") int id) {
		ModelAndView model=new ModelAndView();
		userService.deleteUser(id);
		model.addObject("data",adminService.getAllUser());
		model.setViewName("admindashboard");
		return model;
	}
}
