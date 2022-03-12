package com.jass.EsportsManagementDAO.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.jass.EsportsManagementDAO.entities.TeamMate;
import com.jass.EsportsManagementDAO.repositories.TeamMateRepository;

public class TeamMateServiceImplement implements TeamMateService {

	@Autowired
	private TeamMateRepository tMateRepo;

	@Override
	public TeamMate saveTeamMate(TeamMate teamMate)throws IllegalArgumentException {
		try {
			return tMateRepo.save(teamMate);
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Cannot add Team Mate");
		}
	}

	@Override
	public TeamMate updateTeamMate(TeamMate teamMate)throws IllegalArgumentException {
		try {
			return tMateRepo.save(teamMate);
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Cannot add Team Mate");
		}
	}

	@Override
	public Optional<TeamMate> fetchTeamMateById(int teamMateId)throws IllegalArgumentException {
		try {
			return tMateRepo.findById(teamMateId);
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Cannot add Team Mate");
		}
	}

	@Override
	public void deleteTeamMateById(int teamMateId) {
			tMateRepo.deleteById(teamMateId);
	}

}
