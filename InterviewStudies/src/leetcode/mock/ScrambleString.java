package leetcode.mock;

import java.util.HashMap;
import java.util.Map;

public class ScrambleString {

	public boolean isScramble(String s1, String s2) {
		if (s1 == null) {
			if (s2 == null) {
				return true;
			} else {
				return false;
			}
		}
		if (s1.equals(s2)) {
			return true;
		}
		if (s1.isEmpty()) {
			if (s2.isEmpty()) {
				return true;
			} else {
				return false;
			}
		}
		if (s1.length() != s2.length()) {
			return false;
		}
		Map<Character, Integer> m1 = new HashMap<Character, Integer>();
		Map<Character, Integer> m2 = new HashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			Character c = s1.charAt(i);
			if (m1.get(c) != null) {
				m1.put(c, m1.get(c) + 1);
			} else {
				m1.put(c, 1);
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			Character c = s2.charAt(i);
			if (m2.get(c) != null) {
				m2.put(c, m2.get(c) + 1);
			} else {
				m2.put(c, 1);
			}
		}
		if (!m1.equals(m2)) {
			return false;
		}
		int L = s1.length();
		for (int i = 1; i < L; i++) {
            String s11 = s1.substring(0, i);
            String s12 = s1.substring(i, L);
            String s21 = s2.substring(0, i);
            String s22 = s2.substring(i, L);
            if (isScramble(s11, s21) && isScramble(s12, s22))
                return true;
            s21 = s2.substring(0, L - i);
            s22 = s2.substring(L - i, L);
            if (isScramble(s11, s22) && isScramble(s12, s21))
                return true;
        }
		return false;
	}

	public static void main(String[] args) {

	}

}
