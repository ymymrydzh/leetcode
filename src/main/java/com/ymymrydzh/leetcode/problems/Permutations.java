/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cc
 * @date 2016年1月16日 下午6:48:04
 * @description Given a collection of distinct numbers, return all possible
 *              permutations.
 * 
 *              For example, [1,2,3] have the following permutations:
 *              [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 */
public class Permutations {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Permutations p = new Permutations();
        int[] nums = { 1, 2 ,3, 4 };
        List<List<Integer>> permutations = p.permute(nums);
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
        System.out.println(permutations.size());
    }

//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> permutations = new ArrayList<>();
//        permutations = getPermutations(nums);
//        return permutations;
//    }
//
//    /**
//     * 每次取一个数，递归出其余数的所有排列，将取出的数补在所得到的所有排列之后。时间复杂度较差.
//     * 
//     * @param allNums
//     * @return
//     */
//    private List<List<Integer>> getPermutations(int[] allNums) {
//        List<List<Integer>> permutations = new ArrayList<>();
//        if (allNums.length == 1) {
//            List<Integer> l = new ArrayList<>();
//            l.add(allNums[0]);
//            permutations.add(l);
//        } else {
//            for (int i = 0; i < allNums.length; i++) {
//                int lastNum = allNums[i];
//                int[] oddNums = new int[allNums.length - 1];
//                System.arraycopy(allNums, 0, oddNums, 0, i);
//                System.arraycopy(allNums, i + 1, oddNums, i, allNums.length - i - 1);
//                List<List<Integer>> oddPermutations = getPermutations(oddNums);
//                for (List<Integer> oddPermutation : oddPermutations) {
//                    oddPermutation.add(lastNum);
//                    permutations.add(oddPermutation);
//                }
//            }
//        }
//        return permutations;
//    }

    
//    /**
//     * 每次取一个数，插在之前数字构成的所有排列的各个位置。时间复杂度居中.
//     * 
//     * @param nums
//     * @return
//     */
//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> permutations = new ArrayList<>();
//        permutations.add(new ArrayList<>());
//        for (int i = 0; i < nums.length; i++) {
//            List<List<Integer>> leftPermutations = new ArrayList<>();
//            for (List<Integer> permutation : permutations) {
//                for (int j = 0; j <= permutation.size(); j++) {
//                    List<Integer> leftPumutation = new ArrayList<>(permutation);
//                    leftPumutation.add(j, nums[i]);
//                    leftPermutations.add(leftPumutation);
//                }
//            }
//            permutations = leftPermutations;
//        }
//        return permutations;
//    }
    
    
    /**
     * 从后向前，交换当前数字与后面所有数字的位置，并递归求交换后(当前数字变为新数字)当前位置之后的所有排列，时间复杂度较好.
     * 
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        List<Integer> permutation = new ArrayList<>();
        for(int num : nums){
            permutation.add(num);
        }
        permutations.add(permutation);
        getPermutations(nums, nums.length - 1 ,permutations);
        return permutations;
    }
    
    private void getPermutations(int[] nums, int end, List<List<Integer>> permutations) {
        for (int i = 1; i <= end; i++) {
            for (int j = 0; j < i; j++) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                List<Integer> permutation = new ArrayList<>();
                for (int num : nums) {
                    permutation.add(num);
                }
                permutations.add(permutation);
                getPermutations(nums, j, permutations);
                tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
    }
}
