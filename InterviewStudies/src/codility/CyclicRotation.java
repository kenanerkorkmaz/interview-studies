package codility;

public class CyclicRotation {
	public int[] solution(int[] A, int K) {
		int n = A.length;
		if (K == 0 || K == n || n == 0) {
			return A;
		}
		if (K > n) {
			K %= n;
		}
		int[] arr = new int[n];
		for (int i = 0; i < K; i++) {
			arr[i] = A[n - K + i];
		}
		int a = 0;
		for (int i = K; i < n; i++) {
			arr[i] = A[a++];
		}
		return arr;
	}
}
