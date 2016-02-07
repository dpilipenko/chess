/**
 * 
 */
package app;

import core.Board;
import core.util.StringScribe;

/**
 * @author Dima
 *
 */
public class Main {

	/**
	 * 
	 */
	public static void main(String[] args) {
		String defaultboard = "rnbqkbnrpppppppp                                PPPPPPPPRNBQKBNR";
		Board board = StringScribe.translate(defaultboard);
		String output = StringScribe.scribe(board);
		System.out.println("Board:   " + board);
		System.out.println("Output:  " + output);
		System.out.println("Default: " + defaultboard);
	}

}
