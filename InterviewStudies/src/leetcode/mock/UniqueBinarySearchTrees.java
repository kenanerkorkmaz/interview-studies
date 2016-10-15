package leetcode.mock;

public class UniqueBinarySearchTrees {
	public int numTrees(int n) {
		if (n < 1) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		return (int) Math.pow(2, n - 1) + (int) Math.pow(2, n - 2);
	}

	public static void main(String[] args) {
		UniqueBinarySearchTrees a = new UniqueBinarySearchTrees();
		System.out.println(a.numTrees(0));
	}

}
