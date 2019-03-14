/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2018-12-19 16:16:21
 * @description Given a binary tree, find its maximum depth.
 * 
 *              The maximum depth is the number of nodes along the longest path
 *              from the root node down to the farthest leaf node.
 * 
 *              Note: A leaf is a node with no children.
 * 
 *              Example:
 * 
 *              Given binary tree [3,9,20,null,null,15,7],
 * 
 *                  3
 *                 / \
 *                9  20
 *                  /  \
 *                 15   7
 * 
 *              return its depth = 3.
 */
public class MaximumDepthofBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public int maxDepth(TreeNode root) {
		return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}

	/**
	 * Definition for a binary tree node.
	 * 
	 * @author 033172
	 * @date 2018-12-19 16:18:03
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
