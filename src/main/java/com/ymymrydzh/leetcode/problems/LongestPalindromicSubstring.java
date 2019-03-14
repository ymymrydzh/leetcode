/**
 * 
 */
package leetcode;

/**
 * @author cc
 * @date 2016年1月14日 下午2:19:05
 * @description Given a string S, find the longest palindromic substring in S.
 *              You may assume that the maximum length of S is 1000, and there
 *              exists one unique longest palindromic substring.
 */
public class LongestPalindromicSubstring {

    /**
     * @param args
     */
    public static void main(String[] args) {

    }

    public String longestPalindrome(String s) {
        String l = s.charAt(0) + "";
        for (int i = 0; i < s.length(); i++) {
            int b = i, e = i;
            while (e < s.length() - 1 && s.charAt(e + 1) == s.charAt(b)) {
                e++;
            }
            i = e;
            while (b > 0 && e < s.length() - 1 && s.charAt(b - 1) == s.charAt(e + 1)) {
                b--;
                e++;
            }
            if (e - b + 1 > l.length()) {
                l = s.substring(b, e + 1);
            }
        }
        return l;
    }
}
