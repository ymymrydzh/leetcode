/**
 * 
 */
package leetcode;

/**
 * @author cc
 * @creation 2015-6-8
 * 
 */
public class SwapNodesinPairs {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode swapPairs(ListNode head) {
		ListNode result = new ListNode(0);
		ListNode cur = head;
		ListNode pre = result;
		while (cur != null) {
			if (cur.next == null) {
				pre.next = cur;
				break;
			} else {
				pre.next = cur.next;
				cur.next = cur.next.next;
				pre.next.next = cur;
				pre = cur;
				cur = cur.next;
			}
		}
		return result.next;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "12345";
		SwapNodesinPairs snp = new SwapNodesinPairs();
		ListNode head = null;
		ListNode cur = null;
		if (s != null && s.length() != 0) {
			head = snp.new ListNode(s.charAt(0) - 48);
			cur = head;
			for (int i = 1; i < s.length(); i++) {
				ListNode node = snp.new ListNode(s.charAt(i) - 48);
				cur.next = node;
				cur = node;
			}
		}
		head = snp.swapPairs(head);
		while (head != null) {
			System.out.print(head.val);
			head = head.next;
		}
	}

}
