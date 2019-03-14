/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 033172
 * @date 2019-01-07 18:22:25
 * @description Implement the following operations of a stack using queues.
 * 
 *              <li>push(x) -- Push element x onto stack.
 *              <li>pop() -- Removes the element on top of the stack.
 *              <li>top() -- Get the top element.
 *              <li>empty() -- Return whether the stack is empty. Example:
 * 
 *              <li>MyStack stack = new MyStack();
 *              <li>stack.push(1);
 *              <li>stack.push(2);
 *              <li>stack.top(); // returns 2
 *              <li>stack.pop(); // returns 2
 *              <li>stack.empty(); // returns false
 * 
 *              Notes:
 * 
 *              <li>You must use only standard operations of a queue -- which
 *              means only push to back, peek/pop from front, size, and is empty
 *              operations are valid.
 *              <li>Depending on your language, queue may not be supported
 *              natively. You may simulate a queue by using a list or deque
 *              (double-ended queue), as long as you use only standard
 *              operations of a queue.
 *              <li>You may assume that all operations are valid (for example,
 *              no pop or top operations will be called on an empty stack).
 */
public class ImplementStackusingQueues {

	Queue<Integer> queue;

	/**
	 * Your MyStack object will be instantiated and called as such:
	 * <li>MyStack obj = new MyStack();
	 * <li>obj.push(x);
	 * <li>int param_2 = obj.pop();
	 * <li>int param_3 = obj.top();
	 * <li>boolean param_4 = obj.empty();
	 */
	public static void main(String[] args) {

	}

	/** Initialize your data structure here. */
	public ImplementStackusingQueues() {
		queue = new LinkedList<>();
	}

	/** Push element x onto stack. */
	public void push(int x) {
		Queue<Integer> newqueue = new LinkedList<>();
		newqueue.add(x);
		while (!queue.isEmpty()) {
			int n = queue.poll();
			newqueue.add(n);
		}
		queue = newqueue;
	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		return queue.poll();
	}

	/** Get the top element. */
	public int top() {
		return queue.peek();
	}

	/** Returns whether the stack is empty. */
	public boolean empty() {
		return queue.isEmpty();
	}
}
