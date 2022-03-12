package com.jass.EsportsManagementDAO.services;

import java.util.List;
import java.util.Optional;

import com.jass.EsportsManagementDAO.entities.Game;

public interface GameService {
	
	Game saveGame(Game game);
	List<Game> saveGames(List<Game> games);
	Game updateGame(Game game);
	List<Game> updateGames(List<Game> games);
	Optional<Game> fetchGameById(int id);
	Game fetchGameByName(String gameName);
	List<Game> fetchAllGames();
	void deleteGameById(int id);
	void deleteAllGames();
	Long deleteByGameName(String gameName);
}
