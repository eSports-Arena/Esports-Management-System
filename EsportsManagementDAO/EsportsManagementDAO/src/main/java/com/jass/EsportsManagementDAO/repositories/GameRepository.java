package com.jass.EsportsManagementDAO.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jass.EsportsManagementDAO.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer>{

	Game findByGameName(String gameName);
	Long deleteByGameName(String gameName);
}
