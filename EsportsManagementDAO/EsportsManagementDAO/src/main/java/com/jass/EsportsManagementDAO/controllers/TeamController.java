package com.jass.EsportsManagementDAO.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jass.EsportsManagementDAO.entities.Game;
import com.jass.EsportsManagementDAO.entities.RegisterTeam;
import com.jass.EsportsManagementDAO.entities.Team;
import com.jass.EsportsManagementDAO.entities.TeamMate;
import com.jass.EsportsManagementDAO.entities.Tournament;
import com.jass.EsportsManagementDAO.services.GameService;
import com.jass.EsportsManagementDAO.services.TeamMateService;
import com.jass.EsportsManagementDAO.services.TeamService;
import com.jass.EsportsManagementDAO.services.TournamentService;

@RestController
@RequestMapping("/team")
public class TeamController {

	private static final Logger log = LoggerFactory.getLogger(TeamController.class);
	@Autowired
	private TeamService teamService;
	@Autowired
	private TeamMateService teamMateService;
	@Autowired
	private GameService gameService;
	@Autowired
	private TournamentService tournamentService;

	@PostMapping("/save")
	public Team saveDetails(@RequestBody RegisterTeam rTeam, HttpSession session) {
		try {
			log.debug("..............inside TeamController:saveDetails..............");
			//Creating local objects to save in DB
			Team team = new Team();
			
			//Fetching data from DB
			Game game = gameService.fetchGameById(rTeam.getGameId()).get();
			Tournament tournament = tournamentService.fetchTournamentById(rTeam.getTournamentId()).get();
			
			//Setting Team 
			team.setTeamLeaderName(rTeam.getLeaderName());
			team.setTeamLeaderUserId(rTeam.getTeamLeaderUserId());
			team.setTeamName(rTeam.getTeamName());
			team.setGame(game);
			team.setTournament(tournament);
			
			//Saving Team in DB
			Team returnTeam = teamService.saveTeam(team);
			
			//Setting TeamMates
			List<TeamMate> tempTeamMates = rTeam.getTeamMates();
			for(TeamMate tMate : tempTeamMates)
			{
				tMate.setTeam(returnTeam);
			}
			
			//Saving TeamMates in DB			List<TeamMate> returnTeamMates = teamMateService.saveAllTeamMates(tempTeamMates);

			log.debug("..............Successfully Saved..............");
			
			//Returning data
			returnTeam.setTeamMates(returnTeamMates);
			
			return returnTeam;
		}
		catch (IllegalArgumentException e) {
			log.debug("Exception Occurred" + e);
			return null;
		}
	}
	
	@PostMapping("/update")
	public Team updateDetails(@RequestBody RegisterTeam rTeam, HttpSession session)
	{
		try {
			log.debug("..............inside TeamController:updateDetails..............");
			//Creating local objects to save in DB
			Team team = new Team();
			
			//Fetching data from DB
			team = teamService.fetchTeamByName(rTeam.getTeamName());
			
			//Setting new data into team
			team.setTeamLeaderName(rTeam.getLeaderName());			team.setTeamMates(rTeam.getTeamMates());
			
			System.out.println("Updated...");
			
			return teamService.saveTeam(team);
		} 
		catch (Exception e) {
			log.debug("Exception Occurred" + e);
			return null;
		}
	}
}