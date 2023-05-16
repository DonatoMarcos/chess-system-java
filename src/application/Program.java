package application;

import chess.ChessMatch;

public class Program {
	
	
	public static void main (String [] args) {

		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		
		char a,A,h,H;
		a = 'a';
		A = 'A';
		h = 'h';
		H = 'H';
		System.out.println(a);
		System.out.println(A);
		System.out.println(h);
		System.out.println(H);
		
		System.out.println(a - a);
		System.out.println(A - a);
		System.out.println(h - a);
		System.out.println(H - a);

		System.out.println((int)a);
		System.out.println((int)A);
		System.out.println((int)h);
		System.out.println((int)H);

		System.out.println((int)a - (int)a);
		System.out.println((int)A - (int)a);
		System.out.println((int)h - (int)a);
		System.out.println((int)H - (int)a);
}

}
