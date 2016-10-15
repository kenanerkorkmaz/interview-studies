package leetcode;

public class _026RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int length = 1;
		int i = 0;
		if (nums.length == 1) {
			return 1;
		} else {
			int j = i + 1;
			for (j = i + 1; j < nums.length; j++) {
				if (nums[j] != nums[i]) {
					nums[++i] = nums[j];
					length++;
				}
			}
		}
		return length;
	}

	public static void main(String[] args) {
		_026RemoveDuplicatesFromSortedArray a = new _026RemoveDuplicatesFromSortedArray();
		System.out.println(a.removeDuplicates(new int[] { 1, 1, 2 }));
		System.out.println(a.removeDuplicates(null));
		System.out.println(a.removeDuplicates(new int[] {}));
		System.out.println(a.removeDuplicates(new int[] { 1 }));
	}

}
