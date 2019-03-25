package com.example.ttt;

public class GameLogic {

	public boolean checkIfWin() {
		return false; // check rows columns and diagonals
		
	}
	
	public boolean boardFull() {
		return false; // check if any cells empty
		
	}
	
	public boolean placeMark(int x, int y, Board b, char activePlayer) {
		char gb[][] = b.getBoard();
		gb[x][y] = activePlayer;
		
		b.setBoard(gb);
		
		return true;
	}
}
