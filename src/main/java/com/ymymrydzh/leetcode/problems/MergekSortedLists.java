/**
 * 
 */
package leetcode;

/**
 * @author cc
 * @creation 2015-6-5
 * 
 */
public class MergekSortedLists {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode cur = result;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				cur.next = l1;
				l1 = l1.next;
			} else {
				cur.next = l2;
				l2 = l2.next;
			}
			cur = cur.next;
		}
		if (l1 != null) {
			cur.next = l1;
		} else {
			cur.next = l2;
		}
		return result.next;
	}

	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0) {
			return null;
		}
		for (double j = Math.ceil(Math.log(lists.length) / Math.log(2)); j > 0; j--) {
			for (int i = 0; i < lists.length && i < Math.pow(2, j);) {
				ListNode l1 = lists[i];
				lists[i] = null;
				ListNode l2 = null;
				if (i + 1 < lists.length) {
					l2 = lists[i + 1];
					lists[i + 1] = null;
				}
				// lists[i / 2] = mergeTwoLists(l1, l2);
				ListNode twoResult = new ListNode(0);
				ListNode cur = twoResult;
				while (l1 != null && l2 != null) {
					if (l1.val <= l2.val) {
						cur.next = l1;
						l1 = l1.next;
					} else {
						cur.next = l2;
						l2 = l2.next;
					}
					cur = cur.next;
				}
				if (l1 != null) {
					cur.next = l1;
				} else {
					cur.next = l2;
				}
				lists[i / 2] = twoResult.next;
				i += 2;
			}
		}
		return lists[0];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MergekSortedLists msl = new MergekSortedLists();
		System.out.println(Math.log(8) / Math.log(2));
		int[][] nums = { { -10, -9, -9, -3, -1, -1, 0 }, { -5 }, { 4 }, { -8 },
				{}, { -9, -6, -5, -4, -2, 2, 3 }, { -3, -3, -2, -1, 0 } };
		ListNode[] lists = new ListNode[nums.length];
		for (int i = 0; i < nums.length; i++) {
			ListNode head = null;
			ListNode cur = null;
			if (nums[i] != null && nums[i].length != 0) {
				head = msl.new ListNode(nums[i][0]);
				cur = head;
				for (int j = 1; j < nums[i].length; j++) {
					ListNode node = msl.new ListNode(nums[i][j]);
					cur.next = node;
					cur = node;
				}
			}
			lists[i] = head;
		}
		ListNode sorted = msl.mergeKLists(lists);
		while (sorted != null) {
			System.out.print(sorted.val);
			sorted = sorted.next;
		}
	}

}
