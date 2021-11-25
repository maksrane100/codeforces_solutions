package com.codeforces;

import java.util.Arrays;

/**
 * 
 * Problem Link : https://codeforces.com/problemset/problem/546/B
 * 
 * Problem Description :
 * 
 * Colonel has n badges. He wants to give one badge to every of his n soldiers.
 * Each badge has a coolness factor, which shows how much it's owner reached.
 * Coolness factor can be increased by one for the cost of one coin.
 * 
 * For every pair of soldiers one of them should get a badge with strictly
 * higher factor than the second one. Exact values of their factors aren't
 * important, they just need to have distinct factors.
 * 
 * Colonel knows, which soldier is supposed to get which badge initially, but
 * there is a problem. Some of badges may have the same factor of coolness. Help
 * him and calculate how much money has to be paid for making all badges have
 * different factors of coolness.
 * 
 */
public class Codeforces_Soldier_And_Badges {

	private static void solve() {
		int n = 4;
		int[] arr = { 1, 3, 1, 4 };
		int count = 0;

		Arrays.sort(arr);

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				//if they are same values, we have to make them different
				if (i != j && arr[i] == arr[j]) {
					count++;
					arr[j]++;
				}

		System.out.println(count);

	}

	public static void main(String[] args) {
		solve();
	}

}
