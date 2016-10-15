package leetcode;

public class _011ContainerWithMostWater {
	public int maxArea(int[] height) {
		if (height == null || height.length < 2) {
			return 0;
		}

		int max = 0;
		int i = 0;
		int j = height.length - 1;
		while (i < j) {
			max = Math.max(max, (j - i) * Math.min(height[i], height[j]));
			if (height[i] < height[j]) {
				i++;
			} else {
				j--;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		_011ContainerWithMostWater a = new _011ContainerWithMostWater();
		System.out.println(a.maxArea(new int[] { 1, 1 }));
		int[] arr = new int[15000];
		for (int i = 0; i < 15000; i++) {
			arr[i] = 15000 - i;
		}
		System.out.println(a.maxArea(arr));
	}
}
