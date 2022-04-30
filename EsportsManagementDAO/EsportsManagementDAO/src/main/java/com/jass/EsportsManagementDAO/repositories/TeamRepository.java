package com.jass.EsportsManagementDAO.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jass.EsportsManagementDAO.entities.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

	Team findByTeamName(String teamName);
}
