/**
 *
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * 
 * @author 033172
 * @date 2019-01-18 09:40:49
 * @description You are given two non-empty linked lists representing two
 *              non-negative integers. The digits are stored in reverse order
 *              and each of their nodes contain a single digit. Add the two
 *              numbers and return it as a linked list.
 * 
 *              You may assume the two numbers do not contain any leading zero,
 *              except the number 0 itself.
 * 
 *              Example:
 * 
 *              Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 *              Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode head = new ListNode(0);
		ListNode curr = head;
		while (l1 != null && l2 != null) {
			int val = l1.val + l2.val + carry;
			curr.next = new ListNode(val > 9 ? val % 10 : val);
			carry = val > 9 ? 1 : 0;
			curr = curr.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		l1 = l1 == null ? l2 : l1;
		while (l1 != null) {
			int val = l1.val + carry;
			curr.next = new ListNode(val > 9 ? val % 10 : val);
			carry = val > 9 ? 1 : 0;
			curr = curr.next;
			l1 = l1.next;
		}
		if (carry == 1) {
			curr.next = new ListNode(1);
		}
		return head.next;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
