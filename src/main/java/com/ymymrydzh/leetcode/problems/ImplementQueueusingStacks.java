/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

import java.util.Stack;

/**
 * @author 033172
 * @date 2019-01-07 18:43:55
 * @description Implement the following operations of a queue using stacks.
 * 
 *              <li>push(x) -- Push element x to the back of queue.
 *              <li>pop() -- Removes the element from in front of queue.
 *              <li>peek() -- Get the front element.
 *              <li>empty() -- Return whether the queue is empty. Example:
 * 
 *              <li>MyQueue queue = new MyQueue();
 *              <li>queue.push(1);
 *              <li>queue.push(2);
 *              <li>queue.peek(); // returns 1
 *              <li>queue.pop(); // returns 1
 *              <li>queue.empty(); // returns false Notes:
 * 
 *              <li>You must use only standard operations of a stack -- which
 *              means only push to top, peek/pop from top, size, and is empty
 *              operations are valid.
 *              <li>Depending on your language, stack may not be supported
 *              natively. You may simulate a stack by using a list or deque
 *              (double-ended queue), as long as you use only standard
 *              operations of a stack.
 *              <li>You may assume that all operations are valid (for example,
 *              no pop or peek operations will be called on an empty queue).
 */
public class ImplementQueueusingStacks {

	Stack<Integer> stack;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	/** Initialize your data structure here. */
	public ImplementQueueusingStacks() {
		stack = new Stack<>();
	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		if (!stack.empty()) {
			int n = stack.pop();
			push(x);
			stack.push(n);
		} else {
			stack.push(x);
		}
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		return stack.pop();
	}

	/** Get the front element. */
	public int peek() {
		return stack.peek();
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return stack.empty();
	}
}
