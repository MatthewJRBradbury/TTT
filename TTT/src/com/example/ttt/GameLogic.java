package com.example.ttt;

public class GameLogic {

	public char checkIfWin(int turn, Board b) {
		char gb[][] = b.getBoard();
		if (turn >= 5) { // ONLY RUN ON TURN 5
			char row = checkRows(gb);
			System.out.println("row = " + row);
			return row;
		}
		return 'n'; // check rows columns and diagonals
	}
	
	private char checkRows(char gb[][]){
		for(int i = 0; i < 3; i++){
			if(checkLine(gb[i][0], gb[i][1],gb[i][2]) == true){
				return gb[i][0];
			}
		}
		return 'n';
	}
	
	private boolean checkLine(char c1, char c2, char c3){
		return((c1 != ' ') && (c1 == c2) && (c2 == c3));
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
