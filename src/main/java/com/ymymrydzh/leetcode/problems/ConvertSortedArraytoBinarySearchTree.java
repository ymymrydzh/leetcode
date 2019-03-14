/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2018-12-20 10:40:29
 * @description Given an array where elements are sorted in ascending order,
 *              convert it to a height balanced BST.
 * 
 *              For this problem, a height-balanced binary tree is defined as a
 *              binary tree in which the depth of the two subtrees of every node
 *              never differ by more than 1.
 * 
 *              Example:
 * 
 *              Given the sorted array: [-10,-3,0,5,9],
 * 
 *              One possible answer is: [0,-3,9,-10,null,5], which represents
 *              the following height balanced BST:
 * 
 *                    0
 *                   / \
 *                 -3   9
 *                 /   /
 *               -10  5
 */
public class ConvertSortedArraytoBinarySearchTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public TreeNode sortedArrayToBST(int[] nums) {
		return toBST(nums, 0, nums.length - 1);
	}

	private TreeNode toBST(int[] nums, int low, int high) {
		if (low > high) {
			return null;
		}
		int mid = (low + high) / 2;
		TreeNode n = new TreeNode(nums[mid]);
		n.left = toBST(nums, low, mid - 1);
		n.right = toBST(nums, mid + 1, high);
		return n;
	}

	/**
	 * Definition for a binary tree node.
	 * 
	 * @author 033172
	 * @date 2018-12-20 10:44:56
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


