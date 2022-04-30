package com.jass.EsportsManagementDAO.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jass.EsportsManagementDAO.entities.Game;
import com.jass.EsportsManagementDAO.repositories.GameRepository;

@Service
public class GameServiceImplement implements GameService {

	@Autowired
	GameRepository gameRepo;

	@Override
	public Game saveGame(Game game)throws IllegalArgumentException
	{
		try {
			return gameRepo.save(game);
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Cannot add Game");
		}
	}
	
	@Override
	public List<Game> saveGames(List<Game> games)throws IllegalArgumentException
	{
		try {
			return gameRepo.saveAll(games);
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Cannot add Games.");
		}
	}
	
	@Override
	public Game updateGame(Game game) throws IllegalArgumentException
	{
		try {
			return gameRepo.save(game);
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Cannot update Game.");
		}
	}
	
	@Override
	public List<Game> updateGames(List<Game> games) throws IllegalArgumentException
	{
		try {
			return gameRepo.saveAll(games);
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Cannot update Games.");
		}
	}

	@Override
	public Optional<Game> fetchGameById(int id) throws IllegalArgumentException
	{
		try {
			return gameRepo.findById(id);
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Index is not found.");
		}
	}
	
	@Override
	public Game fetchGameByName(String gameName) throws IllegalArgumentException 
	{
		try {
			return gameRepo.findByGameName(gameName);
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Name is not found.");
		}	
		
	}
	
	@Override
	public List<Game> fetchAllGames() {
		return gameRepo.findAll();
	}

	@Override
	public void deleteGameById(int id)throws IllegalArgumentException 
	{
		try {
			gameRepo.deleteById(id);
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Id is not found.");
		}		
	}

	@Override
	public void deleteAllGames() {
		gameRepo.deleteAll();
	}
	
	@Override
	public Long deleteByGameName(String gameName) throws IllegalArgumentException 
	{
		try {
			return gameRepo.deleteByGameName(gameName);
		} 
		catch (Exception e) {
			throw new IllegalArgumentException("Name is not found.");
		}
	}

}
