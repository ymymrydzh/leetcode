/**
 * 
 */
package leetcode;

/**
 * @author cc
 * @creation 2015-6-4
 * 
 */
public class RemoveNthNodeFromEndofList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head != null) {
			ListNode target = head;
			ListNode current = head;
			while (current.next != null && n > 0) {
				current = current.next;
				n--;
			}
			if (n == 0) {
				while (current.next != null) {
					current = current.next;
					target = target.next;
				}
				target.next = target.next.next;
			} else if (n == 1) {
				head = head.next;
			}
		}
		return head;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "12345";
		RemoveNthNodeFromEndofList rnfe = new RemoveNthNodeFromEndofList();

		ListNode head = null;
		ListNode cur = null;
		if (s != null && s.length() != 0) {
			head = rnfe.new ListNode(s.charAt(0) - 48);
			cur = head;
			for (int i = 1; i < s.length(); i++) {
				ListNode node = rnfe.new ListNode(s.charAt(i) - 48);
				cur.next = node;
				cur = node;
			}
		}
		head = rnfe.removeNthFromEnd(head, 2);
		while (head != null) {
			System.out.print(head.val);
			head = head.next;
		}
	}

}
