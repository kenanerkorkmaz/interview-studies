package leetcode;

import java.util.HashMap;

public class _070ClimbingStairs {
	public static HashMap<Integer, Integer> map = new HashMap<>();

	public int climbStairs(int n) {
		if (map.get(n) != null) {
			return map.get(n);
		}
		if (n == 1 || n == 2) {
			map.put(n, 1);
			return 1;
		}
		int result = climbStairs(n - 1) + climbStairs(n - 2);
		map.put(n, result);
		return result;
	}

	public static void main(String[] args) {
		_070ClimbingStairs a = new _070ClimbingStairs();
		System.out.println(a.climbStairs(4));
	}

}
