/**
 * 
 */
package leetcode;

/**
 * @author cc
 * 
 */
public class IntToRoman {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 1976;
		System.out.println(new IntToRoman().intToRoman(num));
	}

	public String intToRoman(int num) {
		StringBuffer sb = new StringBuffer();
		if (num >= 1000) {
			for (int i = 0; i < num / 1000; i++) {
				sb.append("M");
			}
			num = num % 1000;
		}
		if (num >= 100) {
			int n3 = num / 100;
			if (n3 == 4) {
				sb.append("CD");
			} else if (n3 == 9) {
				sb.append("CM");
			} else {
				if (n3 >= 5) {
					sb.append("D");
					n3 -= 5;
				}
				for (int i = 0; i < n3; i++) {
					sb.append("C");
				}
			}
			num = num % 100;
		}
		if (num >= 10) {
			int n2 = num / 10;
			if (n2 == 4) {
				sb.append("XL");
			} else if (n2 == 9) {
				sb.append("XC");
			} else {
				if (n2 >= 5) {
					sb.append("L");
					n2 -= 5;
				}
				for (int i = 0; i < n2; i++) {
					sb.append("X");
				}
			}
			num = num % 10;
		}
		if (num == 4) {
			sb.append("IV");
		} else if (num == 9) {
			sb.append("IX");
		} else {
			if (num >= 5) {
				sb.append("V");
				num -= 5;
			}
			for (int i = 0; i < num; i++) {
				sb.append("I");
			}
		}
		return sb.toString();
	}

}
