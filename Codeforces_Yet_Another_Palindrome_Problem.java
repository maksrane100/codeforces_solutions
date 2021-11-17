package com.exercises.general;

import java.io.IOException;

/**
 * /** Problem Link : https://codeforces.com/problemset/problem/1324/B
 * 
 * Problem Description:
 * 
 * You are given an array a consisting of n integers.
 * 
 * Your task is to determine if a has some subsequence of length at least 3 that
 * is a palindrome.
 * 
 * Recall that an array b is called a subsequence of the array a if b can be
 * obtained by removing some (possibly, zero) elements from a (not necessarily
 * consecutive) without changing the order of remaining elements. For example,
 * [2], [1,2,1,3] and [2,3] are subsequences of [1,2,1,3], but [1,1,2] and [4]
 * are not.
 * 
 * Also, recall that a palindrome is an array that reads the same backward as
 * forward. In other words, the array a of length n is the palindrome if
 * ai=an−i−1 for all i from 1 to n. For example, arrays [1234], [1,2,1],
 * [1,3,2,2,3,1] and [10,100,10] are palindromes, but arrays [1,2] and [1,2,3,1]
 * are not.
 * 
 * You have to answer t independent test cases.
 *
 * 
 */
public class Codeforces_Yet_Another_Palindrome_Problem {

	public static void solve() {

		int n = 3;
		int[] a = { 1, 1, 2 };

		int flag = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 2; j < n; j++) {
				if (a[i] == a[j])
					flag = 1;
			}
		}

		if (flag == 1)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	public static void main(String[] args) throws IOException {

		solve();
	}

}
