/**
 * 
 */
package leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author cc
 * @date 2016年1月14日 下午2:40:56
 * @description Implement regular expression matching with support for '.' and
 *              '*'.
 * 
 *              '.' Matches any single character.
 *              '*' Matches zero or more of the preceding element.
 * 
 *              The matching should cover the entire input string (not partial).
 * 
 *              The function prototype should be:
 *              bool isMatch(const char *s, const char *p)
 * 
 *              Some examples:
 *              isMatch("aa","a") → false
 *              isMatch("aa","aa") → true
 *              isMatch("aaa","aa") → false
 *              isMatch("aa", "a*") → true
 *              isMatch("aa", ".*") → true
 *              isMatch("ab", ".*") → true
 *              isMatch("aab", "c*a*b") → true
 */
public class RegularExpressionMatching {

    /**
     * @param args
     */
    public static void main(String[] args) {

    }

    public boolean isMatch(String s, String p) {
        Pattern pa = Pattern.compile(p);
        Matcher ma = pa.matcher(s);
        return ma.matches();
    }
}
