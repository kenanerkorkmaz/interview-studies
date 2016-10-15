package hackerrank._30days;

import java.util.Scanner;

public class _09Recursion {

	public int factorial(int n) {
		if (n == 1 ) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		_09Recursion a = new _09Recursion();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(a.factorial(n));
	}

}
