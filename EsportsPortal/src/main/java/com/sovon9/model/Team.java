 package com.sovon9.model;

import java.util.List;

public class Team {

	private int teamId;
	private String teamName;
	private String teamLeaderName;
	private int teamLeaderUserId;
	private Game game;  // it better
	private Tournament tournament; // tournament id better
	private List<TeamMate> teamMates;

	public Team() {
		super();
	}

	public Team(String teamName, String teamLeaderName, int teamLeaderUserId) {
		super();
		this.teamName = teamName;
		this.teamLeaderName = teamLeaderName;
		this.teamLeaderUserId = teamLeaderUserId;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamLeaderName() {
		return teamLeaderName;
	}

	public void setTeamLeaderName(String teamLeaderName) {
		this.teamLeaderName = teamLeaderName;
	}

	public int getTeamLeaderUserId() {
		return teamLeaderUserId;
	}

	public void setTeamLeaderUserId(int teamLeaderUserId) {
		this.teamLeaderUserId = teamLeaderUserId;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Tournament getTournament() {
		return tournament;
	}

	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
	}

	public List<TeamMate> getTeamMates() {
		return teamMates;
	}

	public void setTeamMates(List<TeamMate> teamMates) {
		this.teamMates = teamMates;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", teamLeaderName=" + teamLeaderName
				+ ", teamLeaderUserId=" + teamLeaderUserId + ", game=" + game + ", tournament=" + tournament
				+ ", teamMates=" + teamMates + "]";
	}

}