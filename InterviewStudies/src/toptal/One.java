package toptal;

import java.util.ArrayList;

public class One {

	public int solution(int X, int[] A) {
		// we use two pointers technique
		int n = A.length;
		int left = 0;
		int right = n - 1;
		if (n == 1) {
			if (A[0] == X) {
				return 0;
			} else {
				return 1;
			}
		}
		while (left <= right) {
			if (A[left] == X && A[right] != X) {
				left++;
				right--;
			} else if (A[left] == X && A[right] == X) {
				right--;
			} else if (A[left] != X && A[right] == X) {
				left++;
				right--;
			} else {
				left++;
			}
		}
		if (right == 0 && left == 0) {
			return 0;
		} else if (right == (n-1) && left == (n-1)) {
			return n;
		}

		return right+1;
	}

	
	public static void main(String[] args) {
		One bir = new One();
		System.out.println(bir.solution(5, new int[] { 5 }));
	}

}
