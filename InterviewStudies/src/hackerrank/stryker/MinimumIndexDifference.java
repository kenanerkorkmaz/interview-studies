package hackerrank.stryker;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class MinimumIndexDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		SortedMap<Integer, Integer> m1 = new TreeMap<>();
		SortedMap<Integer, Integer> m2 = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			m1.put(a[i], i);
		}
		for (int i = 0; i < n; i++) {
			b[i] = in.nextInt();
			m2.put(b[i], i);
		}
		in.close();
		int min = 0;
		int minDiff = 2001;
		int diff = 0;
		for (Integer key : m1.keySet()) {
			diff = Math.abs(m1.get(key) - m2.get(key));
			if (diff < minDiff) {
				minDiff = diff;
				min = key;
			}
		}
		System.out.println(min);

	}

}
