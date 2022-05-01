package com.jass.EsportsManagementDAO.services;

import java.util.List;
import java.util.Optional;

import com.jass.EsportsManagementDAO.entities.TeamMate;

public interface TeamMateService {

	TeamMate saveTeamMate(TeamMate teamMate);
	TeamMate updateTeamMate(TeamMate teamMate);
	Optional<TeamMate> fetchTeamMateById(int teamMateId);
	void deleteTeamMateById(int teamMateId);
	List<TeamMate> saveAllTeamMates(List<TeamMate> teamMates);
}
