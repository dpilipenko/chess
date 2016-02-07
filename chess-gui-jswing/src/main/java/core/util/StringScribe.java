/**
 * 
 */
package core.util;

import pieces.Bishop;
import pieces.Board;
import pieces.Color;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Piece;
import pieces.Queen;
import pieces.Rook;

/**
 * @author Dima
 *
 */
public class StringScribe {

	public static Board translate(String input) {
		Board board = new Board();
		char[] charArray = input.toCharArray();
		for (int i = 0; i < 64; i++) {
			Piece p = translateToPiece(charArray[i]);
			int c = i / 8;
			int d = i % 8;
			board.put(c, d, p);
		}
		return board;
	}
	
	public static String scribe(Board input) {
		StringBuilder sb = new StringBuilder();
		for (int c = 0; c < 8; c++) {
			for (int d = 0; d < 8; d++) {
				Piece p = input.get(c, d);
				sb.append(translateToChar(p));
			}
		}
		return sb.toString();
	}

	private static Piece translateToPiece(char c) {
		switch (c) {
			case 'r':
				return new Rook(Color.BLACK);
			case 'n':
				return new Knight(Color.BLACK);
			case 'b':
				return new Bishop(Color.BLACK);
			case 'q':
				return new Queen(Color.BLACK);
			case 'k':
				return new King(Color.BLACK);
			case 'p':
				return new Pawn(Color.BLACK);
			case ' ':
				return null;
			case 'R':
				return new Rook(Color.WHITE);
			case 'N':
				return new Knight(Color.WHITE);
			case 'B':
				return new Bishop(Color.WHITE);
			case 'Q':
				return new Queen(Color.WHITE);
			case 'K':
				return new King(Color.WHITE);
			case 'P':
				return new Pawn(Color.WHITE);
		}
		return null;
	}
	
	private static char translateToChar(Piece p) {
		if (p == null) {
			return ' ';
		} else if (p instanceof Pawn) {
			switch (p.getColor()) {
			case BLACK:
				return 'p';
			case WHITE:
				return 'P';
			}
		} else if (p instanceof Bishop) {
			switch (p.getColor()) {
			case BLACK:
				return 'b';
			case WHITE:
				return 'B';
			}
		} else if (p instanceof Knight) {
			switch (p.getColor()) {
			case BLACK:
				return 'k';
			case WHITE:
				return 'K';
			}
		} else if (p instanceof Rook) {
			switch (p.getColor()) {
			case BLACK:
				return 'r';
			case WHITE:
				return 'R';
			}
		} else if (p instanceof Queen) {
			switch (p.getColor()) {
			case BLACK:
				return 'q';
			case WHITE:
				return 'Q';
			}
		} else if (p instanceof King) {
			switch (p.getColor()) {
			case BLACK:
				return 'k';
			case WHITE:
				return 'K';
			}
		}
		return ' ';
	}

}
