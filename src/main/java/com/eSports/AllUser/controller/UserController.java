package com.eSports.AllUser.controller;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eSports.AllUser.model.User;
import com.eSports.AllUser.model.VerificationCode;
import com.eSports.AllUser.service.SignupService;

import net.bytebuddy.utility.RandomString;

@RestController
public class UserController {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	@Autowired
	public SignupService signupService;	
	@Autowired
	public VerificationCode code;
	
	@PostMapping(value = "/do-signup")
	public User doSignup(@RequestBody User user,@RequestHeader String requestUrl)
	{
		log.debug(".........................inside doSignUp.........................");
		user.setPhnoVerified(false);
		user.setEmailVerified(false);
		signupService.saveUser(user);
		String emailVerCode = RandomString.make(10);
		code.setUserId(user.getUserId());
		code.setCode(emailVerCode);
		VerificationCode verificationCode = signupService.saveVerificationCode(code);
		if(verificationCode!=null)
		{
//			try {
//				signupService.sendVerificationMail(verificationCode, user, requestUrl);
//			} catch (UnsupportedEncodingException e) {
//				e.printStackTrace();
//			} catch (MessagingException e) {
//				e.printStackTrace();
//			}
			return user;
		}
		return null;
	}
		
	
//	@ResponseBody
//	@PostMapping(value = "/do-signup")
//	public String doSignup(@RequestHeader String name,@RequestHeader String requestUrl)
//	{
//		log.debug(".........................inside doSignUp.........................");
//		user.setPhnoVerified(false);
//		user.setEmailVerified(false);
//		System.out.println(signupService.saveUser(user));
//		String emailVerCode = RandomString.make(10);
//		code.setUserId(user.getUserId());
//		code.setCode(emailVerCode);
//		VerificationCode verificationCode = signupService.saveVerificationCode(code);
//		if(verificationCode!=null)
//		{
//			try {
//				signupService.sendVerificationMail(verificationCode, user, requestUrl);
//			} catch (UnsupportedEncodingException e) {
//				e.printStackTrace();
//			} catch (MessagingException e) {
//				e.printStackTrace();
//			}
//		}
//		return "SignUpSuccess";
//	}
	
	@GetMapping(value = "/verify/{verify_code}")
	public boolean verifyEmail(@PathVariable(value = "verify_code") String verify_code)
	{
		log.debug(".........................inside AllUser doVerifyEmail.........................");
//		if(!signupService.verifymail(verify_code))
//		{
//			return "VerificationFailed";
//		}
		return true;
	}

	
}
