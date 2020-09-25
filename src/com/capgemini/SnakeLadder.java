package com.capgemini;

public class SnakeLadder {
	//Constants
	public static final int NO_OF_PLAYERS = 1;
	public static final int INITIAL_POSITION = 0;
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static void main(String[] args) {
		//Variables
		int player1Pos = INITIAL_POSITION;
		int player2Pos = INITIAL_POSITION;
		int player1 = 1;
		System.out.println("Welcome to Snake Ladder Game!!!");
		System.out.println("Both players are at the starting position");
		//Computation
		while(player1Pos != 100 && player2Pos != 100) {
			if(player1 == 1) {
				int diceVal = ((int)Math.floor(Math.random() * 10) % 6) + 1;
				int actionTaken = (int)Math.floor(Math.random() * 10) % 3;
				if(actionTaken == NO_PLAY) {
					player1 = 0;
				}
				else if(actionTaken == LADDER) {
					player1Pos += diceVal;
					if(player1Pos > 100) {
						player1Pos -= diceVal;
					}
				}
				else {
					player1 = 0;
					player1Pos -= diceVal;
					if(player1Pos < INITIAL_POSITION) {
						player1Pos = INITIAL_POSITION;
					}
				}
			}
			else {
				int diceVal = ((int)Math.floor(Math.random() * 10) % 6) + 1;
				int actionTaken = (int)Math.floor(Math.random() * 10) % 3;
				if(actionTaken == NO_PLAY) {
					player1 = 1;
				}
				else if(actionTaken == LADDER) {
					player2Pos += diceVal;
					if(player2Pos > 100) {
						player2Pos -= diceVal;
					}
				}
				else {
					player1 = 1;
					player2Pos -= diceVal;
					if(player2Pos < INITIAL_POSITION) {
						player2Pos = INITIAL_POSITION;
					}
				}
			}
		}
		if(player1Pos == 100) {
			System.out.println("Player 1 won the game");
		}
		else {
			System.out.println("Player 2 won the game");
		}
	}
}