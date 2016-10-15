package leetcode;

public class _151ReverseWordsInAString {

	public String reverseWords(String s) {
		if (s == null) {
			return null;
		}
		s = s.trim();
		if (s.isEmpty()) {
			return "";
		}
		String[] words = s.split(" ");
		String val = words[words.length - 1].trim();
		for (int i = words.length - 2; i >= 0; i--) {
			if (!words[i].trim().isEmpty()) {
				val += " " + words[i].trim();
			}
		}
		return val;
	}

	public static void main(String args[]) {
		_151ReverseWordsInAString a = new _151ReverseWordsInAString();
		System.out.println(a.reverseWords(null));
		System.out.println(a.reverseWords(""));
		System.out.println(a.reverseWords("     the sky is        blue      "));
		System.out.println(a.reverseWords("   a   b "));
	}
}
