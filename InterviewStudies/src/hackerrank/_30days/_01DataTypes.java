package hackerrank._30days;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _01DataTypes {
	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "Hackerrank ";
		Scanner scan = new Scanner(System.in);
		int i2 = Integer.valueOf(scan.nextLine());
		double d2 = Double.valueOf(scan.nextLine());
		String s2 = scan.nextLine();
		scan.close();
		System.out.println(i + i2);
		System.out.println(new DecimalFormat("#0.0").format(d + d2));
		System.out.println(s + s2);
	}
}
