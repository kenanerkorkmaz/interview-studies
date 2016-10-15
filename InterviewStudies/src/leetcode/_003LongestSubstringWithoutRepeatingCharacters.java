package leetcode;

public class _003LongestSubstringWithoutRepeatingCharacters {
	//sliding window
	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.isEmpty()) {
			return 0;
		}
		int length = 0;
		int max = 0;
		String sub = "";
		for (int i = 0; i < s.length(); i++) {
			String c = String.valueOf(s.charAt(i));
			if (!sub.contains(c)) {
				sub += c;
				length++;
			} else {
				if (length > max) {
					max = length;
				}
				if (sub.length() == 1) {
					sub = c;
				} else {
					sub = sub.substring(sub.indexOf(c) + 1) + c;
				}
				length = sub.length();
			}
		}

		return Math.max(length, max);
	}

	public static void main(String[] args) {
		_003LongestSubstringWithoutRepeatingCharacters a = new _003LongestSubstringWithoutRepeatingCharacters();
		System.out.println(a.lengthOfLongestSubstring(null));
		System.out.println(a.lengthOfLongestSubstring(""));
		System.out.println(a.lengthOfLongestSubstring("abcabcbb"));
		System.out.println(a.lengthOfLongestSubstring("bbbbb"));
		System.out.println(a.lengthOfLongestSubstring("pwwkew"));
		System.out.println(a.lengthOfLongestSubstring("dvdf"));
	}

}
