package com.exercises.general;

import java.io.IOException;

/**
 * Problem Link : https://codeforces.com/problemset/problem/1606/A
 * 
 * Problem Description:
 * 
 * You are given a string s of length n consisting of characters a and/or b.
 * 
 * Let AB(s) be the number of occurrences of string ab in s as a substring.
 * Analogically, BA(s) is the number of occurrences of ba in s as a substring.
 * 
 * In one step, you can choose any index i and replace si with character a or b.
 * 
 * What is the minimum number of steps you need to make to achieve AB(s)=BA(s)?
 * 
 * Reminder:
 * 
 * The number of occurrences of string d in s as substring is the number of
 * indices i (1≤i≤|s|−|d|+1) such that substring sisi+1…si+|d|−1 is equal to d.
 * For example, AB(aabbbabaa)=2 since there are two indices i: i=2 where
 * aabbbabaa and i=6 where aabbbabaa.
 */
public class Codeforces_AB_Balance {

	public static void solve() {

		String s = "abbaab";

		int ab = 0;
		int ba = 0;

		// first count how many ab and ba are there in the given string
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == 'a' && s.charAt(i + 1) == 'b')
				ab++;
			if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'a')
				ba++;
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char current_char = s.charAt(i);

			if (ab > ba && current_char == 'a') {
				current_char = 'b';
				ab--;
			} else if (ba > ab && current_char == 'b') {
				current_char = 'a';
				ba--;
			}

			sb.append(current_char);
		}

		String str = sb.toString();

		System.out.println(str);

	}

	public static void main(String[] args) throws IOException {

		solve();
	}

}
