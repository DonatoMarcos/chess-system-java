package chess.pieces;

import boardGame.Board;
import chess.ChessPiece;
import chess.Color;

public final class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] matrix = new boolean
				             [this.getBoard().getRows()]
				             [this.getBoard().getColumns()];
		return matrix;
	}
	
	

}
