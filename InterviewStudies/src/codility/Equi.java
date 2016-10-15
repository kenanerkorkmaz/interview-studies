package codility;

public class Equi {
	public int solution(int[] A) {
		int n = A.length;
		if (n == 0) {
		    return -1;
		}
	    if (n == 1) {
			return 0 ;
		}
		 long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += A[i];
		}
		if (sum - A[0] == 0) {
			return 0;
		} else if (sum - A[n - 1] == 0) {
			return n - 1;
		} else {
		     long sum_left = 0;
			for (int i = 1; i < n - 1; i++) {
				if (sum - A[i] - sum_left == sum_left) {
					return i;
				}
				sum_left += A[i];
			}
		}
		return 0;
	
    }

	public static void main(String[] args) {
		System.out.println(-2 % 2);
	}

}
