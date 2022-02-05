package com.healthasyst.player;

public class League {
	public static void main(String[] args) {
		
	
	Player player1=new Player();
	player1.playerName="Raina";
	
	Player player2=new Player();
	player2.playerName="John";
	
	Player player3=new Player();
	player3.playerName="Dhoni";
	
	Player[] team1Players=new Player[3];
	team1Players[0]=player1;
	team1Players[1]=player2;
	team1Players[2]=player3;
	
	Team team1=new Team();
	team1.teamName="CSK";
	team1.playerArray=team1Players;
	
	Player player4=new Player();
	player4.playerName="Kholi";
	Player player5=new Player();
	player5.playerName="Kaif";
	Player player6=new Player();
	player6.playerName="Yuvi";
	
	Player[] team2Player= {player4,player5,player6};
	
	Team team2=new Team();
	team2.teamName="RCB";
	team2.playerArray=team2Player;
	
	System.out.println("Team 1 Name: "+team1.teamName);
	System.out.println("Team 1 players name are");
	//for each loop to print all player name from team1.playerArray
	for(Player p : team1.playerArray)
	{
		System.out.println(p.playerName);
	}
}}
