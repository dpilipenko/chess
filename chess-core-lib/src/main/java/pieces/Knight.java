package pieces;

public class Knight extends Piece {

	private Color _color;
	
	public Knight(Color c) {
		super(c);
		_color = c;
	}

	@Override
	public int getValue() {
		return 3;
	}
	
	@Override
	public Color getColor() {
		return _color;
	}
}
