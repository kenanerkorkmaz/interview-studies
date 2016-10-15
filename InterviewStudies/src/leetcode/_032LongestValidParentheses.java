package leetcode;

public class _032LongestValidParentheses {
	public int longestValidParentheses(String s) {
		if (s == null || s.trim().isEmpty()) {
			return 0;
		}
		int length = 0;
		return length;
	}

	public static void main(String[] args) {
		_032LongestValidParentheses a = new _032LongestValidParentheses();
		System.out.println(a.longestValidParentheses(null));
		System.out.println(a.longestValidParentheses(""));
		System.out.println(a.longestValidParentheses("()"));
	}

}
