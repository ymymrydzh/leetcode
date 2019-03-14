/**
 * 
 */
package leetcode;

/**
 * @author cc
 * @date 2016年1月20日 下午8:13:27
 * @description Given a singly linked list, group all odd nodes together
 *              followed by the even nodes. Please note here we are talking
 *              about the node number and not the value in the nodes.
 * 
 *              You should try to do it in place. The program should run in O(1)
 *              space complexity and O(nodes) time complexity.
 * 
 *              Example: Given 1->2->3->4->5->NULL,
 *              return 1->3->5->2->4->NULL.
 * 
 *              Note: The relative order inside both the even and odd groups
 *              should remain as it was in the input. The first node is
 *              considered odd, the second node even and so on ...
 */
public class OddEvenLinkedList {

    /**
     * @param args
     */
    public static void main(String[] args) {
        OddEvenLinkedList o = new OddEvenLinkedList();
        ListNode head = o.new ListNode(1);
        head.next = o.new ListNode(2);
        head.next.next = o.new ListNode(3);
        head = o.oddEvenList(head);
        System.out.println();
    }

    public ListNode oddEvenList(ListNode head) {
        if (head != null && head.next != null && head.next.next != null) {
            ListNode evenHead = head.next;
            ListNode odd = head;
            ListNode even = evenHead;
            ListNode p = even.next;
            while (p != null) {
                odd.next = p;
                odd = p;
                p = p.next;
                if (p != null) {
                    even.next = p;
                    even = p;
                    p = p.next;
                }
            }
            even.next = null;
            odd.next = evenHead;
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
