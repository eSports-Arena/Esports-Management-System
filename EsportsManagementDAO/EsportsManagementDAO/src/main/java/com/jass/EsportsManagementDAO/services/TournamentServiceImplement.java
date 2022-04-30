package com.jass.EsportsManagementDAO.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jass.EsportsManagementDAO.entities.Tournament;
import com.jass.EsportsManagementDAO.repositories.TournamentRepository;

@Service
public class TournamentServiceImplement implements TournamentService {

	@Autowired
	private TournamentRepository tournamentRepo;

	@Override
	public Tournament saveTournament(Tournament tournament)throws IllegalArgumentException {
		try {
			return tournamentRepo.save(tournament);
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Cannot add Tournament");
		}
	}

	@Override
	public Tournament updateTournament(Tournament tournament)throws IllegalArgumentException {
		try {
			return tournamentRepo.save(tournament);
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Cannot update Tournament");
		}
	}

	@Override
	public Optional<Tournament> fetchTournamentById(int tournamentId)throws IllegalArgumentException {
		try {
			return tournamentRepo.findById(tournamentId);
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Cannot find tournament id");
		}
	}

	@Override
	public void deleteTournamentById(int tournamentId) {
		tournamentRepo.deleteById(tournamentId);;
	}

}
