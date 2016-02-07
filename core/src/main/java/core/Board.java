/**
 * 
 */
package core;

import core.piece.Bishop;
import core.piece.King;
import core.piece.Knight;
import core.piece.Pawn;
import core.piece.Queen;
import core.piece.Rook;

/**
 * @author Dima
 *
 */
public class Board {

	public Piece[][] board;
	
	/**
	 * 
	 */
	public Board() {
		board = new Piece[8][8];
	}
	
	public void initDefaultBoard() {
		board = new Piece[8][8];
		// create the pawns 
		for (int c = 0; c < 8; c++) {
			board[c][1] = new Pawn(Color.WHITE);
			board[c][6] = new Pawn(Color.BLACK);
		}
		// create other white pieces
		board[0][0] = new Rook(Color.WHITE);
		board[1][0] = new Knight(Color.WHITE);
		board[2][0] = new Bishop(Color.WHITE);
		board[3][0] = new Queen(Color.WHITE);
		board[4][0] = new King(Color.WHITE);
		board[5][0] = new Bishop(Color.WHITE);
		board[6][0] = new Knight(Color.WHITE);
		board[7][0] = new Rook(Color.WHITE);
		// create other black pieces
		board[0][7] = new Rook(Color.BLACK);
		board[1][7] = new Knight(Color.BLACK);
		board[2][7] = new Bishop(Color.BLACK);
		board[3][7] = new Queen(Color.BLACK);
		board[4][7] = new King(Color.BLACK);
		board[5][7] = new Bishop(Color.BLACK);
		board[6][7] = new Knight(Color.BLACK);
		board[7][7] = new Rook(Color.BLACK);
	}

}
