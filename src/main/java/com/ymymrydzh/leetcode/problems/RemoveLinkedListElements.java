/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-03 16:31:27
 * @description Remove all elements from a linked list of integers that have
 *              value val.
 * 
 *              Example:
 * 
 *              Input: 1->2->6->3->4->5->6, val = 6 Output: 1->2->3->4->5
 */
public class RemoveLinkedListElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RemoveLinkedListElements r = new RemoveLinkedListElements();
		int[] v = { 1, 2, 2, 1 };
		int val = 2;
		ListNode head = r.new ListNode(0);
		ListNode p = head;
		for (int i : v) {
			p.next = r.new ListNode(i);
			p = p.next;
		}
		System.out.println(r.removeElements(head, val));
	}

	public ListNode removeElements(ListNode head, int val) {
		while (head != null && head.val == val) {
			head = head.next;
		}
		ListNode p = head;
		while (p != null && p.next != null) {
			if (p.next.val == val) {
				p.next = p.next.next;
			} else {
				p = p.next;
			}
		}
		return head;
	}

	/**
	 * Definition for singly-linked list.
	 * 
	 * @author 033172
	 * @date 2019-01-03 16:32:00
	 * @description
	 */
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
