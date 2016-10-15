package leetcode;

public class _328OddEvenLinkedList {
	 public ListNode oddEvenList(ListNode head) {
		 if (head == null) return null;
	        ListNode odd = head, even = head.next, evenHead = even;
	        while (even != null && even.next != null) {
	            odd.next = even.next;
	            odd = odd.next;
	            even.next = odd.next;
	            even = even.next;
	        }
	        odd.next = evenHead;
	        return head;
	    }
	public static void main(String[] args) {
		_328OddEvenLinkedList a = new _328OddEvenLinkedList();
		ListNode head = new ListNode(1,2,3,4);
		System.out.println(a.oddEvenList(head).toString());
	}

}
