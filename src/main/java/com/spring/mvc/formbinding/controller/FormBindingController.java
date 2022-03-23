package com.spring.mvc.formbinding.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.mvc.formbinding.model.User;

@Controller
public class FormBindingController {

	@GetMapping(value = { "/login", "/register" })
	public String loadForm() {
		return "registration";
	}

	@PostMapping("/saveDetails")
	public String saveDetails(User user, Model model) {

		model.addAttribute("msg", "User Details save successfully..!!");
		model.addAttribute("date", new Date());
         model.addAttribute("user", user);
		System.out.println(user);

		return "submit";
	}

}
