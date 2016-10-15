package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class _167TwoSumII {

	public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			if (map.get(target - numbers[i]) != null) {
				return new int[] { map.get(target - numbers[i]) + 1, i + 1};
			} else {
				map.put(numbers[i], i);
			}
		}
		return null;
	}

	public void print(int[] num) {
		System.out.println(Arrays.toString(num));
	}

	public static void main(String[] args) {
		_167TwoSumII a = new _167TwoSumII();
		a.print(a.twoSum(new int[] { 1, 2, 3, 4, 4, 9, 56, 90 }, 8));
		a.print(a.twoSum(new int[] {}, 0));
		a.print(a.twoSum(new int[] { 2, 7, 11, 15 }, 9));
		int[] arr = new int[65536];
		for (int i = 0; i < 32767; i++) {
			arr[i] = 0;
		}
		arr[32767] = 2;
		arr[32768] = 3;
		for (int i = 32769; i < 65536; i++) {
			arr[i] = 9;
		}
		a.print(a.twoSum(arr, 5));

	}
}
