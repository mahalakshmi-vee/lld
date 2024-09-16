package state;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Game {
	private Deque<Player> deQueue = new ArrayDeque<>();
	private ChessBoard chessBoard = new ChessBoard();

	public Game() {
		deQueue.add(new Player("Player 1", ChessPieceType.ROUNDPIECE));
		deQueue.add(new Player("Player 2", ChessPieceType.CROSSPIECE));
	}

	public void startGame() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			Player player = deQueue.pollFirst();
			System.out.println(player.getName()+" turn enter row, col: ");
			String input = scanner.next();
			String[] inputArray = input.split(",");
			int row = Integer.valueOf(inputArray[0]);
			int col = Integer.valueOf(inputArray[1]);

			try {
				chessBoard.placeChessPiece(row, col, player.getChessPieceType());
			} catch (Exception e) {
				System.out.println(e.getMessage());
				deQueue.addFirst(player);
				continue;
			}

			boolean win = checkWin(player, row, col);
			if (win) {
				scanner.close();
				System.out.println(player.getName() + " wins !!!");
				return;
			}

			boolean fill = isBoardFill();
			if (fill) {
				scanner.close();
				System.out.println("Tie");
				break;
			}

			chessBoard.printBoard();
			deQueue.addLast(player);
		}
		scanner.close();
	}

	public boolean checkWin(Player player, int row, int col) {
		ChessPieceType[][] board = chessBoard.getBoard();
		boolean horizontallyMatched = true;
		// checking horizontally.
		for (int c = 0; c < board[0].length; c++) {
			if (board[row][c] != player.getChessPieceType()) {
				horizontallyMatched = false;
				break;
			}
		}

		boolean verticallyMatched = true;
		// checking vertically.
		for (int r = 0; r < board.length; r++) {
			if (board[r][col] != player.getChessPieceType()) {
				verticallyMatched = false;
				break;
			}
		}

		// main diagonal checking.
		boolean mainDiagonalMatched = true;
		int r = 0;
		int c = 0;
		while (r < board.length && c < board[0].length) {
			if (board[r][c] != player.getChessPieceType()) {
				mainDiagonalMatched = false;
				break;
			}
			r++;
			c++;
		}

		// anti diagonal checking.
		boolean antiDiagonalMatched = true;
		r = 0;
		c = board.length - 1;
		while (r < board.length && c >= 0) {
			if (board[r][c] != player.getChessPieceType()) {
				antiDiagonalMatched = false;
				break;
			}
			r++;
			c--;
		}
		return verticallyMatched || horizontallyMatched || mainDiagonalMatched || antiDiagonalMatched;
	}

	public boolean isBoardFill() {
		ChessPieceType[][] board = chessBoard.getBoard();
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				if (board[row][col] == null)
					return false;
			}
		}
		return true;
	}
}
