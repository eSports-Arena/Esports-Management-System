package com.jass.EsportsManagementDAO.services;

import java.util.Optional;

import com.jass.EsportsManagementDAO.entities.Organizer;

public interface OrganizerService {

	Organizer saveOrganizer(Organizer organizer);
	Organizer updateOrganizer(Organizer organizer);
	Optional<Organizer> fetchOrganizerById(int organizerId);
	void deleteOrganizerById(int organizerId);
}
