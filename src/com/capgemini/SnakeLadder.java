package com.capgemini;

//UC4
public class SnakeLadder {
	//Constants
	public static final int NO_OF_PLAYERS = 1;
	public static final int INITIAL_POSITION = 0;
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static void main(String[] args) {
		//Variables
		int currPosition = INITIAL_POSITION;
		System.out.println("Welcome to Snake Ladder Game!!!");
		System.out.println("Player is at the starting position");
		//Computation
		while(currPosition < 100) {
			int diceVal = ((int)Math.floor(Math.random() * 10) % 6) + 1;
			System.out.println("Player rolled : " + diceVal);
			int actionTaken = (int)Math.floor(Math.random() * 10) % 3;
			if(actionTaken == NO_PLAY) {
				System.out.println("No action taken");
			}
			else if(actionTaken == LADDER) {
				currPosition += diceVal;
			}
			else {
				currPosition -= diceVal;
				if(currPosition < INITIAL_POSITION) {
					currPosition = INITIAL_POSITION;
				}
			}
			System.out.println("Player is at position : " + currPosition);
		}
		System.out.println("Player reaches the winning position");
	}
}