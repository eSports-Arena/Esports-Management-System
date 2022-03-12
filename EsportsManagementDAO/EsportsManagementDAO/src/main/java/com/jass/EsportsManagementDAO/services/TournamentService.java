package com.jass.EsportsManagementDAO.services;

import java.util.Optional;

import com.jass.EsportsManagementDAO.entities.Tournament;

public interface TournamentService {

	Tournament saveTournament(Tournament tournament);
	Tournament updateTournament(Tournament tournament);
	Optional<Tournament> fetchTournamentById(int tournamentId);
	void deleteTournamentById(int tournamentId);
}
