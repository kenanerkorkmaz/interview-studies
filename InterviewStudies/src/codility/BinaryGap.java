package codility;

public class BinaryGap {
	public int solution(int N) {
		String s = Integer.toBinaryString(N);
		int maxLength = 0;
		boolean gapStarted = false;
		int gap = 0;
		for (int i = 0; i<s.length();i++) {
			if (s.charAt(i) == '1' && gap == 0) {
				gapStarted = true;
			} else if (s.charAt(i) == '0' && gapStarted) {
				gap++;
			} else if (s.charAt(i) == '1' && gap > 0) {
				if (gap > maxLength) {
					maxLength = gap;
				}
				gap = 0;
			}
		}
		return maxLength;
    }
	public static void main(String[] args) {
		BinaryGap a = new BinaryGap();
		System.out.println(a.solution(1162));
		System.out.println(a.solution(6));
		System.out.println(a.solution(328));
		System.out.println(a.solution(0));
		System.out.println(a.solution(1));
		System.out.println(a.solution(9));
		System.out.println(a.solution(529));
		System.out.println(a.solution(20));
		System.out.println(a.solution(15));
		System.out.println(a.solution(1041));
	}

}
