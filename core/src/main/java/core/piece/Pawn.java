/**
 * 
 */
package core.piece;

import core.Color;
import core.Piece;

/**
 * @author Dima
 *
 */
public final class Pawn extends Piece {

	/**
	 * @param color
	 */
	public Pawn(Color color) {
		super(color);
		pointValue = 1;
	}

}
