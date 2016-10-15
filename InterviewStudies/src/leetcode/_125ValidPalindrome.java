package leetcode;

public class _125ValidPalindrome {

	public boolean isPalindrome(String s) {
		if (s == null) {
			return false;
		}
		if (s.trim().isEmpty()) {
			return true;
		}
		int j = s.length() - 1;
		for (int i = 0; i < j; i++) {
			if (!Character.isLetterOrDigit(s.charAt(i))) {
				continue;
			}
			while (!Character.isLetterOrDigit(s.charAt(j)) && (j > i)) {
				j--;
			}
			if (j <= i) {
				return true;
			}
			if (!String.valueOf(s.charAt(i)).toLowerCase()
					.equals(String.valueOf(s.charAt(j)).toLowerCase())) {
				return false;
			}
			j--;
		}

		return true;
	}

	public static void main(String[] args) {
		_125ValidPalindrome a = new _125ValidPalindrome();
		System.out.println("race a car: " + a.isPalindrome("race a car"));
		System.out.println("A man, a plan, a canal: Panama: "
				+ a.isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println("null: " + a.isPalindrome(null));
		System.out.println("bos: " + a.isPalindrome(""));
		System.out.println("bos: " + a.isPalindrome("        "));

	}

}
