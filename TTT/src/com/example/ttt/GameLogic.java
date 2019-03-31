package com.example.ttt;

public class GameLogic {

	public boolean checkIfWin(int turn, Board b) {
		char gb[][] = b.getBoard();
		if (turn >= 5) { // ONLY RUN ON TURN 5
			char row = checkRows(gb);
			if (row == 'X' || row == 'O') {
				System.out.println("returning true!");
				return true;
			}
		}
		return false; // check rows columns and diagonals
		
	}
	
	// FIX THIS (also maybe make a function that can be used for both row and column checks)
	private char checkRows(char[][] gb){
		for (int y = 0; y < 2; y ++) {
			char temp = ' ';
			int count = 0;
			for (int x = 0; x < 2; x ++) {
				if(gb[y][x] == ' ') {
					break;
				} 
				else {
					if(temp == ' ') {
						temp = gb[y][x];
					} 
					else {
						if(count == 1 && temp == gb[y][x]) {
							return temp;
						} 
						else if(temp == gb[y][x]) {
							temp = gb[y][x];
							count++;
						} 
						else {
							break;
						}
					}
				}
			}
		}
		return ' ';
	}
	
	private boolean checkCols(){
		return false;
	}
	
	private boolean checkDiags(){
		return false;
	}
	
	public boolean boardFull(int turn) {
		if(turn == 10){
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
