package hackerrank;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		if (s == null || s.trim().length() == 0) {
			System.out.println("1");
			return;
		}
		int length = 1;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				length++;
			}
		}
		System.out.println(String.valueOf(length));
	}
}
