package pieces;

public class Rook extends Piece {

	private Color _color;
	
	public Rook(Color c) {
		super(c);
		_color = c;
	}

	@Override
	public int getValue() {
		return 5;
	}
	
	@Override
	public Color getColor() {
		return _color;
	}
}
