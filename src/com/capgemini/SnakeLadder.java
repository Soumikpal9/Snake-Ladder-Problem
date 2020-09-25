package com.capgemini;

//UC2
public class SnakeLadder {
	//Constants
	public static final int NO_OF_PLAYERS = 1;
	public static final int INITIAL_POSITION = 0;
	public static void main(String[] args) {
		System.out.println("Welcome to Snake Ladder Game!!!");
		System.out.println("Player is at the starting position");
		//Computation
		int diceVal = ((int)Math.floor(Math.random() * 10) % 6) + 1;
		System.out.println("Player rolled : " + diceVal);
	}
}