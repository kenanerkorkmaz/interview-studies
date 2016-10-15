package leetcode;

public class _028ImplementStrStr {
	public int strStr(String haystack, String needle) {
		if (haystack == null) {
			return 0;
		}
		return haystack.indexOf(needle);
	}

	public static void main(String[] args) {
		_028ImplementStrStr a = new _028ImplementStrStr();
		System.out.println(a.strStr("", ""));
	}

}
