package leetcode;

import java.util.HashMap;

public class _001TwoSums {

	//one-pass hash table
	//look for each item's compliment while adding each element to map
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.get(target - nums[i]) != null) {
				return new int[] { map.get(target - nums[i]), i };
			} else {
				map.put(nums[i], i);
			}
		}
		return null;
	}

	public static void main(String[] args) {
		_001TwoSums a = new _001TwoSums();
		a.twoSum(new int[] { 3, 2, 4 }, 6);
	}
}