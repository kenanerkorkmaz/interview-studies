package hackerrank._30days;

import java.util.Scanner;

public class _02Operators {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble(); // original meal price
		int tipPercent = scan.nextInt(); // tip percentage
		int taxPercent = scan.nextInt(); // tax percentage
		scan.close();

		int totalCost = (int) Math
				.round(mealCost * (1 + (tipPercent + taxPercent) / 100.0));

		System.out.println("The total meal cost is " + totalCost + " dollars.");
	}
}
