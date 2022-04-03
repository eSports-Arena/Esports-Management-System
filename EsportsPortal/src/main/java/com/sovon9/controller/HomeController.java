package com.sovon9.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sovon9.model.Game;
import com.sovon9.model.Team;
import com.sovon9.model.User;
import com.sovon9.proxy.DaoProxy;
import com.sovon9.proxy.UserProxy;

@Controller
public class HomeController {

	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	public UserProxy userProxy;
	@Autowired
	public DaoProxy daoProxy;
	
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
	public String doSignup(@ModelAttribute("user") User user,HttpServletRequest request , HttpServletResponse response)
	{
		log.debug(".........................inside doSignUp.........................");
		String requestUrl = request.getRequestURI();
		System.out.println("++++++++++++++++++++++++++++"+user.toString());
		if(userProxy.doSignup(user, requestUrl)!=null)
		{
			return "SignUpSuccess";
		}
		return "";
	}
	
	@GetMapping(value = "/verify/{verify_code}")
	public String doVerifyEmail(@PathVariable(value = "verify_code") String verify_code)
	{
		log.debug(".........................inside doVerifyEmail.........................");
		if(userProxy.verifyEmail(verify_code))
		{
			return "VerificationSucessfull";
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
	
	@GetMapping(value = "/registerTeam")
	public String getRegisterTeamPage(@ModelAttribute("team") Team team)
	{
		return "RegisterTeam";
	}
	
	@GetMapping(value = "/do-registerteam")
	public String doRegisterTeam(@ModelAttribute("team") Team team, HttpSession httpSession)
	{
		Game game = team.getGame();
		game.setGameDescription("des");
		game.setGameNameAbr("about");
		String saveDetails = daoProxy.saveDetails(game);
		
		httpSession.setAttribute("condition", "true");
		httpSession.setAttribute("message", "Saved Successfully");
		return "RegisterTeam";
	}
	
}
