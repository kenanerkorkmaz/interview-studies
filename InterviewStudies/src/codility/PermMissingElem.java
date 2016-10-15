package codility;

public class PermMissingElem {
	public int solution(int[] A) {
		int n = A.length;
		if (n == 0) {
			return 1;
		}
		double expected = n * (n + 1) / 2;
		double sum = 0;
		for (int i = 0; i < n; i++) {
			if (A[i] != (n + 1)) {
				sum += A[i];
			}
		}
		if ((expected - sum) == 0) {
			return n + 1;
		}
		return (int) (expected - sum);
	}
}
