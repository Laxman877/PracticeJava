package com.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;
import com.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	@RequestMapping("/usersys")
	public ModelAndView userReg() {
		ModelAndView model=new ModelAndView();
		model.addObject("userreg",new User());
		//model.addObject("msg","Registration successfull..");
		model.setViewName("registration");
		return model;
	}
	@RequestMapping("/userlog")
	public ModelAndView userlog() {
		ModelAndView model=new ModelAndView();
		model.addObject("userlogpro",new User());
		model.setViewName("login");
		return model;
	}
	@RequestMapping(value = "/reguser",method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("userreg") User user,@RequestParam CommonsMultipartFile file,HttpSession session) {
		
		String path=session.getServletContext().getRealPath("/WEB-INF/image");
		String filepath=path+File.separator+file.getOriginalFilename();
		System.out.println(filepath);
		File f=new File(path);
		if(!f.exists()) {
			f.mkdir();
		}
		byte b[]=file.getBytes();
		
		try {
			FileOutputStream fos=new FileOutputStream(new File(filepath));
			fos.write(b);
			fos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ModelAndView model=new ModelAndView();
		user.setProfile_pic(file.getOriginalFilename());
		userService.addOrUpdateUser(user);
		model.addObject("msg","Registration successfull..");
		model.setViewName("redirect:usersys");
		return model;
	}
	@RequestMapping(value = "/loguser",method = RequestMethod.POST)
	public ModelAndView loginUser(@ModelAttribute("userlogpro") User login,HttpServletRequest req,String user1) {
		
		ModelAndView model=new ModelAndView();
		User user=userService.validate(login);
		if(user==null) {
			model.addObject("error","Invalid UserName Or password");
			model.setViewName("login");
		}else {
			HttpSession session=req.getSession();
			session.setAttribute("user", user.getFirstName());
			userService.getUser(user1);
			session.setAttribute("dt", user);
			model.setViewName("profile");
		}
		return model;
	}
	@RequestMapping("/userLogout")
	public String userlogout(HttpServletRequest req) {
		HttpSession session=req.getSession(false);
		session.invalidate();
		return "redirect:userlog";
	}
}
