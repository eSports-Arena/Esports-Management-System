package com.sovon9.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

public class Organizer {

	private int organizerId;
	private int organizerUserId;
	private String organizerSocialYt;
	private String organizerSocialInsta;
	private String organizerSocialTwitter;
	private List<Tournament> tournament;

	public Organizer() {
		super();
	}

	public Organizer(int organizerUserId, String organizerSocialYt, String organizerSocialInsta,
			String organizerSocialTwitter) {
		super();
		this.organizerUserId = organizerUserId;
		this.organizerSocialYt = organizerSocialYt;
		this.organizerSocialInsta = organizerSocialInsta;
		this.organizerSocialTwitter = organizerSocialTwitter;
	}

	public int getOrganizerId() {
		return organizerId;
	}

	public void setOrganizerId(int organizerId) {
		this.organizerId = organizerId;
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

	public List<Tournament> getTournament() {
		return tournament;
	}

	public void setTournament(List<Tournament> tournament) {
		this.tournament = tournament;
	}

	@Override
	public String toString() {
		return "Organizer [organizerId=" + organizerId + ", organizerUserId=" + organizerUserId + ", organizerSocialYt="
				+ organizerSocialYt + ", organizerSocialInsta=" + organizerSocialInsta + ", organizerSocialTwitter="
				+ organizerSocialTwitter + ", tournament=" + tournament + "]";
	}

}