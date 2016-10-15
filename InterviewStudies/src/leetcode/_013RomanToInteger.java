package leetcode;

import java.util.HashMap;

public class _013RomanToInteger {

	public int romanToInt(String s) {
		int n = s.length();

		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int result = 0;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			int next = map.get(s.charAt(i));
			if (temp != 0) {
				if (temp < next) {
					result += next - temp;
					temp = 0;
				} else {
					result += temp;
					temp = next;
				}
			} else {
				temp = map.get(s.charAt(i));
			}
		}
		if (temp != 0) {
			result += temp;
		}
		return result;
	}

	public static void main(String[] args) {
		_013RomanToInteger a = new _013RomanToInteger();
//		System.out.println(a.romanToInt("MCM"));
//		System.out.println(a.romanToInt("I"));
//		System.out.println(a.romanToInt("II"));
//		System.out.println(a.romanToInt("IV"));
//		System.out.println(a.romanToInt("IX"));
//		System.out.println(a.romanToInt("MMXIV"));
//		System.out.println(a.romanToInt("MCMLIV"));
//		System.out.println(a.romanToInt("MCMXC"));
		System.out.println(a.romanToInt("MMCDXIV"));
	}

}
