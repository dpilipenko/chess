package app;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import pieces.Board;
import pieces.Piece;

/**
 * 
 */

/**
 * @author Dima
 *
 */
public class ChessGUI extends JPanel {
	private static final String default_start = "rnbqkbnrpppppppp                                PPPPPPPPRNBQKBNR";
	private static final int SIZE_WIDTH = 32 * 8;
	private static final int SIZE_HEIGHT = 32 * 8;
	
	private Board board;

	public ChessGUI() {
		board = new Board();
		board.importBoardFromString(default_start.toCharArray());
		
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(this);
		f.setSize(SIZE_WIDTH, SIZE_HEIGHT+22);
	}
	
	public static void main(String[] args) {
		new ChessGUI();
	}

	@Override
	protected void paintComponent(Graphics g) {
		drawGrid(g);
		drawPieces(g);
	}
	
	private void drawGrid(Graphics g) {
		final Color gridDark = new Color(133, 97, 38);
		final Color gridLight = new Color(232, 199, 146);
		final int gridSize = 32;
		
		g.setColor(gridLight);
		g.fillRect(0, 0, gridSize, gridSize);
		g.fillRect(gridSize, gridSize, gridSize, gridSize);
		g.setColor(gridDark);
		g.fillRect(gridSize, 0, gridSize, gridSize);
		g.fillRect(0, gridSize, gridSize, gridSize);
		
		boolean nextGridLight = true;
		for (int rank = 0; rank < 8; rank++) {
			for (int file = 0; file < 8; file++) {
				Color c;
				if (nextGridLight) {
					c = gridLight;
					nextGridLight = !nextGridLight;
				} else {
					c = gridDark;
					nextGridLight = !nextGridLight;
				}
				g.setColor(c);
				g.fillRect((gridSize*file), (gridSize*rank), gridSize, gridSize);
			}
			nextGridLight = !nextGridLight;
		}
	}
	
	private void drawPieces(Graphics g) {
		final Color pieceDark = new Color(115, 47, 47);
		final Color pieceLight = new Color(240, 105, 60);
		final int gridSize = 32;
		
		for (int rank = 0; rank < 8; rank++) {
			for (int file = 0; file < 8; file++) {
				Piece piece = board.get(rank, file);
				if (piece != null) {
					pieces.Color c = piece.getColor();
					if (c.equals(pieces.Color.WHITE)) {
						g.setColor(pieceLight);
					} else {
						g.setColor(pieceDark);
					}
					
					int r = gridSize / 3;
					int x = (gridSize*file) + (gridSize / 2) - (r / 2);
					int y = (gridSize*rank) + (gridSize / 2) - (r / 2);
					g.fillOval(x, y, r, r);
				}
			}
		}
	}
	
	private static final long serialVersionUID = 9052601054386539993L;
}
