/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 033172
 * @date 2019-01-08 18:15:45
 * @description Invert a binary tree.
 * 
 *              Example:
 * 
 *              Input:
 *              
 *                   4
 *                 /   \
 *                2     7
 *               / \   / \
 *              1   3 6   9
 *              Output:
 *              
 *                   4
 *                 /   \
 *                7     2
 *               / \   / \
 *              9   6 3   1
 * 
 *              Trivia: This problem was inspired by this original tweet by Max
 *              Howell:
 * 
 *              Google: 90% of our engineers use the software you wrote
 *              (Homebrew), but you can’t invert a binary tree on a whiteboard
 *              so f*** off.
 */
public class InvertBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(null);
		System.out.println(q.isEmpty());
	}

	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode node = q.poll();
			if (node.left != null) {
				q.add(node.left);
			}
			if (node.right != null) {
				q.add(node.right);
			}
			TreeNode tmp = node.left;
			node.left = node.right;
			node.right = tmp;
		}
		return root;
	}

	/**
	 * Definition for a binary tree node.
	 * 
	 * @author 033172
	 * @date 2019-01-08 18:17:42
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
