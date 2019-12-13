package com.designpatterns.DesignPatternsEx.dao;

import java.util.LinkedList;
import java.util.List;

public interface DaoInterface {

	List<Player> getAllPlayers();
	void getPlayerNames();
	void displayPlayersForCountry(String country);
	void updatePlayer(Player player);
	void deletePlayer(Player player);
}
