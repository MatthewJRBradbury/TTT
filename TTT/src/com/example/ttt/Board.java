package com.example.ttt;

public class Board {
    char[][] board = new char[3][3]; 

    public void displayBoard(){
         
         System.out.println("[" + board[0][0] + "]" + "[" + board[1][0] + "]" + "[" + board[2][0] + "]");
         System.out.println("[" + board[0][1] + "]" + "[" + board[1][1] + "]" + "[" + board[2][1] + "]");
         System.out.println("[" + board[0][2] + "]" + "[" + board[1][2] + "]" + "[" + board[2][2] + "]");
         //System.out.println("Player O - Please Enter the Coordinates of your first turn")
    }
    
    
}
