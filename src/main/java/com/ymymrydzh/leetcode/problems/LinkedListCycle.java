/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2018-12-27 18:04:01
 * @description Given a linked list, determine if it has a cycle in it.
 * 
 *              To represent a cycle in the given linked list, we use an integer
 *              pos which represents the position (0-indexed) in the linked list
 *              where tail connects to. If pos is -1, then there is no cycle in
 *              the linked list.
 * 
 *              Example 1:
 * 
 *              Input: head = [3,2,0,-4], pos = 1 Output: true Explanation:
 *              There is a cycle in the linked list, where tail connects to the
 *              second node.
 * 
 *              Example 2:
 * 
 *              Input: head = [1,2], pos = 0 Output: true Explanation: There is
 *              a cycle in the linked list, where tail connects to the first
 *              node.
 * 
 *              Example 3:
 * 
 *              Input: head = [1], pos = -1 Output: false Explanation: There is
 *              no cycle in the linked list.
 * 
 *              Follow up:
 * 
 *              Can you solve it using O(1) (i.e. constant) memory?
 */
public class LinkedListCycle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public boolean hasCycle(ListNode head) {
		while (head != null) {
			if (head.val == Integer.MAX_VALUE) {
				return true;
			}
			head.val = Integer.MAX_VALUE;
			head = head.next;
		}
		return false;

		// if (head == null || head.next == null) {
		// return false;
		// }
		// ListNode slow = head;
		// ListNode fast = head.next;
		// while (slow != fast) {
		// if (fast == null || fast.next == null) {
		// return false;
		// }
		// slow = slow.next;
		// fast = fast.next.next;
		// }
		// return true;
	}

	/**
	 * Definition for singly-linked list.
	 * 
	 * @author 033172
	 * @date 2018-12-28 08:55:00
	 * @description
	 */
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}
