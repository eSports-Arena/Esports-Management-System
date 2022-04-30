package com.jass.EsportsManagementDAO.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "teammates")
public class TeamMate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "team_mate_id")
	private int teamMateId;
	@Column(name = "team_mate_name", nullable = false)
	private String teamMateName;
	@Column(name = "team_mate_email")
	private String teamMateEmail;
	@ManyToOne
	@JoinColumn(name = "team_mate_team_id", nullable = false, referencedColumnName = "team_id")
	private Team team;

	public TeamMate() {
		super();
	}
	
	public TeamMate(String teamMateName, Team team) {
		super();
		this.teamMateName = teamMateName;
		this.team = team;
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
