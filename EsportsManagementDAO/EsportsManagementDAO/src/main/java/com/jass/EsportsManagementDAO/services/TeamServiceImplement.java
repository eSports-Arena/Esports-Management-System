package com.jass.EsportsManagementDAO.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jass.EsportsManagementDAO.entities.Team;
import com.jass.EsportsManagementDAO.repositories.TeamRepository;

@Service
public class TeamServiceImplement implements TeamService {

	@Autowired
	private TeamRepository teamRepo;

	@Override
	public Team saveTeam(Team team)throws IllegalArgumentException {
		try {
			return teamRepo.save(team);
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Cannot add team");
		}
	}

	@Override
	public Team updateTeam(Team team)throws IllegalArgumentException {
		try {
			return teamRepo.save(team);
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Cannot update team");
		}
	}

	@Override
	public Optional<Team> fetchTeamById(int teamId)throws IllegalArgumentException {
		try {
			return teamRepo.findById(teamId);
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Cannot find team");
		}
	}

	@Override
	public void deleteTeamById(int teamId) {
		teamRepo.deleteById(teamId);	
	}

	@Override
	public Team fetchTeamByName(String teamName) {
		return teamRepo.findByTeamName(teamName);
	}
	

}
