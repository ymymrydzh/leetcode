/**
 * 
 */
package com.ymymrydzh.leetcode.problems;

/**
 * @author cc
 * @date 2016��2��4�� ����9:41:46
 * @description You are playing the following Bulls and Cows game with your
 *              friend: You write down a number and ask your friend to guess
 *              what the number is. Each time your friend makes a guess, you
 *              provide a hint that indicates how many digits in said guess
 *              match your secret number exactly in both digit and position
 *              (called "bulls") and how many digits match the secret number but
 *              locate in the wrong position (called "cows"). Your friend will
 *              use successive guesses and hints to eventually derive the secret
 *              number.
 * 
 *              For example:
 * 
 *              Secret number: "1807" Friend's guess: "7810" Hint: 1 bull and 3
 *              cows. (The bull is 8, the cows are 0, 1 and 7.) Write a function
 *              to return a hint according to the secret number and friend's
 *              guess, use A to indicate the bulls and B to indicate the cows.
 *              In the above example, your function should return "1A3B".
 * 
 *              Please note that both secret number and friend's guess may
 *              contain duplicate digits, for example:
 * 
 *              Secret number: "1123" Friend's guess: "0111" In this case, the
 *              1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a cow,
 *              and your function should return "1A1B". You may assume that the
 *              secret number and your friend's guess only contain digits, and
 *              their lengths are always equal.
 */
public class BullsandCows {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String secret = "1123";
		String guess = "0111";
		BullsandCows bc = new BullsandCows();
		String hint = bc.getHint(secret, guess);
		System.out.println(hint);
	}

	public String getHint(String secret, String guess) {
		char[][] s = new char[2][];
		s[0] = secret.toCharArray();
		s[1] = guess.toCharArray();
		int[][] c = new int[2][10];
		int a = 0;
		int b = 0;
		for (int i = 0; i < secret.length(); i++) {
			if (s[0][i] == s[1][i]) {
				a++;
			} else {
				c[0][s[0][i] - 48]++;
				c[1][s[1][i] - 48]++;
			}
		}
		for (int i = 0; i < 10; i++) {
			b += c[0][i] <= c[1][i] ? c[0][i] : c[1][i];
		}
		return a + "A" + b + "B";
	}
}
