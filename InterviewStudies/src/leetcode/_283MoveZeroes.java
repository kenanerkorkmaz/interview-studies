package leetcode;

import java.util.Arrays;

public class _283MoveZeroes {
	public void moveZeroes(int[] nums) {
		if (nums.length ==0 || nums.length == 1) {
			return;
		}
		int a = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0 ) {
				nums[a++] = nums[i];
			}
		}
		for (int i = a; i < nums.length; i++) {
			nums[i] = 0;
		}
	}

	public static void main(String[] args) {
		_283MoveZeroes a = new _283MoveZeroes();
		int[] arr = new int[] { 1,0 };
		a.moveZeroes(arr);
		System.out.println(Arrays.toString(arr));
	}

}
