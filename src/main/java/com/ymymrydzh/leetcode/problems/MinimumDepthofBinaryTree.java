/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2018-12-20 16:22:23
 * @description Given a binary tree, find its minimum depth.
 * 
 *              The minimum depth is the number of nodes along the shortest path
 *              from the root node down to the nearest leaf node.
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
 *              return its minimum depth = 2.
 */
public class MinimumDepthofBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public int minDepth(TreeNode root) {
		return root == null ? 0 : root.left == null && root.right == null ? 1 : root.left == null ? minDepth(root.right) + 1 : root.right == null ? minDepth(root.left) + 1 : Math.min(minDepth(root.left), minDepth(root.right)) + 1;
	}

	/**
	 * Definition for a binary tree node.
	 * 
	 * @author 033172
	 * @date 2018-12-20 16:23:24
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
