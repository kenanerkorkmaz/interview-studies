package codility;

import java.util.Arrays;

public class OddOccurence {
	public int solution(int[] A) {
		int n = A.length;
		Arrays.sort(A);
		if (n == 1) {
			return A[0];
		}
		boolean valueExists = true;
		for (int i = 1; i < n; i++) {
			if (valueExists) {
				if (A[i - 1] != A[i]) {
					return A[i - 1];
				} else {
					valueExists = false;
					continue;
				}
			} else {
				valueExists = true;
				continue;
			}
		}
		if (valueExists) {
			return A[n - 1];
		}
		return -1;
	}
}
