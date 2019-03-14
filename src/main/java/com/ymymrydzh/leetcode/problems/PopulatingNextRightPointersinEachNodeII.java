/**
 * 
 */
package leetcode;

/**
 * @author cc
 * @date 2016年1月18日 上午9:07:21
 * @description Given a binary tree

 *              Follow up for problem "Populating Next Right Pointers in Each Node".
 *
 *              What if the given tree could be any binary tree? Would your previous solution still work?
 *
 *              Note:
 *
 *              You may only use constant extra space.
 *              For example,
 *              Given the following binary tree,
 *                       1
 *                     /  \
 *                    2    3
 *                   / \    \
 *                  4  5     7
 *              After calling your function, the tree should look like:
 *                       1 -> NULL
 *                     /  \
 *                    2 -> 3 -> NULL
 *                   / \    \
 *                  4->5  -> 7 -> NULL
 */
public class PopulatingNextRightPointersinEachNodeII {

    /**
     * @param args
     */
    public static void main(String[] args) {
        PopulatingNextRightPointersinEachNodeII pnrpe = new PopulatingNextRightPointersinEachNodeII();
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
        p = root;
        TreeLinkNode firstChild = findFirstChild();
        while (firstChild != null) {
            TreeLinkNode curChild = firstChild;
            while (curChild != null) {
                TreeLinkNode nextChild = findNextChild(curChild);
                curChild.next = nextChild;
                curChild = nextChild;
            }
            p = firstChild;
            firstChild = findFirstChild();
        }
    }

    private TreeLinkNode findFirstChild() {
        TreeLinkNode firstChild = null;
        if (p != null) {
            firstChild = p.left;
            while (firstChild == null) {
                if (p.right == null) {
                    if (p.next == null) {
                        break;
                    }
                    p = p.next;
                    firstChild = p.left;
                } else {
                    firstChild = p.right;
                }
            }
        }
        return firstChild;
    }

    private TreeLinkNode findNextChild(TreeLinkNode curChild) {
        TreeLinkNode nextChild = null;
        if (p != null) {
            if (curChild.equals(p.left) && p.right != null) {
                nextChild = p.right;
            } else if (p.next != null) {
                p = p.next;
                nextChild = p.left;
                while (nextChild == null) {
                    if (p.right == null) {
                        if (p.next == null) {
                            break;
                        }
                        p = p.next;
                        nextChild = p.left;
                    } else {
                        nextChild = p.right;
                    }
                }
            }
        }
        return nextChild;
    }

    public class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;

        TreeLinkNode(int x) {
            val = x;
        }
    }
}
