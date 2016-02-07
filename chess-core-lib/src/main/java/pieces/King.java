package pieces;

public class King extends Piece {

	private Color _color;
	
	public King(Color c) {
		super(c);
		_color = c;
	}

	@Override
	public int getValue() {
		return 0;
	}
	
	@Override
	public Color getColor() {
		return _color;
	}
}
