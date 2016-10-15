package leetcode;

public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}

	ListNode(int x, ListNode n) {
		val = x;
		next = n;
	}

	ListNode(int x, int... args) {
		val = x;
		if (args == null || args.length == 0) {
			next = null;
		} else {
			int[] newArg = null;
			if (args.length > 1) {
				newArg = new int[args.length - 1];
				for (int i = 1; i < args.length; i++) {
					newArg[i - 1] = args[i];
				}
			}
			next = new ListNode(args[0], newArg);
		}
	}

	public String toString() {
		String str = "[" + val;
		ListNode iter = next;
		while (iter != null) {
			str += "," + iter.val;
			iter = iter.next;
		}
		return str + "]";
	}

	public static void main(String args[]) {
		ListNode node = new ListNode(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
		System.out.println(node.toString());
	}

}
