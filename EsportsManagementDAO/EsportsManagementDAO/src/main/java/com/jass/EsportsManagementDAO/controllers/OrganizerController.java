package com.jass.EsportsManagementDAO.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jass.EsportsManagementDAO.entities.Game;
import com.jass.EsportsManagementDAO.entities.Organizer;
import com.jass.EsportsManagementDAO.entities.RegisterOrganizer;
import com.jass.EsportsManagementDAO.entities.Tournament;
import com.jass.EsportsManagementDAO.entities.TournamentDetail;
import com.jass.EsportsManagementDAO.services.GameService;
import com.jass.EsportsManagementDAO.services.OrganizerService;
import com.jass.EsportsManagementDAO.services.TournamentDetailService;
import com.jass.EsportsManagementDAO.services.TournamentService;

@RestController
@RequestMapping("/organizer")
public class OrganizerController {

	@Autowired
	private OrganizerService organizerService;
	@Autowired
	private TournamentService tournamentService;
	@Autowired
	private TournamentDetailService tournamentDetailService;
	@Autowired
	private GameService gameService;

	@PostMapping("/save")
	public Organizer save(@RequestBody RegisterOrganizer rOrganizer, HttpSession session)
	{
		try {
			//Creating local objects to save in DB
			Organizer organizer = new Organizer();
			Tournament tournament = new Tournament();
			TournamentDetail tDetail = new TournamentDetail();
			
			//Fetching data from DB
			Game tempGame = gameService.fetchGameById(rOrganizer.getTournamentGameId()).get();
			
			//Setting Organizer 
			organizer.setOrganizerSocialInsta(rOrganizer.getOrganizerSocialInsta());
			organizer.setOrganizerSocialTwitter(rOrganizer.getOrganizerSocialTwitter());
			organizer.setOrganizerSocialYt(rOrganizer.getOrganizerSocialYt());
			organizer.setOrganizerUserId(rOrganizer.getOrganizerUserId());
			
			//Saving Organizer in DB
			Organizer returnOrganizer = organizerService.saveOrganizer(organizer);
			

			//Setting Tournament 
			tournament.setTournamentName(rOrganizer.getTournamentName());
			tournament.setGame(tempGame);
			tournament.setOrganizer(returnOrganizer);
			
			//Saving Tournament in DB
			Tournament returnTournament = tournamentService.saveTournament(tournament);
			
			//Setting Tournament Detail
			tDetail.settDetailDateAndTime(rOrganizer.gettDetailDateAndTime());
			tDetail.settDetailDescription(rOrganizer.gettDetailDescription());
			tDetail.settDetailDurationFrom(rOrganizer.gettDetailDurationFrom());
			tDetail.settDetailDurationTo(rOrganizer.gettDetailDurationTo());
			tDetail.settDetailPrizePool(rOrganizer.gettDetailPrizePool());
			tDetail.settDetailScrimType(rOrganizer.gettDetailScrimType());
			tDetail.settDetailSlots(rOrganizer.gettDetailSlots());
			tDetail.settDetailtype(rOrganizer.gettDetailtype());
			tDetail.setTournament(returnTournament);
			
			//Saving Tournament Detail in DB
			TournamentDetail returnDetail = tournamentDetailService.saveTournamentDetail(tDetail);
			
			System.out.println("Inserted successfully...");
			
			//Returning data
			returnTournament.setTournamentDetail(returnDetail);
			List<Tournament> tempTournaments = new ArrayList<Tournament>();
			tempTournaments.add(returnTournament);
			returnOrganizer.setTournament(tempTournaments);
			
			return returnOrganizer;
		} 
		catch (IllegalArgumentException e) {
			System.out.println("Exception Occurred...");
			return null;
		}
	}
	
	@GetMapping("/getOrganizers/{organizerId}")
	public Organizer getAll(@PathVariable Integer organizerId)
	{
		try {
			return organizerService.fetchOrganizerById(organizerId).get();
		} 
		catch (Exception e) {
			System.out.println("Exception Occurred...");
			return null;
		}
	}
	
}
