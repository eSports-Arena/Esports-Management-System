package com.jass.EsportsManagementDAO.services;

import java.util.Optional;

import com.jass.EsportsManagementDAO.entities.TournamentDetail;

public interface TournamentDetailService {

	TournamentDetail saveTournamentDetail(TournamentDetail tDetail);
	TournamentDetail updateTournamentDetail(TournamentDetail tDetail);
	Optional<TournamentDetail> fetchTournamentDetailById(int tDetailId);
	void deleteTournamentDetailById(int tDetailId);
}
