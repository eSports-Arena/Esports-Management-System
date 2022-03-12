package com.jass.EsportsManagementDAO.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jass.EsportsManagementDAO.entities.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {

}
