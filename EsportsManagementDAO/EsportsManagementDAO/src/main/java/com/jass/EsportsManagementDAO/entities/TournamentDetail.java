package com.jass.EsportsManagementDAO.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TournamentDetails")
public class TournamentDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "detail_id")
	private int tDetailId;
	@Column(name = "detail_type", nullable = false)
	private TournamentDetailtype tDetailtype;
	@Column(name = "detail_date_time")
	private LocalDateTime tDetailDateAndTime;
	@Column(name = "detail_duration_from")
	private LocalDate tDetailDurationFrom;
	@Column(name = "detail_duration_to")
	private LocalDate tDetailDurationTo;
	@Column(name = "detail_prize_pool", nullable = false)
	private double tDetailPrizePool;
	@Column(name = "detail_scrim_type", nullable = false)
	private TournamentDetailScrimType tDetailScrimType;
	@Column(name = "detail_slots", nullable = false)
	private int tDetailSlots;
	@Column(name = "detail_description", nullable = false)
	private String tDetailDescription;
	@OneToOne
	@JoinColumn(name = "tournamentdetail_tournament_id", nullable = false, referencedColumnName = "tournament_id")
	private Tournament tournament;

	public TournamentDetail() {
		super();
	}

	public TournamentDetail(TournamentDetailtype tDetailtype, LocalDateTime tDetailDateAndTime,
			LocalDate tDetailDurationFrom, LocalDate tDetailDurationTo, double tDetailPrizePool,
			TournamentDetailScrimType tDetailScrimType, int tDetailSlots, String tDetailDescription) {
		super();
		this.tDetailtype = tDetailtype;
		this.tDetailDateAndTime = tDetailDateAndTime;
		this.tDetailDurationFrom = tDetailDurationFrom;
		this.tDetailDurationTo = tDetailDurationTo;
		this.tDetailPrizePool = tDetailPrizePool;
		this.tDetailScrimType = tDetailScrimType;
		this.tDetailSlots = tDetailSlots;
		this.tDetailDescription = tDetailDescription;
	}

	public int gettDetailId() {
		return tDetailId;
	}

	public void settDetailId(int tDetailId) {
		this.tDetailId = tDetailId;
	}

	public TournamentDetailtype gettDetailtype() {
		return tDetailtype;
	}

	public void settDetailtype(TournamentDetailtype tDetailtype) {
		this.tDetailtype = tDetailtype;
	}

	public LocalDateTime gettDetailDateAndTime() {
		return tDetailDateAndTime;
	}

	public void settDetailDateAndTime(LocalDateTime tDetailDateAndTime) {
		this.tDetailDateAndTime = tDetailDateAndTime;
	}

	public LocalDate gettDetailDurationFrom() {
		return tDetailDurationFrom;
	}

	public void settDetailDurationFrom(LocalDate tDetailDurationFrom) {
		this.tDetailDurationFrom = tDetailDurationFrom;
	}

	public LocalDate gettDetailDurationTo() {
		return tDetailDurationTo;
	}

	public void settDetailDurationTo(LocalDate tDetailDurationTo) {
		this.tDetailDurationTo = tDetailDurationTo;
	}

	public double gettDetailPrizePool() {
		return tDetailPrizePool;
	}

	public void settDetailPrizePool(double tDetailPrizePool) {
		this.tDetailPrizePool = tDetailPrizePool;
	}

	public TournamentDetailScrimType gettDetailScrimType() {
		return tDetailScrimType;
	}

	public void settDetailScrimType(TournamentDetailScrimType tDetailScrimType) {
		this.tDetailScrimType = tDetailScrimType;
	}

	public int gettDetailSlots() {
		return tDetailSlots;
	}

	public void settDetailSlots(int tDetailSlots) {
		this.tDetailSlots = tDetailSlots;
	}

	public String gettDetailDescription() {
		return tDetailDescription;
	}

	public void settDetailDescription(String tDetailDescription) {
		this.tDetailDescription = tDetailDescription;
	}

	public Tournament getTournament() {
		return tournament;
	}

	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
	}

	
}
