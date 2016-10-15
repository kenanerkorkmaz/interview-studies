package codility;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MissingInteger {
	public int solution(int[] A) {
		int n = A.length;
		int num = 1;
		Set<Integer> set = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			if (A[i] == num) {
				num++;
			} else if (A[i] > num) {
				set.add(A[i]);
			}
		}
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			int number = it.next();
			if (num == number) {
				num++;
			} else if (num < number) {
				return num;
			}

		}
		return num;
	}

	public static void main(String[] args) {
		MissingInteger a = new MissingInteger();
		System.out.println(a.solution(new int[] { 1 }));
	}
}
