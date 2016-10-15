package hackerrank._30days;

import java.util.Scanner;

public class _16Exceptions {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		in.close();
		try {
			System.out.println(Integer.valueOf(S));
		} catch (NumberFormatException e) {
			System.out.println("Bad String");
		}
	}

}
