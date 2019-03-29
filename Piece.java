package modele;

public class Piece {
	final String player;
	int x;
	int y;
	
	final boolean licorne;

	EscampeBoard board;
	
	public Piece(String player, boolean licorne, EscampeBoard board) {
		this.player = player;
		this.board = board;
		this.licorne = licorne;
	}
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	
}
