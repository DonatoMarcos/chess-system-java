package boardGame;

import java.util.List;

// This is a generic class. It represents a piece with a position on a given board.
// Which game this piece belongs to? - I don't know.
// Which type of piece within the game this piece is? - I don't know.
// As I don't this class to be instantiated, I added abstract to it.
public abstract class Piece {
	
	protected Position position; // This is internal position - not game position
	private Board board;
	
	public Piece(Board board) {  // Constructor indicates that at create time, no position will be set.
		this.board = board;
		this.position = null;
	}
	
	protected Board getBoard() {
		return this.board;
	}
	
	public abstract boolean[][] possibleMoves();

	// possibleMoves () returns an array.
	// Then, on top of this array, we're going after a single element
	// pointed by the [row] [column]
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	//Check if piece is not stuck.
	public boolean isThereAnyPossibleMove() {
		boolean[][] moveMatrix = possibleMoves();
		for (boolean[] moveRow: moveMatrix) {
			for (boolean move: moveRow) {
				if (move)
					return true;
			}
		}
		return false;
	}
}
