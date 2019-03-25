package com.example.ttt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//private char playerO = 'O';
	     //private char playerX = 'X';
		
	         Board b = new Board();
	         
	         TurnController tc = new TurnController(0, 'O');
	         char p = tc.getActivePlayer();
	         int t = tc.getTurn();
	         
	         System.out.println("Player " + p + " Make Your Move! " + "Turn: " + t);
	         
	         b.displayBoard();
	         
	        Scanner sc = new Scanner(System.in);
	 		
	 		System.out.println("Enter your First coordinate: ");
	 		int c1 = sc.nextInt();
	 		
	 		System.out.println("Enter your Second coordinate: ");
	 		int c2 = sc.nextInt();
	 		
	 		
	 		sc.close();
	         
	         
	         
	         
	     
	}

}
