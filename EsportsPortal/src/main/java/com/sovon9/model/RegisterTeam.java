package com.sovon9.model;

import java.util.List;

public class RegisterTeam {

	private String leaderName;
	private String teamName;
	private String email;
	private int pno;
	private int gameId;
	private int tournamentId;
	private List<TeamMate> teamMates;
	public RegisterTeam() {
		super();
	}
	public RegisterTeam(String leaderName, String teamName, String email, int pno, int gameId, int tournamentId,
			List<TeamMate> teamMates) {
		super();
		this.leaderName = leaderName;
		this.teamName = teamName;
		this.email = email;
		this.pno = pno;
		this.gameId = gameId;
		this.tournamentId = tournamentId;
		this.teamMates = teamMates;
	}
	public String getLeaderName() {
		return leaderName;
	}
	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public int getTournamentId() {
		return tournamentId;
	}
	public void setTournamentId(int tournamentId) {
		this.tournamentId = tournamentId;
	}
	public List<TeamMate> getTeamMates() {
		return teamMates;
	}
	public void setTeamMates(List<TeamMate> teamMates) {
		this.teamMates = teamMates;
	}
	@Override
	public String toString() {
		return "RegisterTeam [leaderName=" + leaderName + ", teamName=" + teamName + ", email=" + email + ", pno=" + pno
				+ ", gameId=" + gameId + ", tournamentId=" + tournamentId + ", teamMates=" + teamMates + "]";
	}
	
}
