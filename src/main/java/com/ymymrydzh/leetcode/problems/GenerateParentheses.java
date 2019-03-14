/**
 * 
 */
package leetcode;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

/**
 * @author cc
 * @creation 2015-6-4
 * 
 */
public class GenerateParentheses {

	List<String> result = new ArrayList<String>();

	public List<String> generateParenthesis(int n) {
		generateParenthesis("(", n - 1, 1);
		return result;
	}

	void generateParenthesis(String existing, int leftBracketUnorgnized,
			int rightBrackettobeMatch) {
		if (leftBracketUnorgnized == 0 && rightBrackettobeMatch == 0) {
			result.add(existing);
		} else {
			if (leftBracketUnorgnized > 0) {
				generateParenthesis(existing + "(", leftBracketUnorgnized - 1,
						rightBrackettobeMatch + 1);
			}
			if (rightBrackettobeMatch > 0) {
				generateParenthesis(existing + ")", leftBracketUnorgnized,
						rightBrackettobeMatch - 1);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 4;
		GenerateParentheses gp = new GenerateParentheses();
		for (Iterator<String> it = gp.generateParenthesis(n).iterator(); it
				.hasNext();) {
			System.out.println(it.next());
		}
	}
}
