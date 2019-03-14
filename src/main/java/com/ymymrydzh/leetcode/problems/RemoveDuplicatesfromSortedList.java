/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author cc
 * @date 2018年12月19日10:26:38
 * @description Given a sorted linked list, delete all duplicates such that each
 *              element appear only once.
 * 
 *              Example 1:
 * 
 *              Input: 1->1->2 Output: 1->2
 * 
 *              Example 2:
 * 
 *              Input: 1->1->2->3->3 Output: 1->2->3
 */
public class RemoveDuplicatesfromSortedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RemoveDuplicatesfromSortedList sm = new RemoveDuplicatesfromSortedList();
		ListNode head = sm.new ListNode(1);
		head.next = sm.new ListNode(1);
		head.next.next = sm.new ListNode(2);
		head.next.next.next = sm.new ListNode(2);
		sm.deleteDuplicates(null);
		System.out.println();
	}

	public ListNode deleteDuplicates(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}
		ListNode n = head;
		while (n != null) {
			n = n.next;
			while (n != null && n.next != null && n.val == n.next.val) {
				n.next = n.next.next;
			}
		}
		return head.val == head.next.val ? head.next : head;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
