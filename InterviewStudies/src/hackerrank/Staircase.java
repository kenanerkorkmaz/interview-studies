package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();

		if (n <= 0) {
			return;
		}

		char[] line = new char[n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(line, 0, n - i - 1, ' ');
			Arrays.fill(line, n - i - 1, n, '#');
			System.out.println(new String(line));
		}
	}

}