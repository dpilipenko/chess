package pieces;

public class Pawn extends Piece {

	private Color _color;
	
	public Pawn(Color c) {
		super(c);
		_color = c;
	}

	@Override
	public int getValue() {
		return 1;
	}

	@Override
	public Color getColor() {
		return _color;
	}
}
