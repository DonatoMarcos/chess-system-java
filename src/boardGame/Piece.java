package boardGame;

// This is a generic class. It represents a piece with a position on a given board.
// Which game this piece belongs to? - I don't know.
// Which type of piece within the game this piece is? - I don't know.
public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}
	
	protected Board getBoard() {
		return this.board;
	}

}
