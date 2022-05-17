package com.sovon9.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sovon9.model.TournamentDetailScrimType;
import com.sovon9.model.TournamentDetailtype;

@Controller
@RequestMapping("/organizer")
public class OrganizerController {

	static List<String> gameList = new ArrayList<>();
	static List<TournamentDetailtype> detailTypeList = new ArrayList<>();
	static List<TournamentDetailScrimType> detailScrimTyeList = new ArrayList<>();
	
	static {
		gameList.add("Select a game");
		gameList.add("PUBG");
		gameList.add("FF");
		gameList.add("DMC");
		
		detailTypeList.add(TournamentDetailtype.SOLO_MATCH);
		detailTypeList.add(TournamentDetailtype.MULTI_MACTH);
		
		detailScrimTyeList.add(TournamentDetailScrimType.FREE);
		detailScrimTyeList.add(TournamentDetailScrimType.PAID);
	}
	
	@GetMapping("/registerOrganizer")
	public String showOrganizerPage(Model model)
	{
		model.addAttribute("gameList", gameList);
		model.addAttribute("detailTypeList", detailTypeList);
		model.addAttribute("detailScrimTyeList", detailScrimTyeList);
		
		return "registerOrganizer";
	}
}
