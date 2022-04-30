package com.jass.EsportsManagementDAO.services;

import java.util.Optional;

import com.jass.EsportsManagementDAO.entities.Team;

public interface TeamService {

	Team saveTeam(Team team);
	Team updateTeam(Team team);
	Optional<Team> fetchTeamById(int teamId);
	Team fetchTeamByName(String teamName);
	void deleteTeamById(int teamId);
}
