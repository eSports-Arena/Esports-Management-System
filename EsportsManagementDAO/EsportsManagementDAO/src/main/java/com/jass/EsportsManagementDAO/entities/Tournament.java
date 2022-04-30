package com.jass.EsportsManagementDAO.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tournaments")
public class Tournament {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tournament_id")
	private int tournamentId;
	@Column(nullable = false, name = "tourament_name")
	private String tournamentName;
	@ManyToOne
	@JoinColumn(name = "tournament_organizer_id", nullable = false, referencedColumnName = "organizer_id")
	private Organizer organizer;
	@ManyToOne
	@JoinColumn(name = "tournament_game_id", nullable = false, referencedColumnName = "game_id")
	private Game game;
	@OneToOne(mappedBy = "tournament", cascade = CascadeType.ALL, targetEntity = TournamentDetail.class)
	private TournamentDetail tournamentDetail;
	@OneToOne(mappedBy = "tournament", cascade = CascadeType.ALL, targetEntity = Team.class)
	private Team team;

	public Tournament() {
		super();
	}

	public Tournament(String tournamentName) {
		super();
		this.tournamentName = tournamentName;
	}

	public int getTournamentId() {
		return tournamentId;
	}

	public void setTournamentId(int tournamentId) {
		this.tournamentId = tournamentId;
	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}


	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public TournamentDetail getTournamentDetail() {
		return tournamentDetail;
	}

	public void setTournamentDetail(TournamentDetail tournamentDetail) {
		this.tournamentDetail = tournamentDetail;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Organizer getOrganizer() {
		return organizer;
	}

	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
	}

	

}
