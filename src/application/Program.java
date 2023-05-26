package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while (true) {
			try {
				UI.printBoard(chessMatch.getPieces());
				System.out.println("\nSource: ");
				System.out.print("Target: ");
				System.out.print("\033[1A");
				ChessPosition source = UI.readChessPosition(sc);
				System.out.print("\033[8C");
				ChessPosition target = UI.readChessPosition(sc);
				chessMatch.performChessMove(source, target);
			}
			catch (ChessException e) {
				System.out.print("\nError: "+e.getMessage());
				sc.nextLine();
			}
			catch (InputMismatchException e) {
				System.out.print("\nError: "+e.getMessage());
				sc.nextLine();
			}
		}
	}

}
