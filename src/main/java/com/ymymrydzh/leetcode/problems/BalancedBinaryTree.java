/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2018-12-20 15:37:26
 * @description Given a binary tree, determine if it is height-balanced.
 * 
 *              For this problem, a height-balanced binary tree is defined as:
 * 
 *              a binary tree in which the depth of the two subtrees of every
 *              node never differ by more than 1.
 * 
 *              Example 1:
 * 
 *              Given the following tree [3,9,20,null,null,15,7]:
 * 
 *                  3
 *                 / \
 *                9  20
 *                  /  \
 *                 15   7
 *              Return true.
 * 
 *              Example 2:
 * 
 *              Given the following tree [1,2,2,3,3,null,null,4,4]:
 *              
 *                     1
 *                    / \
 *                   2   2
 *                  / \
 *                 3   3
 *                / \
 *               4   4
 * 
 *              Return false.
 */
public class BalancedBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BalancedBinaryTree b = new BalancedBinaryTree();
		TreeNode r = b.new TreeNode(3);
		r.left = b.new TreeNode(9);
		r.right = b.new TreeNode(20);
		r.right.left = b.new TreeNode(15);
		r.right.right = b.new TreeNode(7);
		b.isBalanced(r);
	}

	public boolean isBalanced(TreeNode root) {
		return depth(root) != -1;
	}

	private int depth(TreeNode n) {
		if (n == null) {
			return 0;
		}
		if (n.left == null && n.right == null) {
			return 1;
		}
		int left = depth(n.left);
		if (left == -1) {
			return -1;
		}
		int right = depth(n.right);
		if (right == -1 || Math.abs(left - right) > 1) {
			return -1;
		}
		return Math.max(left, right) + 1;
	}

	/**
	 * Definition for a binary tree node.
	 * 
	 * @author 033172
	 * @date 2018-12-20 15:40:11
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
