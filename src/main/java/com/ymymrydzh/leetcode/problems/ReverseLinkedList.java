/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-04 17:41:58
 * @description Reverse a singly linked list.
 * 
 *              Example:
 * 
 *              Input: 1->2->3->4->5->NULL Output: 5->4->3->2->1->NULL
 * 
 *              Follow up:
 * 
 *              A linked list can be reversed either iteratively or recursively.
 *              Could you implement both?
 */
public class ReverseLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public ListNode reverseList(ListNode head) {
		// ListNode newhead = null;
		// while (head != null) {
		// ListNode curr = new ListNode(head.val);
		// curr.next = newhead;
		// newhead = curr;
		// head = head.next;
		// }
		// return newhead;

		ListNode pre = null;
		ListNode next = null;
		while (head != null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}

	/**
	 * Definition for singly-linked list.
	 * 
	 * @author 033172
	 * @date 2019-01-04 17:42:44
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
