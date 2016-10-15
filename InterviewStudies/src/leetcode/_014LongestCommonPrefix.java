package leetcode;

public class _014LongestCommonPrefix {

	public static void main(String args[]) {
		System.out.println("X" + "deneme".substring(0, 0) + "X");
	}

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		String prefix = strs[0];
		if (strs.length == 1) {
			return prefix;
		}
		for (int i = 1; i < strs.length; i++) {
			if (strs[i].length() == 0) {
				return "";
			}
			if (strs[i].length() < prefix.length()) {
				prefix = prefix.substring(0, strs[i].length());
			}
			for (int j = 0; j < Math.min(strs[i].length(), prefix.length()); j++) {
				if (prefix.charAt(j) != strs[i].charAt(j)) {
					prefix = prefix.substring(0, j);
					break;
				}
			}
		}
		return prefix;
	}
}
