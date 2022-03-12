package com.jass.EsportsManagementDAO.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jass.EsportsManagementDAO.entities.Tournament;

public interface TournamentRepository extends JpaRepository<Tournament, Integer> {

}
