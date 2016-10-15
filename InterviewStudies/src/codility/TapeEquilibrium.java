package codility;

public class TapeEquilibrium {
	public int solution(int[] A) {
		int n = A.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += A[i];
		}
		int tempSum = A[0];
		int minDiff = Integer.MAX_VALUE;
		for (int i = 1; i < n; i++) {
			minDiff = Math.min(minDiff, Math.abs(sum - 2*tempSum));
			tempSum += A[i];
		}
		return minDiff;
	}
}
