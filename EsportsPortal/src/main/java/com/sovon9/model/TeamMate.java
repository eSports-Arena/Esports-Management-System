package com.sovon9.model;

public class TeamMate {

	private int teamMateId;
	private String teamMateName;
	private String teamMateEmail;
	private Team team;

	public TeamMate() {
		super();
	}

	public TeamMate(String teamMateName, String teamMateEmail) {
		super();
		this.teamMateName = teamMateName;
		this.teamMateEmail = teamMateEmail;
	}

	public int getTeamMateId() {
		return teamMateId;
	}

	public void setTeamMateId(int teamMateId) {
		this.teamMateId = teamMateId;
	}

	public String getTeamMateName() {
		return teamMateName;
	}

	public void setTeamMateName(String teamMateName) {
		this.teamMateName = teamMateName;
	}

	public String getTeamMateEmail() {
		return teamMateEmail;
	}

	public void setTeamMateEmail(String teamMateEmail) {
		this.teamMateEmail = teamMateEmail;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "TeamMate [teamMateId=" + teamMateId + ", teamMateName=" + teamMateName + ", teamMateEmail="
				+ teamMateEmail + ", team=" + team + "]";
	}

}