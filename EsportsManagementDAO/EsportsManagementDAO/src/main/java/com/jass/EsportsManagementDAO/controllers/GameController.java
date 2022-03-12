package com.jass.EsportsManagementDAO.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jass.EsportsManagementDAO.entities.Game;
import com.jass.EsportsManagementDAO.services.GameService;

@Controller
public class GameController {
	
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
			gameService.saveGame(game);
			session.setAttribute("condition", "true");
			session.setAttribute("message", "Saved Successfully");
			return "redirect:/";
		} 
		catch (IllegalArgumentException e) {
			System.out.println("Exception occured ---" + e);
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
		System.out.println("Inside updateDetails:"+game);
		return game;
	}
	
	@PostMapping("/updateDetails")
	public String updateDetails(@ModelAttribute Game game,HttpSession session)
	{
		try {
			System.out.println(game);
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
			System.out.println("Exception occured ---" + e);
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
			System.out.println(game);
			gameService.deleteByGameName(game.getGameName());
			System.out.println("Deleted game");
			session.setAttribute("condition", "true");
			session.setAttribute("message", "Deleted Successfully");
			return "redirect:/deleteGame";
			
		} 
		catch (IllegalArgumentException e) {
			System.out.println("Exception occured ---" + e);
			session.setAttribute("condition", "false");
			session.setAttribute("message", "Error Occured");
			return "redirect:/deleteGame";
		}
	}
}
