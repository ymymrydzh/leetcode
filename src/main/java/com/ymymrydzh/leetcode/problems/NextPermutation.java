/**
 * 
 */
package leetcode;


/**
 * @author cc
 * @date 2016年1月16日 下午2:36:51
 * @description Implement next permutation, which rearranges numbers into the
 *              lexicographically next greater permutation of numbers.
 * 
 *              If such arrangement is not possible, it must rearrange it as the
 *              lowest possible order (ie, sorted in ascending order).
 * 
 *              The replacement must be in-place, do not allocate extra memory.
 * 
 *              Here are some examples. Inputs are in the left-hand column and
 *              its corresponding outputs are in the right-hand column.
 *              1,2,3 → 1,3,2
 *              3,2,1 → 1,2,3
 *              1,1,5 → 1,5,1
 */
public class NextPermutation {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = { 1, 1, 4 };
        NextPermutation np = new NextPermutation();
        np.nextPermutation(nums);
        for (Integer num : nums) {
            System.out.println(num);
        }
    }

    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int[] instSorted = new int[len];
        instSorted[len - 1] = nums[len - 1];
        boolean unDo = true;
        for (int i = len - 2; i >= 0; i--) {
            instSort(instSorted, i, nums[i]);
            if (nums[i] < instSorted[len - 1]) {
                int p = i;
                while (nums[i] >= instSorted[p]) {
                    nums[p + 1] = instSorted[p++];
                }
                nums[i] = instSorted[p++];
                while (p < len) {
                    nums[p] = instSorted[p++];

                }
                unDo = false;
                break;
            }
        }
        if (unDo) {
            for (int i = 0; i < len; i++) {
                nums[i] = instSorted[i];
            }
        }
    }

    /**
     * 将找到的逆序数进行插入排序，置于数组尾部
     * @param nums
     * @param pos
     * @param num
     */
    private void instSort(int[] nums, int pos, int num) {
        while (pos < nums.length - 1 && nums[pos + 1] < num) {
            nums[pos] = nums[pos++ + 1];
        }
        nums[pos] = num;
    }
}
