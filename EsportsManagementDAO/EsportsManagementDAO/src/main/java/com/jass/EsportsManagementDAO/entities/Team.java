package com.jass.EsportsManagementDAO.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "teams")
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "team_id")
	private int teamId;
	@Column(name = "team_name", nullable = false,unique = true)
	private String teamName;
	@Column(name = "team_leader_name", nullable = false)
	private String teamLeaderName;
	@Column(name = "team_leader_user_id", nullable = false)
	private int teamLeaderUserId;
	@OneToOne
	@JoinColumn(name = "team_game_id", nullable = false, referencedColumnName = "game_id")
	private Game game;
	@OneToOne
	@JoinColumn(name = "team_tournament_id", nullable = false, referencedColumnName = "tournament_id")
	private Tournament tournament;
	@OneToMany(mappedBy = "team", cascade = CascadeType.ALL, targetEntity = TeamMate.class)
	private List<TeamMate> teamMates;

	public Team() {
		super();
	}

	public Team(String teamName, String teamLeaderName, int teamLeaderUserId, Game game, Tournament tournament) {
		super();
		this.teamName = teamName;
		this.teamLeaderName = teamLeaderName;
		this.teamLeaderUserId = teamLeaderUserId;
		this.game = game;
		this.tournament = tournament;
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
