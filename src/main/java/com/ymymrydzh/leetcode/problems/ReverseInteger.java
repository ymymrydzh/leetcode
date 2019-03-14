/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author cc
 * @date 2018年12月12日10:47:14
 * @description Given a 32-bit signed integer, reverse digits of an integer.
 * 
 *              Example 1:
 * 
 *              Input: 123 Output: 321
 * 
 *              Example 2:
 * 
 *              Input: -123 Output: -321
 * 
 *              Example 3:
 * 
 *              Input: 120 Output: 21
 * 
 *              Note: Assume we are dealing with an environment which could only
 *              store integers within the 32-bit signed integer range: [−2^31,
 *              2^31 − 1]. For the purpose of this problem, assume that your
 *              function returns 0 when the reversed integer overflows.
 */
public class ReverseInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		ReverseInteger r = new ReverseInteger();
		int i1 = -2147483648;
		System.out.println(r.reverse(i1));
		int i2 = -2147483412;
		System.out.println(r.reverse(i2));
		int i3 = -1463847412;
		System.out.println(r.reverse(i3));
		int i4 = 123;
		System.out.println(r.reverse(i4));

		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	public int reverse(int x) {
		// char[] ori = String.valueOf(x).toCharArray();
		// int i = ori[0] == '-' ? 1 : 0;
		// int k = ori.length - 1;
		// char tmp;
		// for (; i < k; i++, k--) {
		// tmp = ori[i];
		// ori[i] = ori[k];
		// ori[k] = tmp;
		// }
		// Long l = Long.valueOf(new String(ori));
		// if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE){
		// return 0;
		// } else {
		// return l.intValue();
		// }

		int n = 0;
		int max = Integer.MAX_VALUE / 10;
		int min = Integer.MIN_VALUE / 10;
		while (x != 0) {
			if (n > max || n < min) {
				return 0;
			}
			int p = x % 10;
			x /= 10;
			n = n * 10 + p;
		}
		return n;

	}
}
