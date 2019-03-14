/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2018-12-19 14:35:44
 * @description Given a binary tree, check whether it is a mirror of itself (ie,
 *              symmetric around its center).
 * 
 *              For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 * 
 *                  1
 *                 / \
 *                2   2
 *               / \ / \
 *              3  4 4  3
 *              But the following [1,2,2,null,3,null,3] is not:
 *                  1
 *                 / \
 *                2   2
 *                 \   \
 *                 3    3
 *              
 *              Note: Bonus
 *              points if you could solve it both recursively and iteratively.
 */
public class SymmetricTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public boolean isSymmetric(TreeNode root) {
		return root == null ? true : isSym(root.left, root.right);
	}

	private boolean isSym(TreeNode l, TreeNode r) {
		return l == null || r == null ? l == r : l.val == r.val ? isSym(l.left, r.right) ? isSym(l.right, r.left) : false : false;
	}

	/**
	 * Definition for a binary tree node.
	 * 
	 * @author 033172
	 * @date 2018-12-19 14:37:59
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
