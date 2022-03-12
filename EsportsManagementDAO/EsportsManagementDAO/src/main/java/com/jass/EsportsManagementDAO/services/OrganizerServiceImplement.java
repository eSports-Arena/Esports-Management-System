package com.jass.EsportsManagementDAO.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.jass.EsportsManagementDAO.entities.Organizer;
import com.jass.EsportsManagementDAO.repositories.OrganizerRepository;

public class OrganizerServiceImplement implements OrganizerService {

	@Autowired
	private OrganizerRepository organizerRepo;
	
	@Override
	public Organizer saveOrganizer(Organizer organizer) throws IllegalArgumentException
	{
		try {
			return organizerRepo.save(organizer);
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Cannot add organizer");
		}
	}

	@Override
	public Organizer updateOrganizer(Organizer organizer)throws IllegalArgumentException
	{
		try {
			return organizerRepo.save(organizer);
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Cannot add organizer");
		}
	}

	@Override
	public Optional<Organizer> fetchOrganizerById(int organizerId)throws IllegalArgumentException
	{
		try {
			return organizerRepo.findById(organizerId);
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Cannot add organizer");
		}
	}

	@Override
	public void deleteOrganizerById(int organizerId)throws IllegalArgumentException
	{
		try {
			organizerRepo.deleteById(organizerId);
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Cannot add organizer");
		}
	}

}
