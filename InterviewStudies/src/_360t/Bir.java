package _360t;

public class Bir {

	public int solution(int M, int[] A) {
		int N = A.length;
		int[] count = new int[M + 1];
		for (int i = 0; i <= M; i++) {
			count[i] = 0;
		}
		int maxOccurence = 0;
		int index = -1;
		if (N == 0) return -1;
		for (int i = 0; i < N; i++) {
			if (count[A[i]] > 0) {
				int tmp = count[A[i]];
				if (tmp + 1 > maxOccurence) {
					maxOccurence = tmp + 1;
					index = i;
				}
				count[A[i]] = tmp + 1;
			} else {
				count[A[i]] = 1;
				index = i;
				maxOccurence = Math.max(maxOccurence, 1);
			}
		}
		return A[index];
	}

	public static void main(String[] args) {
		Bir bir = new Bir();
		System.out.println(bir.solution(3, new int[] {  }));
	}

}
