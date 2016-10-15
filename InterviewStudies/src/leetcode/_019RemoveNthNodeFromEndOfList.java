package leetcode;

public class _019RemoveNthNodeFromEndOfList {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null) {
			return null;
		}
		if (n == 0) {
			return head;
		}
		if (n < 0) {
			throw new IllegalArgumentException("negative index not allowed");
		}
		ListNode first = head;
		ListNode second = head;
		for (int i = 0; i < n; i++) {
			second = second.next;
		}
		if (second == null) {
			return head.next;
		}
		while (second.next != null) {
			first = first.next;
			second = second.next;
		}
		first.next = first.next.next;
		return head;
	}

}
