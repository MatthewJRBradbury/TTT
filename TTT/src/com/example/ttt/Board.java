package com.example.ttt;

public class Board {
	
	private char[][] board;
	
	public Board() {
	    board = new char[3][3]; 
	    for(int x = 0; x < board.length; x++){
	    	for(int y = 0; y < board.length; y++){
	    		board[x][y] = ' ';
	    	}
	    }
	}

    public void displayBoard(){
         System.out.println("   0  1  2 X");
         System.out.println("0 [" + board[0][0] + "]" + "[" + board[1][0] + "]" + "[" + board[2][0] + "]");
         System.out.println("1 [" + board[0][1] + "]" + "[" + board[1][1] + "]" + "[" + board[2][1] + "]");
         System.out.println("2 [" + board[0][2] + "]" + "[" + board[1][2] + "]" + "[" + board[2][2] + "]");
         System.out.println("Y");
         //System.out.println("Player O - Please Enter the Coordinates of your first turn")
    }

	public char[][] getBoard() {
		return board;
	}

	public void setBoard(char[][] board) {
		this.board = board;
	}
    
    
}
