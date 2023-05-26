package chess.pieces;

import boardGame.Board;
import boardGame.Position;
import chess.ChessPiece;
import chess.Color;

public final class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] matrix = new boolean
				             [this.getBoard().getRows()]
				             [this.getBoard().getColumns()];
		Position possPos = new Position(0,0);
		
		//above
		possPos.setPosition(this.position.getRow()-1, this.position.getColumn());
		while (getBoard().positionExists(possPos) && !(getBoard().thereIsAPiece(possPos))) {
			matrix[possPos.getRow()][possPos.getColumn()] = true;
			possPos.setRow(possPos.getRow() - 1);
		}
		
		if (getBoard().positionExists(possPos) && isThereOpponentPiece(possPos)) {
			matrix[possPos.getRow()][possPos.getColumn()] = true;
		}
		
		//below
		possPos.setPosition(this.position.getRow()+1, this.position.getColumn());
		while (getBoard().positionExists(possPos) && !(getBoard().thereIsAPiece(possPos))) {
			matrix[possPos.getRow()][possPos.getColumn()] = true;
			possPos.setRow(possPos.getRow() + 1);
		}
		
		if (getBoard().positionExists(possPos) && isThereOpponentPiece(possPos)) {
			matrix[possPos.getRow()][possPos.getColumn()] = true;
		}
		
		//left
		possPos.setPosition(this.position.getRow(), this.position.getColumn() - 1);
		while (getBoard().positionExists(possPos) && !(getBoard().thereIsAPiece(possPos))) {
			matrix[possPos.getRow()][possPos.getColumn()] = true;
			possPos.setColumn(possPos.getColumn() - 1);
		}
		
		if (getBoard().positionExists(possPos) && isThereOpponentPiece(possPos)) {
			matrix[possPos.getRow()][possPos.getColumn()] = true;
		}


		//right
		possPos.setPosition(this.position.getRow(), this.position.getColumn() + 1);
		while (getBoard().positionExists(possPos) && !(getBoard().thereIsAPiece(possPos))) {
			matrix[possPos.getRow()][possPos.getColumn()] = true;
			possPos.setColumn(possPos.getColumn() + 1);
		}
		
		if (getBoard().positionExists(possPos) && isThereOpponentPiece(possPos)) {
			matrix[possPos.getRow()][possPos.getColumn()] = true;
		}

		return matrix;
	}
	
	

}
