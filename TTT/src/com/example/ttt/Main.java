package com.example.ttt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	         Board b = new Board();
	         TurnController tc = new TurnController();
	         GameLogic gl = new GameLogic();
		     
	         Scanner sc = new Scanner(System.in);
        	 b.displayBoard();

	         do {
	        	 int c1;
	        	 int c2;
	        	 char activePlayer = tc.getActivePlayer();
	        	 do{
	        		 System.out.println("Player " + activePlayer + " Make Your Move! " + "Turn: " + tc.getTurn());
	        	 	
				 		System.out.println("Enter your X coordinate: ");
				 		while(!sc.hasNextInt()){
				 			System.out.println("Enter a Number Please!");
				 			sc.nextLine();
				 		}
				 		c1 = sc.nextInt();
				 		
				 		System.out.println("Enter your Y coordinate: ");
				 		while(!sc.hasNextInt()){
				 			System.out.println("Enter a Number Please!");
				 			sc.nextLine();
				 		}
				 		c2 = sc.nextInt();
	        	 }while(!gl.placeMark(c1, c2, b, activePlayer)); //while token hasn't been placed
	        	 b.displayBoard();
	        	 tc.iterateTurn();
	        	 tc.switchPlayer(); // change active player
		         
	         } while(!gl.checkIfWin() && !gl.boardFull(tc)); // while no win and board isn't full
	         
	         System.out.println("END");
	         // If statement to check if the board is full and there is no win = tie
	         if(!gl.checkIfWin() && gl.boardFull(tc)){
	        	 System.out.println("GAME OVER: IT'S a TIE!");
	         } else{
	        	 System.out.println("GAME OVER: Congratulations " + "Player You WIN!");
	         }
	         // else statement = congratulate winner!
	         
	 		
	 		sc.close();
	         
	         
	         
	         
	     
	}

}
