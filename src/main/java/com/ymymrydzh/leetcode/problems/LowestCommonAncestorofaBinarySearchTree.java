/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 033172
 * @date 2019-01-09 15:13:10
 * @description Given a binary search tree (BST), find the lowest common
 *              ancestor (LCA) of two given nodes in the BST.
 * 
 *              According to the definition of LCA on Wikipedia: “The lowest
 *              common ancestor is defined between two nodes p and q as the
 *              lowest node in T that has both p and q as descendants (where we
 *              allow a node to be a descendant of itself).”
 * 
 *              Given binary search tree: root = [6,2,8,0,4,7,9,null,null,3,5]
 * 
 *                   6
 *                 /   \
 *                2     8
 *               / \   / \
 *              0   4 7   9
 *                 / \
 *                3   5
 * 
 *              Example 1:
 * 
 *              Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
 *              Output: 6 Explanation: The LCA of nodes 2 and 8 is 6.
 * 
 *              Example 2:
 * 
 *              Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
 *              Output: 2 Explanation: The LCA of nodes 2 and 4 is 2, since a
 *              node can be a descendant of itself according to the LCA
 *              definition.
 * 
 * 
 *              Note:
 * 
 *              <li>All of the nodes' values will be unique.
 *              <li>p and q are different and both values will exist in the BST.
 */
public class LowestCommonAncestorofaBinarySearchTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		// 可处理任意二叉树，但题为排序树，所以此方法不合适
		// List<TreeNode> pDir = findOneNode(root, p);
		// List<TreeNode> qDir = findOneNode(root, q);
		// TreeNode lca = root;
		// for (int i = 1;; i++) {
		// if (i <= pDir.size() && i <= qDir.size() && pDir.get(pDir.size() - i)
		// == qDir.get(qDir.size() - i)) {
		// lca = pDir.get(pDir.size() - i);
		// } else {
		// break;
		// }
		// }
		// return lca;

		// if (root.val > p.val && root.val > q.val) {
		// return lowestCommonAncestor(root.left, p, q);
		// } else if (root.val < p.val && root.val < q.val) {
		// return lowestCommonAncestor(root.right, p, q);
		// } else {
		// return root;
		// }

		while (root != null) {
			if (root.val > p.val && root.val > q.val) {
				root = root.left;
			} else if (root.val < p.val && root.val < q.val) {
				root = root.right;
			} else {
				return root;
			}
		}
		return root;
	}

	public List<TreeNode> findOneNode(TreeNode root, TreeNode p) {
		List<TreeNode> dir = null;
		if (root == null) {
		} else if (p == root) {
			dir = new ArrayList<>();
			dir.add(root);
		} else {
			List<TreeNode> leftDir = findOneNode(root.left, p);
			if (leftDir != null) {
				dir = leftDir;
				dir.add(root);
			} else {
				List<TreeNode> rightDir = findOneNode(root.right, p);
				if (rightDir != null) {
					dir = rightDir;
					dir.add(root);
				}
			}
		}
		return dir;
	}

	/**
	 * Definition for a binary tree node.
	 * 
	 * @author 033172
	 * @date 2019-01-09 15:13:40
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