/**
 *
 */
package leetcode;

/**
 * @author cc
 * @creation 2015-6-9
 * 
 */
public class ReverseNodesinkGroup {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode result = new ListNode(0);
		ListNode pre = null;
		ListNode kHead = result;
		ListNode kTail = result;
		result.next = head;
		ListNode cur = head;
		ListNode next = head;
		ListNode kNextHead = head;
		boolean reversed = false;
		while (cur != null) {
			kHead = kTail;
			kHead.next = kNextHead;
			for (int i = 0; i < k; i++) {
				next = cur.next;
				cur.next = pre;
				pre = cur;
				cur = next;
				if (cur == null && i != k - 1 && !reversed) {
					i = k - i - 1;
					cur = pre.next;
					next = cur;
					pre.next = null;
					reversed = true;
				}
			}
			kHead.next = pre;
			kTail = kNextHead;
			pre = null;
			kNextHead = cur;
		}
		return result.next;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "123456";
		ReverseNodesinkGroup rng = new ReverseNodesinkGroup();
		ListNode head = null;
		ListNode cur = null;
		if (s != null && s.length() != 0) {
			head = rng.new ListNode(s.charAt(0) - 48);
			cur = head;
			for (int i = 1; i < s.length(); i++) {
				ListNode node = rng.new ListNode(s.charAt(i) - 48);
				cur.next = node;
				cur = node;
			}
		}
		head = rng.reverseKGroup(head, 5);
		while (head != null) {
			System.out.print(head.val);
			head = head.next;
		}
	}

}
