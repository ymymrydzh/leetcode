/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author CC
 * @date 2018年12月19日11:32:22
 * @description Given two binary trees, write a function to check if they are
 *              the same or not.
 * 
 *              Two binary trees are considered the same if they are
 *              structurally identical and the nodes have the same value.
 * 
 *              Example 1:
 *
 *              Input:     1         1
 *                        / \       / \
 *                       2   3     2   3
 * 
 *                      [1,2,3],   [1,2,3]
 * 
 *              Output: true
 *              
 *              Example 2:
 * 
 *              Input:     1         1
 *                        /           \
 *                       2             2
 * 
 *                      [1,2],     [1,null,2]
 * 
 *              Output: false
 *              
 *              Example 3:
 * 
 *              Input:     1         1
 *                        / \       / \
 *                       2   1     1   2
 * 
 *                      [1,2,1],   [1,1,2]
 * 
 *              Output: false
 */
public class SameTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SameTree st = new SameTree();
		TreeNode p = st.new TreeNode(0);
		// p.left = st.new TreeNode(1);
		TreeNode q = st.new TreeNode(0);
		System.out.println(st.isSameTree(p, q));
	}

	public boolean isSameTree(TreeNode p, TreeNode q) {

		return p == null || q == null ? p == q
				: p.val == q.val ? isSameTree(p.left, q.left) ? isSameTree(p.right, q.right) : false : false;
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
