/**
 * 
 */
package core;

/**
 * @author Dima
 *
 */
public class Coord {

	private char column;
	private int row;
	
	public Coord(char column, int row) {
		if (isValidColumn(column)) {
			this.column = column;
		}
		if (isValidRow(row)) {
			this.row = row;
		}
	}
	
	public char getColumn() {
		return this.column;
	}
	
	public int getRow() {
		return this.row;
	}
	
	private boolean isValidRow(int row) {
		if (row >= 1 && row <= 8) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean isValidColumn(char column) {
		switch (column) {
		case 'a':
			return true;
		case 'b':
			return true;
		case 'c':
			return true;
		case 'd':
			return true;
		case 'e':
			return true;
		case 'f':
			return true;
		case 'g':
			return true;
		default:
			return false;
		}
	}

}
