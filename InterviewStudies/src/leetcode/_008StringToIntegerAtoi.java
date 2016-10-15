package leetcode;

public class _008StringToIntegerAtoi {
	public int myAtoi(String str) {
		if (str == null || str.trim().isEmpty()) {
			return 0;
		}
		int result = 0;
		str = str.trim();
		int i = 0;
		if (str.charAt(0) == '-' || str.charAt(0) == '+') {
			i = 1;
		}

		for (; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				str = str.substring(0, i);
				break;
			}
		}
		if (str.isEmpty() || str.equals("+") || str.equals("-")) {
			return 0;
		}
		try {
			if (Double.valueOf(str) > Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			} else if (Double.valueOf(str) < Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}
			result = Integer.valueOf(str);
		} catch (Exception e) {
		}
		return result;
	}

	public static void main(String[] args) {
		_008StringToIntegerAtoi a = new _008StringToIntegerAtoi();
		// System.out.println(a.myAtoi(null));
		// System.out.println(a.myAtoi(""));
		// System.out.println(a.myAtoi(" "));
		System.out.println(a.myAtoi("9223372036854775809"));
		System.out.println(a.myAtoi("   3"));
		System.out.println(a.myAtoi("   3  4"));
	}

}
