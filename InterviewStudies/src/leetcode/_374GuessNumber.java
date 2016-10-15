package leetcode;

public class _374GuessNumber {
	/*
	 * The guess API is defined in the parent class GuessGame.
	 * 
	 * @param num, your guess
	 * 
	 * @return -1 if my number is lower, 1 if my number is higher, otherwise
	 * return 0
	 */

	public static final int number = 42;

	int guess(int num) {
		if (num > number) {
			System.out.println("-1: my number if lower");
			return -1;
		} else if (num < number) {
			System.out.println("1: my number if higher");
			return 1;
		} else {
			System.out.println("you found it!");
			return 0;
		}
	}

	public int guessNumber(int n) {
		return guessInterval(0, n);
	}

	public int guessInterval(int min, int max) {
		int guessedNum = min + (max - min) / 2;
		int result = guess(guessedNum);
		if (result == 0) {
			return guessedNum;
		} else if (result == -1) {
			return guessInterval(min, guessedNum - 1);
		} else {
			return guessInterval(guessedNum + 1, max);
		}
	}

	public static void main(String[] args) {
		_374GuessNumber a = new _374GuessNumber();
		System.out.println(a.guessNumber(1000));
	}

}
