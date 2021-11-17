package com.exercises.general;

import java.util.Stack;

/**
 * Problem Link : https://codeforces.com/problemset/problem/1185/B
 * 
 * Problem Description:
 * 
 * Methodius received an email from his friend Polycarp. However, Polycarp's
 * keyboard is broken, so pressing a key on it once may cause the corresponding
 * symbol to appear more than once (if you press a key on a regular keyboard, it
 * prints exactly one symbol).
 * 
 * For example, as a result of typing the word "hello", the following words
 * could be printed: "hello", "hhhhello", "hheeeellllooo", but the following
 * could not be printed: "hell", "helo", "hhllllooo".
 * 
 * Note, that when you press a key, the corresponding symbol must appear
 * (possibly, more than once). The keyboard is broken in a random manner, it
 * means that pressing the same key you can get the different number of letters
 * in the result.
 * 
 * For each word in the letter, Methodius has guessed what word Polycarp
 * actually wanted to write, but he is not sure about it, so he asks you to help
 * him.
 * 
 * You are given a list of pairs of words. For each pair, determine if the
 * second word could be printed by typing the first one on Polycarp's keyboard.
 */

public class Codeforces_Email_From_Polycarp {

public static boolean solve(String s1, String s2) {
		
		int n1 = s1.length();
		int n2 = s2.length();

		if (n2 < n1)
			return false;

		Stack<Character> stack = new Stack<Character>();

		for (int i = s1.length() - 1; i >= 0; i--) {
			stack.push(s1.charAt(i));
		}

		for (int i = 0; i < s2.length(); i++) {
			char curr = s2.charAt(i);
			if (!stack.isEmpty() && curr == stack.peek()) {
				stack.pop();
			}
		}

		return stack.isEmpty() ? true : false;
	}


	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hell1234o";
		boolean result = solve(s1, s2);
		System.out.println("Result:" + result);

	}

}
