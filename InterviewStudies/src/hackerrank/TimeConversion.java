package hackerrank;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String time = in.next();
		in.close();
		int l = time.length();
		int hour = Integer.valueOf(time.substring(0, 2));
		String apm = time.substring(l - 2, l);
		String core = time.substring(2, l - 2);
		if (apm.equals("PM")) {
			if (hour == 12) {
				System.out.println("12" + core);
			} else {
				System.out.println(hour + 12 + core);
			}
		} else if (apm.equals("AM")) {
			if (hour == 12) {
				System.out.println("00" + core);
			} else {
				System.out.println(time.substring(0, l - 2));
			}
		}
	}

}
