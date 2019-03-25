package com.example.ttt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	         Board b = new Board();
	         TurnController tc = new TurnController();
	         GameLogic gl = new GameLogic();
		     
	         Scanner sc = new Scanner(System.in);
	         
	         do {
	        	 b.displayBoard();
	        	 
	         } while(!gl.checkIfWin() && !gl.boardFull());
	         
	         // If statement to check if the board is full and there is no win = tie
	         // else statement = congratulate winner!
	         
	         char p = tc.getActivePlayer();
	         int t = tc.getTurn();
	         
	         System.out.println("Player " + p + " Make Your Move! " + "Turn: " + t);
	         
	        // b.displayBoard();
	         	 		
	 		System.out.println("Enter your First coordinate: ");
	 		int c1 = sc.nextInt();
	 		
	 		System.out.println("Enter your Second coordinate: ");
	 		int c2 = sc.nextInt();
	 		
	 		
	 		sc.close();
	         
	         
	         
	         
	     
	}

}
