package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class _037SudokuSolver {
	public void solveSudoku(char[][] board) {
		sudokuSolved(board);
	}

	public boolean sudokuSolved(char[][] board) {
		if (isFinish(board)) {
			return true;
		}
		int i = 0;
		int j = 0;
		pickNext(board, i, j);
		ArrayList<Integer> missing = missing(board, i, j);
		for (int newItem : missing) {
			board[i][j] = String.valueOf(newItem).charAt(0);
			if (sudokuSolved(board)) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Integer> missing(char[][] board, int a, int b) {
		ArrayList<Integer> missing = new ArrayList<>();
		for (int i = 1; i <= 9; i++) {
			missing.add(i);
		}
		for (int i = 0; i < 9; i++) {
			if (i != b && board[a][i] != '.'
					&& missing.contains(Integer.valueOf(board[a][i]))) {
				missing.remove(board[a][i]);
			}
			if (i != a && board[i][b] != '.'
					&& missing.contains(Integer.valueOf(board[i][b]))) {
				missing.remove(board[i][b]);
			}
		}
		// TODO: grup halindeki missing'leri bul
		return missing;
	}

	public void pickNext(char[][] board, int a, int b) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.') {
					a = i;
					b = j;
					return;
				}
			}
		}
	}

	public boolean isFinish(char[][] board) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.') {
					return false;
				}
			}
		}
		return true;
	}

	public boolean validate(char[][] board) {
		for (int i = 0; i < 9; i++) {
			char[] yatay = new char[9];
			char[] dikey = new char[9];

			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					yatay[j] = board[i][j];
				}
				if (board[j][i] != '.') {
					dikey[j] = board[j][i];
				}
			}
			if (hasDuplicate(yatay) || hasDuplicate(dikey)) {
				return false;
			}
		}
		for (int i = 0; i < 9; i = i + 3) {
			char[] grup = new char[9];
			int counter = 0;
			for (int j = 0; j < 9; j = j + 3) {
				for (int a = 0; a < 3; a++) {
					for (int b = 0; b < 3; b++) {
						grup[counter++] = board[i + a][j + b];
					}
				}
			}
			if (hasDuplicate(grup)) {
				return false;
			}
		}
		return true;
	}

	public boolean hasDuplicate(char[] temp) {
		HashMap<Character, Integer> map = convertToMap(temp);
		for (Character c : map.keySet()) {
			if (map.get(c) > 1) {
				return true;
			}
		}
		return false;
	}

	public HashMap<Character, Integer> convertToMap(char[] s) {
		HashMap<Character, Integer> map = new HashMap<>();
		Character c = null;
		for (int i = 0; i < s.length; i++) {
			c = s[i];
			if (map.get(c) == null) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		char[][] board = new char[9][9];

		String[] input = new String[] { "..9748...", "7........", ".2.1.9...",
				"..7...24.", ".64.1.59.", ".98...3..", "...8.3.2.", "........6",
				"...2759.." };
		for (int i = 0; i < 9; i++) {
			board[i] = input[i].toCharArray();
		}

		_037SudokuSolver a = new _037SudokuSolver();
		a.solveSudoku(board);
		System.out.println(Arrays.toString(board));
		// int sum = 0;
		// for (int i = 1; i <350;i++) {
		// sum+=i*(350-i);
		// }
		// System.out.println(sum);
	}

}
