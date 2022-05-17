package com.sovon9.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegisterOrganizer {

	private int organizerUserId;
	private String organizerSocialYt;
	private String organizerSocialInsta;
	private String organizerSocialTwitter;
	private String tournamentName;
	private int tournamentOrganizerId;
	private String gameName;
	private TournamentDetailtype tDetailtype;
	private LocalDateTime tDetailDateAndTime;
	private LocalDate tDetailDurationFrom;
	private LocalDate tDetailDurationTo;
	private double tDetailPrizePool;
	private TournamentDetailScrimType tDetailScrimType;
	private int tDetailSlots;
	private String tDetailDescription;

	public RegisterOrganizer(int organizerUserId, String organizerSocialYt, String organizerSocialInsta,
			String organizerSocialTwitter, String tournamentName, int tournamentOrganizerId, String gameName,
			TournamentDetailtype tDetailtype, LocalDateTime tDetailDateAndTime, LocalDate tDetailDurationFrom,
			LocalDate tDetailDurationTo, double tDetailPrizePool, TournamentDetailScrimType tDetailScrimType,
			int tDetailSlots, String tDetailDescription) {
		super();
		this.organizerUserId = organizerUserId;
		this.organizerSocialYt = organizerSocialYt;
		this.organizerSocialInsta = organizerSocialInsta;
		this.organizerSocialTwitter = organizerSocialTwitter;
		this.tournamentName = tournamentName;
		this.tournamentOrganizerId = tournamentOrganizerId;
		this.gameName = gameName;
		this.tDetailtype = tDetailtype;
		this.tDetailDateAndTime = tDetailDateAndTime;
		this.tDetailDurationFrom = tDetailDurationFrom;
		this.tDetailDurationTo = tDetailDurationTo;
		this.tDetailPrizePool = tDetailPrizePool;
		this.tDetailScrimType = tDetailScrimType;
		this.tDetailSlots = tDetailSlots;
		this.tDetailDescription = tDetailDescription;
	}

	public int getOrganizerUserId() {
		return organizerUserId;
	}

	public void setOrganizerUserId(int organizerUserId) {
		this.organizerUserId = organizerUserId;
	}

	public String getOrganizerSocialYt() {
		return organizerSocialYt;
	}

	public void setOrganizerSocialYt(String organizerSocialYt) {
		this.organizerSocialYt = organizerSocialYt;
	}

	public String getOrganizerSocialInsta() {
		return organizerSocialInsta;
	}

	public void setOrganizerSocialInsta(String organizerSocialInsta) {
		this.organizerSocialInsta = organizerSocialInsta;
	}

	public String getOrganizerSocialTwitter() {
		return organizerSocialTwitter;
	}

	public void setOrganizerSocialTwitter(String organizerSocialTwitter) {
		this.organizerSocialTwitter = organizerSocialTwitter;
	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public int getTournamentOrganizerId() {
		return tournamentOrganizerId;
	}

	public void setTournamentOrganizerId(int tournamentOrganizerId) {
		this.tournamentOrganizerId = tournamentOrganizerId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
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

	public RegisterOrganizer() {
		super();
	}

	@Override
	public String toString() {
		return "RegisterOrganizer [organizerUserId=" + organizerUserId + ", organizerSocialYt=" + organizerSocialYt
				+ ", organizerSocialInsta=" + organizerSocialInsta + ", organizerSocialTwitter="
				+ organizerSocialTwitter + ", tournamentName=" + tournamentName + ", tournamentOrganizerId="
				+ tournamentOrganizerId + ", gameName=" + gameName + ", tDetailtype=" + tDetailtype
				+ ", tDetailDateAndTime=" + tDetailDateAndTime + ", tDetailDurationFrom=" + tDetailDurationFrom
				+ ", tDetailDurationTo=" + tDetailDurationTo + ", tDetailPrizePool=" + tDetailPrizePool
				+ ", tDetailScrimType=" + tDetailScrimType + ", tDetailSlots=" + tDetailSlots + ", tDetailDescription="
				+ tDetailDescription + "]";
	}

}
