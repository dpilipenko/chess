package gui;

import javax.swing.JFrame;

public final class Chess extends JFrame {

	private final static Chess chess;
	
	static {
		chess = new Chess();
	}

	public static Chess getInstance() {
		return chess;
	}
}
