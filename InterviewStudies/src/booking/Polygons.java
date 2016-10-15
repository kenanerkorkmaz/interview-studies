package booking;

import java.util.Scanner;

public class Polygons {

	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		int square = 0;
		int rectange = 0;
		int polygon = 0;
		while (in.hasNext()) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = in.nextInt();
			if (a < 0 || b < 0 || c < 0 || d < 0) {
				polygon++;
			} else if (a == b && b == c && c == d) {
				square++;
			} else if (a == c && b == d && a != b) {
				rectange++;
			} else {
				polygon++;
			}
		}
		System.out.println(square + " " + rectange + " " + polygon);
		in.close();
	}

}
