package leetcode;

import java.util.HashMap;

public class _292NimGame {
	public static HashMap<Integer, Boolean> map = new HashMap<>();

	public boolean canWinNim(int n) {
		return canWinNim(n, n, true);
	}

	public boolean canWinNim(int first, int n, boolean turn) {
		boolean result = false;
		if (turn) {
			if (n == 1 || n == 2 || n == 3) {
				map.put(first, true);
				return true;
			} else {
				result = canWinNim(first, n - 1, false)
						|| canWinNim(first, n - 2, false)
						|| canWinNim(first, n - 3, false);
				map.put(first, result);
				return result;
			}
		} else {
			if (n == 1 || n == 2 || n == 3) {
				map.put(first, false);
				return false;
			} else {
				result = canWinNim(first, n - 1, true)
						&& canWinNim(first, n - 2, true)
						&& canWinNim(first, n - 3, true);
				map.put(first, result);
				return result;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
