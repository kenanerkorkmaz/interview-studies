package leetcode;

public class _27RemoveElement {
	public int removeElement(int[] nums, int val) {
		int length = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[length++] = nums[i];
			}
		}
		return length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
