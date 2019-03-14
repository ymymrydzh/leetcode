/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author 033172
 * @date 2019-01-09 16:39:01
 * @description Given a binary tree, return all root-to-leaf paths.
 * 
 *              Note: A leaf is a node with no children.
 * 
 *              Example:
 * 
 *              Input:
 * 
 *              1 / \ 2 3 \ 5
 * 
 *              Output: ["1->2->5", "1->3"]
 * 
 *              Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 */
public class BinaryTreePaths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTreePaths b = new BinaryTreePaths();
		int[] vs = { 1, 2, 3, -1, 5 };
		Queue<TreeNode> nodes = new LinkedList<>();
		TreeNode root = null;
		if (vs.length != 0) {
			root = b.new TreeNode(vs[0]);
			nodes.add(root);
			for (int i = 0; i < vs.length;) {
				TreeNode node = nodes.poll();
				if (++i < vs.length && vs[i] != -1) {
					node.left = b.new TreeNode(vs[i]);
					nodes.add(node.left);
				}
				if (++i < vs.length && vs[i] != -1) {
					node.right = b.new TreeNode(vs[i]);
					nodes.add(node.right);
				}
			}
		}

		System.out.println(b.binaryTreePaths(root));
	}

	public List<String> binaryTreePaths(TreeNode root) {
		// List<String> allpaths = new ArrayList<>();
		// if (root == null) {
		// return allpaths;
		// }
		// Queue<TreeNode> nodes = new LinkedList<>();
		// Queue<String> paths = new LinkedList<>();
		// nodes.add(root);
		// paths.add(root.val + "");
		// while (!nodes.isEmpty()) {
		// TreeNode node = nodes.poll();
		// String path = paths.poll();
		// if (node.left == null && node.right == null) {
		// allpaths.add(path);
		// } else {
		// if (node.left != null) {
		// nodes.add(node.left);
		// paths.add(path + "->" + node.left.val);
		// }
		// if (node.right != null) {
		// nodes.add(node.right);
		// paths.add(path + "->" + node.right.val);
		// }
		// }
		// }
		// return allpaths;

		List<String> allpaths = new ArrayList<>();
		if (root != null) {
			path(root, "", allpaths);
		}
		return allpaths;

	}

	private void path(TreeNode root, String path, List<String> allpaths) {
		if (root != null) {
			if (root.left == null && root.right == null) {
				allpaths.add(path + root.val);
			} else {
				if (root.left != null) {
					path(root.left, path + root.val + "->", allpaths);
				}
				if (root.right != null) {
					path(root.right, path + root.val + "->", allpaths);
				}
			}

		}
	}

	/**
	 * Definition for a binary tree node.
	 * 
	 * @author 033172
	 * @date 2019-01-09 16:39:33
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
