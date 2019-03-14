/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author cc
 * @date 2018年12月12日19:32:48
 * @description Merge two sorted linked lists and return it as a new list. The
 *              new list should be made by splicing together the nodes of the
 *              first two lists.
 * 
 *              Example:
 * 
 *              Input: 1->2->4, 1->3->4 Output: 1->1->2->3->4->4
 */
public class MergeTwoSortedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode c = l1 == null ? l2 == null ? null : l2 : l2 == null ? l1 : l1.val <= l2.val ? l1 : l2;
		if (c == null) {
			return null;
		}
		c.next = mergeTwoLists(c.next, c == l1 ? l2 : l1);
		return c;

		// ListNode c = new ListNode(0);
		// ListNode r = c;
		// while (l1 != null && l2 != null) {
		// if (l1.val < l2.val) {
		// c.next = l1;
		// l1 = l1.next;
		// } else {
		// c.next = l2;
		// l2 = l2.next;
		// }
		// c = c.next;
		// }
		// c.next = l1 == null ? l2 : l1;
		// return r.next;

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

}
