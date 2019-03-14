/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-09 10:32:58
 * @description Given a singly linked list, determine if it is a palindrome.
 * 
 *              Example 1:
 * 
 *              Input: 1->2 Output: false
 * 
 *              Example 2:
 * 
 *              Input: 1->2->2->1 Output: true
 * 
 *              Follow up: Could you do it in O(n) time and O(1) space?
 */
public class PalindromeLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PalindromeLinkedList p = new PalindromeLinkedList();
		int[] nums = { 1, 2, 2, 2, 1 };
		ListNode head = p.new ListNode(0);
		ListNode cr = head;
		for (int i : nums) {
			cr.next = p.new ListNode(i);
			cr = cr.next;
		}
		System.out.println(p.isPalindrome(head.next));
	}

	public boolean isPalindrome(ListNode head) {
		// List<Integer> list = new ArrayList<>();
		// while (head != null) {
		// list.add(head.val);
		// head = head.next;
		// }
		// for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
		// if (!list.get(i).equals(list.get(j))) {
		// return false;
		// }
		// }
		// return true;

		ListNode mid = head;
		ListNode tail = head;
		ListNode pre = null;
		int i = 0;
		while (tail != null) {
			tail = tail.next;
			if (i++ % 2 == 0) {
				head = mid;
				mid = mid.next;
				head.next = pre;
				pre = head;
			}
		}
		if (i % 2 == 1) {
			head = head.next;
		}
		while (mid != null) {
			if (mid.val != head.val) {
				return false;
			}
			mid = mid.next;
			head = head.next;
		}
		return true;
	}

	/**
	 * Definition for singly-linked list.
	 * 
	 * @author 033172
	 * @date 2019-01-09 10:33:21
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
