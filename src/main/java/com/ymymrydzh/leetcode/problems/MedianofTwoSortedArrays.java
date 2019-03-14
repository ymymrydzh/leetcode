/**
 * 
 */
package leetcode;

/**
 * @author cc
 * @date 2016年1月14日 下午2:18:11
 * @description There are two sorted arrays nums1 and nums2 of size m and n
 *              respectively. Find the median of the two sorted arrays. The
 *              overall run time complexity should be O(log (m+n)).
 */
public class MedianofTwoSortedArrays {

    /**
     * @param args
     */
    public static void main(String[] args) {

    }

    public double findMedianSortedArrays(int A[], int B[]) {
        int length = A.length + B.length;
        int a = 0, b = 0, c = 0;
        int mid = length / 2 + 1;
        int[] C = new int[mid];
        while (a + b < mid && a < A.length && b < B.length) {
            if (A[a] < B[b]) {
                C[c++] = A[a++];
            } else {
                C[c++] = B[b++];
            }
        }
        while (c < mid && a < A.length) {
            C[c++] = A[a++];
        }
        while (c < mid && b < B.length) {
            C[c++] = B[b++];
        }
        return length % 2 == 0 ? (double) (C[mid - 2] + C[mid - 1]) / 2 : C[mid - 1];
    }
}
