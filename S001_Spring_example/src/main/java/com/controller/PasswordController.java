package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Password;

@Controller
@RequestMapping("/password.jsp")
public class PasswordController {
	@Autowired
	Validator validator;
	
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}
	@RequestMapping(method = RequestMethod.GET)
	public String initForm(Model model) {
		Password password=new Password();
		model.addAttribute("password",password);
		return "password";
	}
}
