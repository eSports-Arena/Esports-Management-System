package com.sovon9.model;

public class Tournament {

	private int tournamentId;
	private String tournamentName;
	private Organizer organizer;
	private Game game;
	private TournamentDetail tournamentDetail;
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

	public Organizer getOrganizer() {
		return organizer;
	}

	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
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

	@Override
	public String toString() {
		return "Tournament [tournamentId=" + tournamentId + ", tournamentName=" + tournamentName + ", organizer="
				+ organizer + ", game=" + game + ", tournamentDetail=" + tournamentDetail + ", team=" + team + "]";
	}

}