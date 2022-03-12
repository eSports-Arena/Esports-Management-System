package com.jass.EsportsManagementDAO.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jass.EsportsManagementDAO.entities.TournamentDetail;

public interface TournamentDetailRepository extends JpaRepository<TournamentDetail, Integer> {

}
