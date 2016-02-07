package pieces;

public class Board {
	
	private Piece[][] b;

	public Board() {
		b = new Piece[8][8];
	}
	
	public void importBoardFromString(char[] input) {
		b = new Piece[8][8];
		
		for (int rank = 0; rank < 8; rank++) {
			for (int file = 0; file < 8; file++) {
				int index = (rank * 8) + file;
				char character = input[index];
				Piece piece = interpretPiece(character);
				b[rank][file] = piece;
			}
		}
	}
	
	public Piece get(int rank, int file) {
		return b[rank][file];
	}
	public void put(int rank, int file, Piece piece) {
		b[rank][file] = piece;
	}

	private Piece interpretPiece(char character) {
		switch (character) {
		case 'r':
			return new Rook(Color.BLACK);
		case 'R':
			return new Rook(Color.WHITE);
		case 'n':
			return new Knight(Color.BLACK);
		case 'N':
			return new Knight(Color.WHITE);
		case 'b':
			return new Bishop(Color.BLACK);
		case 'B':
			return new Bishop(Color.WHITE);
		case 'q':
			return new Queen(Color.BLACK);
		case 'Q':
			return new Queen(Color.WHITE);
		case 'k':
			return new King(Color.BLACK);
		case 'K':
			return new King(Color.WHITE);
		case 'p':
			return new Pawn(Color.BLACK);
		case 'P':
			return new Pawn(Color.WHITE);
		default:
			return null;
		}
	}

}
