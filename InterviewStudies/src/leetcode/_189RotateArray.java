package leetcode;

import java.util.Arrays;

public class _189RotateArray {
	public void rotate(int[] nums, int k) {
		if (k == nums.length || k == 0) {
			return;
		}
		if (k > nums.length) {
			k = k % nums.length;
		}
		int[] arr = Arrays.copyOf(nums, nums.length);
		for (int i = 0; i < k; i++) {
			nums[i] = arr[nums.length - k + i];
		}
		int a = 0;
		for (int i = k; i < nums.length; i++) {
			nums[i] = arr[a++];
		}
	}

	public static void main(String[] args) {
		_189RotateArray a = new _189RotateArray();
		int[] num = new int[] { 1, 2};
		a.rotate(num, 1);
		System.out.println(Arrays.toString(num));
	}

}
