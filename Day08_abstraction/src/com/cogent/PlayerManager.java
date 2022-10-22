package com.cogent;

/**
 * @author samuelkawuma
 *Sep 28, 2022
 *10:36:32 AM
 */

public class PlayerManager {
	public static void main(String[] args) {
		new PlayerManager().getDailyExercise(new FootballPlayer());	
	}
	public void getDailyExercise(Players players) {
	
		
		players.warmUpExercise();
	}

}

