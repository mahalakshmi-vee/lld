package state;

public class Player {
	private String name;
	private ChessPieceType chessPieceType;

	public Player(String name, ChessPieceType chessPieceType) {
		this.name = name;
		this.chessPieceType = chessPieceType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ChessPieceType getChessPieceType() {
		return chessPieceType;
	}

	public void setChessPieceType(ChessPieceType chessPieceType) {
		this.chessPieceType = chessPieceType;
	}
}
