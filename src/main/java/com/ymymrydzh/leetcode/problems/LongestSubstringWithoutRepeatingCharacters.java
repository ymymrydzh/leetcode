/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

/**
 * 
 * @author 033172
 * @date 2019-01-18 13:35:24
 * @description Given a string, find the length of the longest substring without
 *              repeating characters.
 * 
 *              Example 1:
 * 
 *              Input: "abcabcbb" Output: 3 Explanation: The answer is "abc",
 *              with the length of 3.
 * 
 *              Example 2:
 * 
 *              Input: "bbbbb" Output: 1 Explanation: The answer is "b", with
 *              the length of 1.
 * 
 *              Example 3:
 * 
 *              Input: "pwwkew" Output: 3 Explanation: The answer is "wke", with
 *              the length of 3. Note that the answer must be a substring,
 *              "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
		System.out.println(l.lengthOfLongestSubstring("aabaab!bb"));
	}

	public int lengthOfLongestSubstring(String s) {
		// Queue<Character> squence = new LinkedList<>();
		// int count = 0;
		// int max = 0;
		// for (int cur = 0; cur < s.length(); cur++) {
		// if (squence.contains(s.charAt(cur))) {
		// if (squence.size() > max) {
		// max = count;
		// }
		// while (!squence.peek().equals(s.charAt(cur))) {
		// squence.poll();
		// count--;
		// }
		// squence.poll();
		// count--;
		// }
		// squence.offer(s.charAt(cur));
		// count++;
		// }
		// return max > count ? max : count;

		int max = 0;
		int count = 0;
		int j = 0;
		boolean[] repeat = new boolean[95];
		char[] sc = s.toCharArray();
		for (int i = 0; i < sc.length; i++) {
			int c = sc[i] - ' ';
			if (repeat[c]) {
				while (sc[j] != sc[i]) {
					repeat[sc[j++] - ' '] = false;
					count--;
				}
				j++;
			} else {
				repeat[c] = true;
				count++;
			}
			max = count > max ? count : max;
		}
		return max;

	}
}
