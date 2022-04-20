package com.eSports.AllUser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SingninController {

	@GetMapping(value = "/login")
	public String dologin()
	{
		return "login";
	}
	
}
