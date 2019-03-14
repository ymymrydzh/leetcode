/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

import main.java.com.ymymrydzh.leetcode.problems.MaximumDepthofBinaryTree.TreeNode;

/**
 * @author 033172
 * @date 2018-12-19 16:46:36
 * @description Given a binary tree, return the bottom-up level order traversal
 *              of its nodes' values. (ie, from left to right, level by level
 *              from leaf to root).
 * 
 *              For example: Given binary tree [3,9,20,null,null,15,7],
 * 
 *                  3
 *                 / \
 *                9  20
 *                  /  \
 *                 15   7
 *                 
 *              return its bottom-up level order traversal as:
 *              [
 *                [15,7],
 *                [9,20],
 *                [3]
 *              ]
 */
public class BinaryTreeLevelOrderTraversalII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		int depth = maxDepth(root);
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < depth; i++) {
			result.add(new ArrayList<Integer>());
		}
		oneLevel(root, 0, depth, result);
		return result;
	}

	private void oneLevel(TreeNode root, int d, int depth, List<List<Integer>> result) {
		if (root != null) {
			result.get(depth - d - 1).add(root.val);
			oneLevel(root.left, d + 1, depth, result);
			oneLevel(root.right, d + 1, depth, result);
		}
	}

	private int maxDepth(TreeNode root) {
		return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}
}
