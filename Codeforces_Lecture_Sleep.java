package com.exercises.general.codeforces;

/**
 * Problem Link : https://codeforces.com/problemset/problem/961/B
 * 
 * Problem Description:
 * 
 * Your friend Mishka and you attend a calculus lecture. Lecture lasts n
 * minutes. Lecturer tells ai theorems during the i-th minute.
 * 
 * Mishka is really interested in calculus, though it is so hard to stay awake
 * for all the time of lecture. You are given an array t of Mishka's behavior.
 * If Mishka is asleep during the i-th minute of the lecture then ti will be
 * equal to 0, otherwise it will be equal to 1. When Mishka is awake he writes
 * down all the theorems he is being told — ai during the i-th minute. Otherwise
 * he writes nothing.
 * 
 * You know some secret technique to keep Mishka awake for k minutes straight.
 * However you can use it only once. You can start using it at the beginning of
 * any minute between 1 and n - k + 1. If you use it on some minute i then
 * Mishka will be awake during minutes j such that and will write down all the
 * theorems lecturer tells.
 * 
 * You task is to calculate the maximum number of theorems Mishka will be able
 * to write down if you use your technique only once to wake him up.
 */

public class Codeforces_Lecture_Sleep {

	static void solve() {
		int n = 6;
		int k = 3;
		int[] arr = { 1, 3, 5, 2, 5, 4 };
		int[] a = { 1, 1, 0, 1, 0, 0 };
		long sum = 0;
		int[] pre_arr = new int[n + 1];
		pre_arr[0] = 0;

		for (int i = 0; i < n; i++) {

			if (a[i] == 1) {
				sum += arr[i];
				arr[i] = 0;
			}
			pre_arr[i + 1] = pre_arr[i] + arr[i];
		}

		int max = 0;

		for (int i = k; i <= n; i++) {
			int y = pre_arr[i] - pre_arr[i - k];
			max = Math.max(max, y);
		}

		System.out.println(sum + max);
	}

	public static void main(String[] args) {
		solve();
	}

}
