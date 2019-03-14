/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2018-12-21 09:24:23
 * @description Given a binary tree and a sum, determine if the tree has a
 *              root-to-leaf path such that adding up all the values along the
 *              path equals the given sum.
 * 
 *              Note: A leaf is a node with no children.
 * 
 *              Example:
 * 
 *              Given the below binary tree and sum = 22,
 * 
 *                    5
 *                   / \
 *                  4   8
 *                 /   / \
 *                11  13  4
 *               /  \      \
 *              7    2      1
 * 
 *              return true, as there exist a root-to-leaf path 5->4->11->2
 *              which sum is 22.
 */
public class PathSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}
		if (root.val == sum && root.left == null && root.right == null) {
			return true;
		}

		return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);

		// return root == null ? false : root.val == sum && root.left == null &&
		// root.right == null ? true : hasPathSum(root.left, sum - root.val) ||
		// hasPathSum(root.right, sum - root.val);

	}

	/**
	 * Definition for a binary tree node.
	 * 
	 * @author 033172
	 * @date 2018-12-21 09:30:09
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
