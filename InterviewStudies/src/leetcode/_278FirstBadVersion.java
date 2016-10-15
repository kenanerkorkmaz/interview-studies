package leetcode;

public class _278FirstBadVersion {
	public static int first = 8;

	boolean isBadVersion(int version) {
		if (version <= first - 1) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		_278FirstBadVersion a = new _278FirstBadVersion();
		System.out.println(a.firstBadVersion(1000));

	}

	public int firstBadVersion(int n) {
		return firstBadVersion(1, n, n);
	}

	public int firstBadVersion(int min, int max, int n) {
		System.out.println("min: " + min + " max: " + max + " n: " + n);
		int test = min + (max - min) / 2;
		if (isBadVersion(test) == false && isBadVersion(test + 1) == true) {
			return test + 1;
		} else if (isBadVersion(test) == false
				&& isBadVersion(test + 1) == false) {
			return firstBadVersion(test, max, n);
		} else
			if (isBadVersion(test) == true && isBadVersion(test + 1) == true) {
			return firstBadVersion(min, test, n);
		} else {
			return -1;
		}
	}

}
