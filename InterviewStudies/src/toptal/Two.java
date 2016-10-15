package toptal;

import java.util.Arrays;

public class Two {

	public int[] solution(int[] A) {
		// in base -2, any sequential pairs is equal to
		// (1,1) in (a,a+1)th positions = (-2)^a+(-2)^(a+1) = (-2+1)*(-2)^a =
		// -(-2)^a
		// if we negate this pair it is (-2)^a that is (1,0).
		// it is the opposite pairs, for other part that is if pair is (1,0)
		// then negated part is (1,1)
		// if it starts with 0, negated part is again 0.
		// so we will convert (1,1) to (1,0), (1,0) to (1,1), (0) to (0)
		int n = A.length;
		if (n == 0) {
			return new int[] {};
		} else if (n == 1 && A[0] == 0) {
			return new int[] {};
		}

		boolean oneExists = false;
		int[] arr = new int[n + 1];
		for (int i = 0; i < n; i++) {
			if (A[i] == 0 && !oneExists) {
				arr[i] = 0;
			} else if (A[i] == 0 && oneExists) {
				arr[i] = 1;
				oneExists = false;
			} else if (A[i] == 1 && oneExists) {
				arr[i] = 0;
				oneExists = false;
			} else if (A[i] == 1 && !oneExists) {
				arr[i] = 1;
				oneExists = true;
			}
		}
		if (oneExists) {
			arr[n] = 1;
		}
		int a = arr.length;
		for (int i = a - 1; i >= 0; i--) {
			if (arr[i] == 0) {
				a--;
			} else {
				break;
			}
		}
		return Arrays.copyOf(arr, a);
	}

	public static void main(String[] args) {
		Two iki = new Two();
		System.out.println(Arrays.toString(iki.solution(new int[] { 1 })));
	}

}
