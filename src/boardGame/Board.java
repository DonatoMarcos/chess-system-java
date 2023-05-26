package boardGame;

// This is a generic board class - which will not be extended (added final on purpose)
// It indicates any possible board. It is not specialized.
public final class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;

	
	public Board (int rows, int columns) {
		if (rows < 2 || columns < 2)
			throw new BoardException("Error creating board: At least 2 lines/columns");
		
		this.rows = rows;
		this.columns = columns;
		
		this.pieces = new Piece[rows][columns];
	}

	
	public int getRows() {
		return rows;
	}

	
	public int getColumns() {
		return columns;
	}

	
	public Piece getPiece(int row, int column) {
		if (!positionExists(row,column)) {
		   throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}
	
	
	public Piece getPiece(Position position) {
		if (!positionExists(position)) {
		   throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			   throw new BoardException("There is already a piece on position "+position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public Piece removePiece(Position position) {
		if (!positionExists(position))
			throw new BoardException("Position not on the board");

		Piece aux = getPiece(position);
		
		if (aux != null) {
			aux.position = null;
			pieces[position.getRow()][position.getColumn()] = null;
		}

		return aux;
	}
	
	
	private boolean positionExists(int row, int column) {
		if ((row    >= 0) && (row    < rows   ) &&
		    (column >= 0) && (column < columns)) 
		   return true;
		else
		   return false;
		
	//	return row>=0&& row<rows && column>=0&&column<columns - equivalent
	}
	
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(),position.getColumn());
	}

	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
		   throw new BoardException("Position not on the board");
		}
		return (getPiece(position) != null);
	}

}
