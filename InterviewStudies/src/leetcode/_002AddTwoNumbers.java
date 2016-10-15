package leetcode;

public class _002AddTwoNumbers {
	ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		}
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		int carry = 0;
		ListNode head = new ListNode((l1.val + l2.val) % 10);
		ListNode last = head;
		if (l1.val + l2.val >= 10) {
			carry = 1;
		}
		l1 = l1.next;
		l2 = l2.next;

		int val1 = 0;
		int val2 = 0;
		while (l1 != null || l2 != null) {
			if (l1 != null) {
				val1 = l1.val;
				l1 = l1.next;
			} else {
				val1 = 0;
			}
			if (l2 != null) {
				val2 = l2.val;
				l2 = l2.next;
			} else {
				val2 = 0;
			}
			int sum = val1 + val2 + carry;
			last.next = new ListNode(sum % 10);
			last = last.next;
			carry = sum / 10;

		}
		if (carry == 1) {
			last.next = new ListNode(carry);
		}
		return head;
	}

	public static void main(String args[]) {
		_002AddTwoNumbers a = new _002AddTwoNumbers();
		System.out.println(a
				.addTwoNumbers(new ListNode(1), new ListNode(9, 9, 9, 9, 9, 9,
						9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
						9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
						9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
						9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
						9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9))
				.toString());
	}

}