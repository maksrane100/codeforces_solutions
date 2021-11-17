package com.exercises.general;

import java.io.IOException;


/**
 * Problem Link : https://codeforces.com/problemset/problem/1141/B
 * 
 * Problem Description:
 * 
 * Each day in Berland consists of n hours. Polycarp likes time management.
 * That's why he has a fixed schedule for each day — it is a sequence a1,a2,…,an
 * (each ai is either 0 or 1), where ai=0 if Polycarp works during the i-th hour
 * of the day and ai=1 if Polycarp rests during the i-th hour of the day.
 * 
 * Days go one after another endlessly and Polycarp uses the same schedule for
 * each day.
 * 
 * What is the maximal number of continuous hours during which Polycarp rests?
 * It is guaranteed that there is at least one working hour in a day.
 */
public class Codeforces_Maximal_Continuous_Rest {

	public static void solve() {

		int n = 7;
		//int[] input = { 1, 0, 1, 0, 1 };
		int[] input = { 1 ,0, 1, 1, 1, 0, 1 };
		
		int[] arr = new int[n + n];

		for (int i = 0; i < n; i++) {
			arr[i] = input[i];
			arr[n + i] = arr[i];
		}

		int[] dp = new int[2 * n];
		if (arr[0] == 0)
			dp[0] = 0;
		else
			dp[0] = 1;

		int ans = dp[0];

		for (int i = 1; i < 2 * n; i++) {
			if (arr[i] == 1) {
				dp[i] = dp[i - 1] + 1;
			} else {

				dp[i] = 0;
			}
			ans = Math.max(ans, dp[i]);
		}

		System.out.println(ans);

	}

	public static void main(String[] args) throws IOException {

		solve();
	}

}
