package state;

public class ChessBoard {
	private int totalRows;
	private int totalColumns;
	ChessPieceType[][] board;

	public ChessBoard() {
		totalRows = 3;
		totalColumns = 3;
		board = new ChessPieceType[totalRows][totalColumns];
	}

	public ChessPieceType[][] getBoard() {

		return board;
	}

	public boolean placeChessPiece(int row, int col, ChessPieceType chessPieceType) throws Exception {
		if (row < 0 || row >= totalRows || col < 0 || col >= totalColumns) {
			throw new Exception("Please enter valid cell");
		}
		if (board[row][col] != null) {
			throw new Exception("Already chess piece type is placed in the cell (row, col) (" + row + "," + col + ")");
		}
		board[row][col] = chessPieceType;
		return true;
	}

	public void printBoard() {
		for (int row = 0; row < totalRows; row++) {
			for (int col = 0; col < totalColumns; col++) {
				System.out.print(board[row][col] + " ");
			}
			System.out.println();
		}
	}
}
