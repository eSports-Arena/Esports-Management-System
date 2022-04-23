package com.eSports.AllUser.controller;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eSports.AllUser.model.User;
import com.eSports.AllUser.model.VerificationCode;
import com.eSports.AllUser.service.SignupService;

import net.bytebuddy.utility.RandomString;

@RestController
public class HomeController {

	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	public SignupService signupService;	
	@Autowired
	public VerificationCode code;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String getHome()
	{
		return "home";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String getSignupPage(@ModelAttribute("user") User user)
	{
		
		return "SignUp";
	}
	
	@PostMapping(value = "/do-signup")
	public User doSignup(@RequestBody User user,@RequestHeader String requestUrl) throws UnsupportedEncodingException, MessagingException
	{
		log.debug(".........................inside doSignUp.........................");
		System.out.println(signupService.saveUser(user));
		String emailVerCode = RandomString.make(10);
		code.setUserId(user.getUserId());
		code.setCode(emailVerCode);
		VerificationCode verificationCode = signupService.saveVerificationCode(code);
		if(verificationCode!=null)
		{
			signupService.sendVerificationMail(verificationCode, user, requestUrl);
		}
		User user2 = signupService.saveUser(user);
		return user2;
	}
	
	@GetMapping(value = "/verify/{verify_code}")
	public String doVerifyEmail(@PathVariable(value = "verify_code") String verify_code)
	{
		log.debug(".........................inside doVerifyEmail.........................");
		if(!signupService.verifymail(verify_code))
		{
			return "VerificationFailed";
		}
		return "VerificationSucessfull";
	}
	
	@GetMapping(value = "/about")
	public String getAbout()
	{
		return "About";
	}
	
	@GetMapping(value = "/teams")
	public String getTeams()
	{
		return "Teams";
	}
	
}
