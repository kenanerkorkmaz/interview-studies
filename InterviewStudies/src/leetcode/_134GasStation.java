package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class _134GasStation {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int n = gas.length;
		HashMap<Integer, Integer> diff = new HashMap<>();
		for (int i = 0; i < n; i++) {
			diff.put(i, gas[i] - cost[i]);
		}
		Arrays.sort(diff.values().toArray());
//		diff.
		
		return -1;
	}

	public static void main(String[] args) {
	}

}
