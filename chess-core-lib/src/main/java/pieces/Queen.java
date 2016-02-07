package pieces;

public class Queen extends Piece {

	private Color _color;
	
	public Queen(Color c) {
		super(c);
		_color = c;
	}

	@Override
	public int getValue() {
		return 9;
	}
	
	@Override
	public Color getColor() {
		return _color;
	}
}
