package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;
import com.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView model=new ModelAndView();
		model.addObject("data",userService.viewAllUser());
		model.setViewName("home");
		return model;
	}
	@RequestMapping("/home")
	public ModelAndView revhome() {
		ModelAndView model=new ModelAndView();
		model.addObject("data",userService.viewAllUser());
		model.setViewName("home");
		return model;
	}
	
	@RequestMapping("/userAdd")
	public ModelAndView addUserHome() {
		ModelAndView model=new ModelAndView();
		model.addObject("useradd",new User());
		model.setViewName("adduser");
		return model;
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/addUser")
	public ModelAndView addUserOrUpdate(@ModelAttribute("useradd") User user) {
		ModelAndView model=new ModelAndView();
		userService.addOrUpdateUser(user);
		model.setViewName("redirect:/");
		return model;
	}
	@RequestMapping("/deleteUser")
	public ModelAndView deleteUser(@RequestParam("did")int id) {
		ModelAndView model=new ModelAndView();
		userService.deleteUser(id);
		model.addObject("data",userService.viewAllUser());
		model.setViewName("home");
		return model;
	}
	@RequestMapping("/singleUser")
	public ModelAndView getUser(@RequestParam("sid") String user) {
		ModelAndView model=new ModelAndView();
		model.addObject("dt", userService.getUser(user));
		model.setViewName("userpro");
		return model;
	}
	@RequestMapping("/updateUser")
	public ModelAndView updateUser(@RequestParam("uid")int id) {
		ModelAndView model=new ModelAndView();
		model.addObject("useradd", userService.getById(id));
		model.addObject("data",userService.viewAllUser());
		model.setViewName("adduser");
		return model;
	}
}
