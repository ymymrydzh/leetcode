/**
 * 
 */
package main.java.com.ymymrydzh.leetcode.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

/**
 * @author cc
 * @date 2018年12月12日18:45:30
 * @description Given a string containing just the characters '(', ')', '{',
 *              '}', '[' and ']', determine if the input string is valid.
 * 
 *              An input string is valid if:
 * 
 *              Open brackets must be closed by the same type of brackets. Open
 *              brackets must be closed in the correct order.
 * 
 *              Note that an empty string is also considered valid.
 * 
 *              Example 1:
 * 
 *              Input: "()" Output: true
 * 
 *              Example 2:
 * 
 *              Input: "()[]{}" Output: true
 * 
 *              Example 3:
 * 
 *              Input: "(]" Output: false
 * 
 *              Example 4:
 * 
 *              Input: "([)]" Output: false
 * 
 *              Example 5:
 * 
 *              Input: "{[]}" Output: true
 */
public class ValidParentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ValidParentheses vp = new ValidParentheses();
		ArrayList<String> s = new ArrayList<>();
		s.add("()");
		s.add("()[]{}");
		s.add("(]");
		s.add("([)]");
		s.add("{[]}");
		for (int i = 0; i < s.size(); i++) {
			System.out.println(vp.isValid(s.get(i)));
		}
	}

	private HashMap<Character, Character> m;

	public ValidParentheses() {
		this.m = new HashMap<Character, Character>();
		this.m.put(')', '(');
		this.m.put('}', '{');
		this.m.put(']', '[');
	}

	public boolean isValid(String s) {
		if (s.length() % 2 == 1) {
			return false;
		} else if (null == s || s.length() == 0) {
			return true;
		}
		Stack<Character> t = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char n = s.charAt(i);
			if (t.isEmpty()) {
				t.push(n);
			} else {
				Character c = t.peek();
				if (c == m.get(n)) {
					t.pop();
				} else {
					t.push(n);
				}
			}
		}
		return t.isEmpty();

		// Stack<Character> stack = new Stack<Character>();
		// for (int i = 0; i < s.length(); i++) {
		// char sc = s.charAt(i);
		// if (stack.isEmpty()) {
		// stack.push(sc);
		// } else {
		// char c = stack.peek();
		// if (c == sc - 1 || c == sc - 2) {
		// stack.pop();
		// } else {
		// stack.push(sc);
		// }
		// }
		// }
		// return stack.size() == 0;
	}

}
