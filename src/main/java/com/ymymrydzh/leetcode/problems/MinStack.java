/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2018-12-28 10:00:19
 * @description Design a stack that supports push, pop, top, and retrieving the
 *              minimum element in constant time.
 * 
 *              <li>push(x) -- Push element x onto stack.
 *              <li>pop() -- Removes the element on top of the stack.
 *              <li>top() -- Get the top element.
 *              <li>getMin() -- Retrieve the minimum element in the stack.
 * 
 *              Example:
 * 
 *              <li>MinStack minStack = new MinStack();
 *              <li>minStack.push(-2);
 *              <li>minStack.push(0);
 *              <li>minStack.push(-3);
 *              <li>minStack.getMin(); --> Returns -3.
 *              <li>minStack.pop();
 *              <li>minStack.top(); --> Returns 0.
 *              <li>minStack.getMin(); --> Returns -2.
 * 
 *              Your MinStack object will be instantiated and called as such:
 *              <li>MinStack obj = new MinStack();
 *              <li>obj.push(x); obj.pop();
 *              <li>int param_3 = obj.top();
 *              <li>int param_4 = obj.getMin();
 * 
 */
public class MinStack {

	ListNode head;

	class ListNode {
		int val;
		int min;
		ListNode next;

		ListNode(int x, ListNode head) {
			val = x;
			min = head == null || x < head.min ? x : head.min;
			next = head;
		}
	}

	/** initialize your data structure here. */
	public MinStack() {
	}

	public void push(int x) {
		head = new ListNode(x, head);
	}

	public void pop() {
		head = head.next;
	}

	public int top() {
		return head.val;
	}

	public int getMin() {
		return head.min;
	}

}
