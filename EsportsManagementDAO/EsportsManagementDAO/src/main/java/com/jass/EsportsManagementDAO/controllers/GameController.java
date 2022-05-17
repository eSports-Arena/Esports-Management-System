package com.jass.EsportsManagementDAO.controllers;


import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jass.EsportsManagementDAO.entities.Game;
import com.jass.EsportsManagementDAO.services.GameService;


@Controller
public class GameController {
	
	private static final Logger log = LoggerFactory.getLogger(GameController.class);
	@Autowired
	private GameService gameService;

	@GetMapping("/")
	public String home()
	{
		return "index";
	}
	
	@PostMapping("/save")
	public String saveDetails(@ModelAttribute Game game,HttpSession session)
	{
		try {
			log.debug(".........................inside saveDetails.........................");
			gameService.saveGame(game);
			session.setAttribute("condition", "true");
			session.setAttribute("message", "Saved Successfully");
			return "redirect:/";
		} 
		catch (IllegalArgumentException e) {
			log.debug("Exeption in saveDetails" + e);
			session.setAttribute("condition", "false");
			session.setAttribute("message", "Error Occured");
			return "redirect:/";
		}
	}
	
	@GetMapping("/update")
	public String updateDetails()
	{
		return "update";
	}
	
	@PostMapping("/getDetails/{gameName}")
	public @ResponseBody Game updateDetails(@PathVariable String gameName,@ModelAttribute Game game)
	{
		game = gameService.fetchGameByName(gameName);
		return game;
	}
	
	@PostMapping("/updateDetails")
	public String updateDetails(@ModelAttribute Game game,HttpSession session)
	{
		try {
			log.debug(".........................inside updateDetails.........................");
			String tempGameName = game.getGameName();
			Game tempGame = gameService.fetchGameByName(tempGameName);
			tempGame.setGameDescription(game.getGameDescription());
			tempGame.setGameName(game.getGameName());
			tempGame.setGameNameAbr(game.getGameNameAbr());
			gameService.saveGame(tempGame);
			session.setAttribute("condition", "true");
			session.setAttribute("message", "Saved Successfully");
			return "redirect:/";
		} 
		catch (IllegalArgumentException e) {
			log.debug("Exception Occurred" + e);
			session.setAttribute("condition", "false");
			session.setAttribute("message", "Error Occured");
			return "redirect:/";
		}
	}
	
	@GetMapping("/delete")
	public String deletePage()
	{
		return "delete";
	}
	
	@PostMapping("/deleteGame")
	public String deleteGame(@ModelAttribute Game game,HttpSession session)
	{
		try {
			log.debug(".........................inside deleteGame.........................");
			gameService.deleteByGameName(game.getGameName());
			System.out.println("Deleted game");
			session.setAttribute("condition", "true");
			session.setAttribute("message", "Deleted Successfully");
			return "redirect:/deleteGame";
			
		} 
		catch (IllegalArgumentException e) {
			log.debug("Exception Occurred" + e);
			session.setAttribute("condition", "false");
			session.setAttribute("message", "Error Occured");
			return "redirect:/deleteGame";
		}
	}
}
