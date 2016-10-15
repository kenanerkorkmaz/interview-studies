package leetcode;

public class _55JumpGame {
	public boolean canJump(int[] nums) {
		int n = nums.length-1;
		int index = 0;
		while (index < n && nums[index] != 0) {
			index += nums[index];
		}
		if (index >= n) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		_55JumpGame a = new _55JumpGame();
		System.out.println(a.canJump(new int[]{0}));
	}

}
