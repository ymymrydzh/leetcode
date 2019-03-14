/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-09 16:06:29
 * @description Write a function to delete a node (except the tail) in a singly
 *              linked list, given only access to that node.
 * 
 *              Given linked list -- head = [4,5,1,9], which looks like
 *              following:
 * 
 *              4 -> 5 -> 1 -> 9
 * 
 *              Example 1:
 * 
 *              Input: head = [4,5,1,9], node = 5 Output: [4,1,9] Explanation:
 *              You are given the second node with value 5, the linked list
 *              should become 4 -> 1 -> 9 after calling your function.
 * 
 *              Example 2:
 * 
 *              Input: head = [4,5,1,9], node = 1 Output: [4,5,9] Explanation:
 *              You are given the third node with value 1, the linked list
 *              should become 4 -> 5 -> 9 after calling your function. Note:
 * 
 *              <li>The linked list will have at least two elements.
 *              <li>All of the nodes' values will be unique.
 *              <li>The given node will not be the tail and it will always be a
 *              valid node of the linked list.
 *              <li>Do not return anything from your function.
 */
public class DeleteNodeinaLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

	/**
	 * Definition for singly-linked list.
	 * 
	 * @author 033172
	 * @date 2019-01-09 16:06:59
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
