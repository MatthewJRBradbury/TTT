package com.example.ttt;

public class TurnController {
	private int turn = 1;
	private char activePlayer = 'O';
	
	public TurnController(int turn, char activePlayer) {
    	this.turn = turn;
    	this.activePlayer = activePlayer;
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
		if(activePlayer == 'O'){
			activePlayer = 'X';
		}
		else {
			activePlayer = 'O';
		}
		return activePlayer;
	}
}
