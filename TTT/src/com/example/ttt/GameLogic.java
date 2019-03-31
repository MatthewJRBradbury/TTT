package com.example.ttt;

public class GameLogic {

	public boolean checkIfWin() {
		return false; // check rows columns and diagonals
		
	}
	
	public boolean checkRow(){
		return false;
	}
	
	public boolean checkCols(){
		return false;
	}
	
	public boolean checkDiag(){
		return false;
	}
	
	public boolean boardFull(TurnController tc) {
		if(tc.getTurn() == 10){
			return true;
		} else {
			return false; // check if any cells empty		
		}		
	}
	
	public boolean placeMark(int x, int y, Board b, char activePlayer) {
		char gb[][] = b.getBoard();
		
		
		if((x >= 0 && x <= gb.length) && (y >= 0 && y <= gb.length)) {
			if(gb[x][y] == ' ') {
				gb[x][y] = activePlayer;
			} else {
				System.out.println("Oops that spot has already been taken!");
				return false;
			}
		} else {
			System.out.println("Thats not a valid board position!");
			System.out.println("Please try again!");
			return false;
		}

		
		b.setBoard(gb);
		
		return true;
	}
}
