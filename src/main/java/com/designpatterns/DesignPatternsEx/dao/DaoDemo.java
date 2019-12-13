package com.designpatterns.DesignPatternsEx.dao;

public class DaoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StreamOperationsExercise daoimpl = new StreamOperationsExercise();
		daoimpl.getAllPlayers().forEach(p->{
			System.out.println("playername " + p.getPlayerName()+ "Belongs to " + p.getCountry() + "Played " + p.getMatchesPlayed() + "mathes");	
		});
		
		Player p = daoimpl.getAllPlayers().get(0);
		p.setHighestScore(125);
		daoimpl.updatePlayer(p);
		daoimpl.displayPlayersForCountry("india");
		daoimpl.deletePlayer(daoimpl.getAllPlayers().get(2));
		
	}

}
