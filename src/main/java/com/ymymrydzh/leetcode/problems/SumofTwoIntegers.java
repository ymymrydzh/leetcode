/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * @author 033172
 * @date 2019-01-10 18:46:46
 * @description Calculate the sum of two integers a and b, but you are not
 *              allowed to use the operator + and -.
 * 
 *              Example 1:
 * 
 *              Input: a = 1, b = 2 Output: 3
 * 
 *              Example 2:
 * 
 *              Input: a = -2, b = 3 Output: 1
 */
public class SumofTwoIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SumofTwoIntegers s = new SumofTwoIntegers();
		System.out.println(Integer.toBinaryString(-1));
		System.out.println(Integer.valueOf("01111111111111111111111111111111", 2));
		System.out.println(s.getSum(3, -2));
		System.out.println(s.getSum(2147483647, -2147483648));
	}

	public int getSum(int a, int b) {
		char[] abs = Integer.toBinaryString(a).toCharArray();
		char[] bbs = Integer.toBinaryString(b).toCharArray();
		int alen = abs.length;
		int blen = bbs.length;
		char achar = a >= 0 ? '0' : '1';
		char bchar = b >= 0 ? '0' : '1';
		char[] ac = new char[32];
		char[] bc = new char[32];
		for (int i = 31; i > -1; i--) {
			if (alen > 0) {
				ac[i] = abs[alen-- - 1];
			} else {
				ac[i] = achar;
			}
			if (blen > 0) {
				bc[i] = bbs[blen-- - 1];
			} else {
				bc[i] = bchar;
			}
		}

		char[] sum = new char[32];
		int carry = 0;
		for (int i = 31; i > -1; i--) {
			int count = 0;
			if (ac[i] == '1') {
				count++;
			}
			if (bc[i] == '1') {
				count++;
			}
			if (carry == 1) {
				count++;
			}
			if (count == 0) {
				carry = 0;
				sum[i] = '0';
			} else if (count == 1) {
				carry = 0;
				sum[i] = '1';
			} else if (count == 2) {
				carry = 1;
				sum[i] = '0';
			} else if (count == 3) {
				carry = 1;
				sum[i] = '1';
			}
		}
		if (sum[0] == '1') {
			for (int i = 0; i < 32; i++) {
				if (sum[i] == '0') {
					sum[i] = '1';
				} else {
					sum[i] = '0';
				}

			}
			int i = 31;
			while (i > 0 && sum[i] == '1') {
				sum[i--] = '0';
			}
			sum[i] = '1';
			return -Integer.valueOf(new String(sum), 2);
		}
		return Integer.valueOf(new String(sum), 2);
	}
}
