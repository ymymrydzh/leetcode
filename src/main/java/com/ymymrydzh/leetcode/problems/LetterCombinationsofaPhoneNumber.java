package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LetterCombinationsofaPhoneNumber {

	public List<String> letterCombinations(String digits) {
		List<String> result;
		if (digits == null || digits.length() == 0) {
			result = new ArrayList<String>();
		} else {
			result = letterCombinations(digits.substring(1));
			String[] letters = { " ", "", "abc", "def", "ghi", "jkl", "mno",
					"pqrs", "tuv", "wxyz" };
			if (result.size() == 0) {
				result.add("");
			}
			for (ListIterator<String> li = result.listIterator(); li.hasNext();) {
				String tmp = li.next();
				li.remove();
				int letterNum = digits.charAt(0) - 48;
				for (int i = 0; i < letters[letterNum].length(); i++) {
					li.add(letters[letterNum].charAt(i) + tmp);
				}
			}
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String digits = "";
		LetterCombinationsofaPhoneNumber lcpn = new LetterCombinationsofaPhoneNumber();
		List<String> list = lcpn.letterCombinations(digits);
		for (Iterator<String> it = list.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
		System.out.println(list.size());
	}

}
