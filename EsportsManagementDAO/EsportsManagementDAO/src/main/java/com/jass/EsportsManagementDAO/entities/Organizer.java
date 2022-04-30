package com.jass.EsportsManagementDAO.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "organizers")
public class Organizer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "organizer_id")
	private int organizerId;
	@Column(nullable = false, unique = true, name = "organizer_user_id")
	private int organizerUserId;
	@Column(name = "organizer_social_yt")
	private String organizerSocialYt;
	@Column(name = "organizer_social_insta")
	private String organizerSocialInsta;
	@Column(name = "organizer_social_twitter")
	private String organizerSocialTwitter;
	@OneToMany(mappedBy = "organizer", cascade = CascadeType.ALL, targetEntity = Tournament.class)
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

	

}
