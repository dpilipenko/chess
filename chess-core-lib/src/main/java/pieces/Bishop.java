package pieces;

public class Bishop extends Piece {

	private Color _color; 
	
	public Bishop(Color c) {
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
