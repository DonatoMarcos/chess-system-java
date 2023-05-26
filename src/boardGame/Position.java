package boardGame;

// This is a class that we don't want to be extended.
// This class indicates a position in a generic board.
// So, this is a BOARD position (not a specific game position).
public final class Position {
	
	private int row;
	private int column;
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public Position() {
		// TODO Auto-generated constructor stub
	}

	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}

	@Override
	public String toString() {
		return row + ", " + column;
	}
}
