package com.jass.EsportsManagementDAO.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jass.EsportsManagementDAO.entities.TournamentDetail;
import com.jass.EsportsManagementDAO.repositories.TournamentDetailRepository;

@Service
public class TournamentDetailServiceImplement implements TournamentDetailService {

	@Autowired
	private TournamentDetailRepository tDetailRepo;

	@Override
	public TournamentDetail saveTournamentDetail(TournamentDetail tDetail)throws IllegalArgumentException {
		try {
			return tDetailRepo.save(tDetail);	
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Cannot add Tournament Details");
		}
	}

	@Override
	public TournamentDetail updateTournamentDetail(TournamentDetail tDetail)throws IllegalArgumentException {
		try {
			return tDetailRepo.save(tDetail);	
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Cannot update Tournament Details");
		}
	}

	@Override
	public Optional<TournamentDetail> fetchTournamentDetailById(int tDetailId)throws IllegalArgumentException {
		try {
			return tDetailRepo.findById(tDetailId);	
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Cannot find Tournament Details");
		}
	}

	@Override
	public void deleteTournamentDetailById(int tDetailId) {
		tDetailRepo.deleteById(tDetailId);
	}

}
