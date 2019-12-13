package com.designpatterns.DesignPatternsEx.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamOperationsExercise implements DaoInterface{

	public static List<Player> players = Arrays.asList(new Player[] {
			new Player(1,"Venkatesh" , 300, 100000, 120 , "India"),
			new Player(2,"Anwesh" , 5, 450, 100 , "India"),
			new Player(3,"Jagadesh" , 10, 800, 98 , "USA"),
			new Player(4,"Bharath" , 8, 500, 80 , "London")
	});
	
	public List<Player> getAllPlayers(){
		return players;
	}
	
	public void displayPlayersForCountry(String country) {
		
		System.out.println("Players with highest score more than 100 and belongs to one country");
		players.stream()
		.filter(p-> p.getCountry().equalsIgnoreCase(country))
		.filter(p->p.getHighestScore()>100)
		.map(p -> p.getPlayerName())
		.forEach(System.out :: println);		
	}
	
	public void getPlayerNames() {
		System.out.println("Players with runs more than 500 and sorted with names");
		
		LinkedList<String> playerNames = players.stream()
				.filter(p -> p.getRuns()>500)
				.map(Player :: getPlayerName)
				.sorted((p1,p2) -> p2.compareToIgnoreCase(p1))
				.collect(Collectors.toCollection(LinkedList::new));
		playerNames.forEach(System.out :: println);
		//return playerNames;
	}
	
	@Override
	public void updatePlayer(Player player) {
		// TODO Auto-generated method stub
		players.get(player.getId()).setHighestScore(player.getHighestScore());
		System.out.println(player.getPlayerName() + "highest score updated");
	}

	@Override
	public void deletePlayer(Player player) {
		// TODO Auto-generated method stub
		List<Player> player1 = new ArrayList<Player>();
		player1.addAll(players);
		player1.remove(player);
		System.out.println(player.getPlayerName() + " removed");
		
	}
	
	/*static void getAverageRunsByCountry(String country) {
		double avgRuns = players.stream()
		       .filter(p -> p.getCountry().equalsIgnoreCase(country))
		       .mapToDouble(Player :: getRuns)
		       .average().orElse(Double.NaN);
		
		System.out.println("Average runs of the players of " + country + " are" + avgRuns);
	}
	
	static void getPlayerNamesSorted() {
		
		List<String> sortedPlayers = players.stream()
				                            .sorted((p1,p2) -> p1.getCountry().compareToIgnoreCase(p2.getCountry()))
				                            //.map(Player :: getMatchesPlayed)
				                            .sorted((p1,p2) -> p2.getMatchesPlayed() - p1.getMatchesPlayed())
				                            .map(Player :: getPlayerName)
				                            .collect(Collectors.toList());
				                            
		System.out.println(" Players after sorting by countey and MatchesPlayed");		                            
	    sortedPlayers.forEach(System.out :: println);
	}
	
	static void getPlayerCountry() {
		Map<String, String> map = players.stream()
				                 .filter(p -> p.getMatchesPlayed()>200)
				                 .collect(Collectors.toMap(Player :: getPlayerName, Player :: getCountry));
		
		System.out.println("data in the map " + map);
		
	}
	
	static void getMaxRunsPlayer() {
		Integer maxRunPlayer = players.stream()
				                      .map(Player :: getRuns) 
				                      .max(Integer :: compare)
				                      .get();
		
		System.out.println("Player who scored max runs is ");
				        players.stream().filter(p -> p.getRuns()==maxRunPlayer)
				                        .map(Player :: getPlayerName)
				                        .forEach(System.out :: println);
				                     
	}
	
	static void findPlayer(String name, String country) {
		
		System.out.println("details of given player and country are");
	players.stream().filter(p -> p.getPlayerName().equalsIgnoreCase(name))
		                .filter(p -> p.getCountry().equalsIgnoreCase(country))		                
		                .forEach(System.out :: println);
	
	}
	
	static void checkHighScorerByCountry(String country) {
		
		boolean status = players.stream().filter(p -> p.getCountry().equalsIgnoreCase(country))				                
				                .anyMatch(p -> p.getRuns()>10000);
		System.out.println(" the boolean result is" + status);
	}
	
	
	public static void main(String[] args) {
		displayPlayers();
		displayPlayersForCountry("India");
		getMaxRunsPlayer();
		getPlayerCountry();
		findPlayer("Venkatesh", "India");
		checkHighScorerByCountry("india");
		getPlayerNamesSorted();
		getAverageRunsByCountry("India");
		getPlayerNames();
	}*/

}
