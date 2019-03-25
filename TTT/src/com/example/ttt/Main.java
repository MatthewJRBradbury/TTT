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
	        	 int c1;
	        	 int c2;
	        	 char activePlayer = tc.getActivePlayer();
	        	 do{
	        		 System.out.println("Player " + activePlayer + " Make Your Move! " + "Turn: " + tc.getTurn());
	        	 		
				 		System.out.println("Enter your X coordinate: ");
				 		c1 = sc.nextInt();
				 		
				 		System.out.println("Enter your Y coordinate: ");
				 		c2 = sc.nextInt();
	        	 }while(!gl.placeMark(c1, c2, b, activePlayer)); //while token hasn't been placed
	        	 tc.switchPlayer(); // change active player
		         
	         } while(!gl.checkIfWin() && !gl.boardFull()); // while no win and board isn't full
	         
	         // If statement to check if the board is full and there is no win = tie
	         // else statement = congratulate winner!
	         
	 		
	 		sc.close();
	         
	         
	         
	         
	     
	}

}
