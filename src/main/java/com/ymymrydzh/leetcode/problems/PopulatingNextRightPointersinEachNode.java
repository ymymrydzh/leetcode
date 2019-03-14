/**
 * 
 */
package leetcode;

/**
 * @author cc
 * @date 2016年1月18日 上午9:07:21
 * @description Given a binary tree

 *              struct TreeLinkNode {
 *                  TreeLinkNode *left;
 *                  TreeLinkNode *right;
 *                  TreeLinkNode *next;
 *              }
 *              Populate each next pointer to point to its next right node.
 *              If there is no next right node, the next pointer should be set to NULL.
 *
 *              Initially, all next pointers are set to NULL.
 *
 *              Note:
 *
 *              You may only use constant extra space.
 *              You may assume that it is a perfect binary tree
 *              (ie, all leaves are at the same level, and every parent has two children).
 *              For example,
 *              Given the following perfect binary tree,
 *                       1
 *                     /  \
 *                    2    3
 *                   / \  / \
 *                  4  5  6  7
 *              After calling your function, the tree should look like:
 *                       1 -> NULL
 *                     /  \
 *                    2 -> 3 -> NULL
 *                   / \  / \
 *                  4->5->6->7 -> NULL
 */
public class PopulatingNextRightPointersinEachNode {

    /**
     * @param args
     */
    public static void main(String[] args) {
        PopulatingNextRightPointersinEachNode pnrpe = new PopulatingNextRightPointersinEachNode();
        TreeLinkNode root = pnrpe.new TreeLinkNode(1);
        root.left = pnrpe.new TreeLinkNode(2);
        root.right = pnrpe.new TreeLinkNode(3);
        root.left.left = pnrpe.new TreeLinkNode(4);
        root.left.right = pnrpe.new TreeLinkNode(5);
        root.right.left = pnrpe.new TreeLinkNode(6);
        root.right.right = pnrpe.new TreeLinkNode(7);
        pnrpe.connect(root);
        System.out.println();
    }

    static TreeLinkNode p;

    public void connect(TreeLinkNode root) {
        TreeLinkNode p = root;
        TreeLinkNode fc = p == null ? null : p.left;
        while (p != null) {
            if (p.left == null || p.right == null) {
                break;
            }
            p.left.next = p.right;
            if (p.next != null) {
                p.right.next = p.next.left;
                p = p.next;
            } else {
                p = fc;
                fc = p.left;
            }
        }
    }

    public class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;

        TreeLinkNode(int x) {
            val = x;
        }
    }
}
