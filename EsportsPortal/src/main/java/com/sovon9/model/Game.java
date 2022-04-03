package com.sovon9.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


public class Game {

	private int gameId;
	private String gameName;
	private String gameNameAbr;
	private String gameDescription;
	private List<Tournament> tournaments;
	private Team team;

	public Game() {
		super();
	}

	public Game(String gameName, String gameNameAbr, String gameDescription) {
		super();
		this.gameName = gameName;
		this.gameNameAbr = gameNameAbr;
		this.gameDescription = gameDescription;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameNameAbr() {
		return gameNameAbr;
	}

	public void setGameNameAbr(String gameNameAbr) {
		this.gameNameAbr = gameNameAbr;
	}

	public String getGameDescription() {
		return gameDescription;
	}

	public void setGameDescription(String gameDescription) {
		this.gameDescription = gameDescription;
	}

	public List<Tournament> getTournaments() {
		return tournaments;
	}

	public void setTournaments(List<Tournament> tournaments) {
		this.tournaments = tournaments;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Game [gameId=" + gameId + ", gameName=" + gameName + ", gameNameAbr=" + gameNameAbr
				+ ", gameDescription=" + gameDescription + ", tournaments=" + tournaments + ", team=" + team + "]";
	}

}