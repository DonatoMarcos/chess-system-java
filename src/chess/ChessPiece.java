package chess;

import boardGame.Board;
import boardGame.Piece;
import boardGame.Position;

// This class is an extension over the general Piece clas and, indicates
// that we'll have a piece for the chess game.
// On top of general board and position, we'll have the color, which may
// be white or black.
// Now, which piece type am I? I don't know yet.
public abstract class ChessPiece extends Piece {
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);               // Since the parent class contains a 
		this.color = color;         // constructor we're obligated to define one.
	}
	
	public Color getColor() {
		return this.color;
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece piece = (ChessPiece)getBoard().getPiece(position);
		return (piece != null) && (piece.getColor() != color);
	}

}
