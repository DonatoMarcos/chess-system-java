package application;

import boardGame.Board;
import boardGame.Position;

public class Program {
	
	
	public static void main (String [] args) {
		Position pos = new Position(3,5);
		System.out.println(pos);
		
		Board board = new Board(8,8);
	}

}
