/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-02 08:49:22
 * @description Write a program to find the node at which the intersection of
 *              two singly linked lists begins.
 * 
 *              For example, the following two linked lists:
 * 
 *              begin to intersect at node c1.
 *              <li>A: a1->a2->c1->c2->c3
 *              <li>B: b1->b2->b3->c1->c2->c3
 * 
 *              Example 1:
 *              <li>A: 4->1->8->4->5
 *              <li>B: 5->0->1->8->4->5
 * 
 *              Input: intersectVal = 8, listA = [4,1,8,4,5], listB =
 *              [5,0,1,8,4,5], skipA = 2, skipB = 3
 * 
 *              Output: Reference of the node with value = 8 Input
 * 
 *              Explanation: The intersected node's value is 8 (note that this
 *              must not be 0 if the two lists intersect). From the head of A,
 *              it reads as [4,1,8,4,5]. From the head of B, it reads as
 *              [5,0,1,8,4,5]. There are 2 nodes before the intersected node in
 *              A; There are 3 nodes before the intersected node in B.
 * 
 *              Example 2:
 *              <li>A: 0->9->1->2->4
 *              <li>B: 3->2->4
 * 
 *              Input: intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4],
 *              skipA = 3, skipB = 1
 * 
 *              Output: Reference of the node with value = 2 Input
 * 
 *              Explanation: The intersected node's value is 2 (note that this
 *              must not be 0 if the two lists intersect). From the head of A,
 *              it reads as [0,9,1,2,4]. From the head of B, it reads as
 *              [3,2,4]. There are 3 nodes before the intersected node in A;
 *              There are 1 node before the intersected node in B.
 * 
 *              Example 3:
 *              <li>A: 2->6->4
 *              <li>B: 1->5
 * 
 *              Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA =
 *              3, skipB = 2
 * 
 *              Output: null Input
 * 
 *              Explanation: From the head of A, it reads as [2,6,4]. From the
 *              head of B, it reads as [1,5]. Since the two lists do not
 *              intersect, intersectVal must be 0, while skipA and skipB can be
 *              arbitrary values. Explanation: The two lists do not intersect,
 *              so return null.
 * 
 *              Notes:
 * 
 *              If the two linked lists have no intersection at all, return
 *              null. The linked lists must retain their original structure
 *              after the function returns. You may assume there are no cycles
 *              anywhere in the entire linked structure. Your code should
 *              preferably run in O(n) time and use only O(1) memory.
 */
public class IntersectionofTwoLinkedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IntersectionofTwoLinkedLists i = new IntersectionofTwoLinkedLists();
		ListNode inter = i.new ListNode(8);
		inter.next = i.new ListNode(4);
		inter.next.next = i.new ListNode(5);
		ListNode headA = i.new ListNode(4);
		headA.next = i.new ListNode(1);
		headA.next.next = inter;
		ListNode headB = i.new ListNode(5);
		headB.next = i.new ListNode(0);
		headB.next.next = i.new ListNode(1);
		headB.next.next.next = inter;
		System.out.println(i.getIntersectionNode(i.new ListNode(8), null));
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		// A、B交叉，尾部对齐
		// ListNode p1 = headA;
		// ListNode p2 = headB;
		// boolean t1 = true;
		// boolean t2 = true;
		// while (p1 != null && p2 != null) {
		// if (p1 == p2) {
		// return p1;
		// } else {
		// if (p1.next == null && t1) {
		// p1 = headB;
		// t1 = false;
		// } else {
		// p1 = p1.next;
		// }
		// if (p2.next == null && t2) {
		// p2 = headA;
		// t2 = false;
		// } else {
		// p2 = p2.next;
		// }
		// }
		// }
		// return null;

		// 去长度后，直接尾部对齐
		ListNode p1 = headA;
		ListNode p2 = headB;
		int l1 = 0;
		int l2 = 0;
		while (p1 != null) {
			p1 = p1.next;
			l1++;
		}
		while (p2 != null) {
			p2 = p2.next;
			l2++;
		}
		p1 = headA;
		p2 = headB;
		while (l1 > l2) {
			p1 = p1.next;
			l1--;
		}
		while (l1 < l2) {
			p2 = p2.next;
			l2--;
		}
		while (p1 != p2) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}

	/**
	 * Definition for singly-linked list.
	 * 
	 * @author 033172
	 * @date 2019-01-02 08:56:26
	 * @description
	 */
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}
