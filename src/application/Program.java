package application;

import board.Board;
import board.Position;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getpieces());
		
		
	}

}
