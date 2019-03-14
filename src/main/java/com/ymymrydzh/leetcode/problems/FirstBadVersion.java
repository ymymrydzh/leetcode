/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author CC
 * @date 2019年1月9日18:31:05
 * @description You are a product manager and currently leading a team to
 *              develop a new product. Unfortunately, the latest version of your
 *              product fails the quality check. Since each version is developed
 *              based on the previous version, all the versions after a bad
 *              version are also bad.
 * 
 *              Suppose you have n versions [1, 2, ..., n] and you want to find
 *              out the first bad one, which causes all the following ones to be
 *              bad.
 * 
 *              You are given an API bool isBadVersion(version) which will
 *              return whether version is bad. Implement a function to find the
 *              first bad version. You should minimize the number of calls to
 *              the API.
 * 
 *              Example:
 * 
 *              Given n = 5, and version = 4 is the first bad version.
 * 
 *              <li>call isBadVersion(3) -> false
 *              <li>call isBadVersion(5) -> true
 *              <li>call isBadVersion(4) -> true
 * 
 *              Then 4 is the first bad version.
 */
public class FirstBadVersion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirstBadVersion fbv = new FirstBadVersion();
		System.out.println(fbv.firstBadVersion(2126753390));
	}

	int[] versions = { 0, 0, 1, 1, 1, 1 };

	public int firstBadVersion(int n) {
		int low = 0;
		int high = n;
		int mid = (low >> 1) + (high >> 1);
		while (low < high) {
			if (isBadVersion(mid)) {
				high = mid;
			} else {
				low = mid + 1;
			}
			mid = (low >> 1) + (high >> 1);
		}
		return low;
	}

	boolean isBadVersion(int version) {
		return version >= 1702766719;
	}
}
