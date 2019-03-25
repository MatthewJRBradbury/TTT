package com.example.ttt;

public class TurnController {
	private char playerO = 'O';
    private char playerX = 'X';
	private int turn;
	private char activePlayer;
	
	public TurnController() {
    	turn = 1;
    	activePlayer = playerO;
    }
	
	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public char getActivePlayer() {
		return activePlayer;
	}

	public void setActivePlayer(char activePlayer) {
		this.activePlayer = activePlayer;
	}

	public int iterateTurn(){
		return turn ++;
	}
	
	public char switchPlayer(){
		if(activePlayer == playerO){
			activePlayer = playerX;
		}
		else {
			activePlayer = playerO;
		}
		return activePlayer;
	}
}
