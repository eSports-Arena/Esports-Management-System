package com.sovon9.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TournamentDetail {

	private int tDetailId;
	private TournamentDetailtype tDetailtype;
	private LocalDateTime tDetailDateAndTime;
	private LocalDate tDetailDurationFrom;
	private LocalDate tDetailDurationTo;
	private double tDetailPrizePool;
	private TournamentDetailScrimType tDetailScrimType;
	private int tDetailSlots;
	private String tDetailDescription;
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

	@Override
	public String toString() {
		return "TournamentDetail [tDetailId=" + tDetailId + ", tDetailtype=" + tDetailtype + ", tDetailDateAndTime="
				+ tDetailDateAndTime + ", tDetailDurationFrom=" + tDetailDurationFrom + ", tDetailDurationTo="
				+ tDetailDurationTo + ", tDetailPrizePool=" + tDetailPrizePool + ", tDetailScrimType="
				+ tDetailScrimType + ", tDetailSlots=" + tDetailSlots + ", tDetailDescription=" + tDetailDescription
				+ ", tournament=" + tournament + "]";
	}

}