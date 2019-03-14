/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 033172
 * @date 2019-01-15 08:44:09
 * @description Find the sum of all left leaves in a given binary tree.
 * 
 *              Example:
 * 
 *              <code>
 *                  3
 *                 / \
 *                9  20
 *                  /  \
 *                 15   7
 * 				</code>
 * 
 *              There are two left leaves in the binary tree, with values 9 and
 *              15 respectively. Return 24.
 */
public class SumofLeftLeaves {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null) {
			return 0;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		int sum = 0;
		while (!q.isEmpty()) {
			TreeNode t = q.poll();
			if (t.left != null) {
				if (t.left.left != null || t.left.right != null) {
					q.add(t.left);
				} else {
					sum += t.left.val;
				}
			}
			if (t.right != null) {
				if (t.right.left != null || t.right.right != null) {
					q.add(t.right);
				}
			}
		}
		return sum;
	}

	/**
	 * Definition for a binary tree node.
	 * 
	 * @author 033172
	 * @date 2019-01-15 08:44:37
	 * @description
	 */
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
