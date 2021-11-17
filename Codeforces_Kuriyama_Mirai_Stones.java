package com.exercises.general;

import java.util.Arrays;

/**
 * Problem Link : https://codeforces.com/problemset/problem/433/B
 *
 */
public class Codeforces_Kuriyama_Mirai_Stones {

	public static void main(String[] args) {

		int n = 6;
		int l = 3;
		int r = 6;
		int type = 2;

		long arr[] = { 6, 4, 2, 7, 2, 7 };

		long presum[] = new long[n + 1];

		long presum_after_sorting[] = new long[n + 1];

		presum[1] = arr[0];

		for (int i = 2; i <= n; i++) {
			presum[i] = presum[i - 1] + arr[i - 1];
		}

		Arrays.sort(arr);

		presum_after_sorting[1] = arr[0];

		for (int i = 2; i <= n; i++) {
			presum_after_sorting[i] = presum_after_sorting[i - 1] + arr[i - 1];
		}

		long result = 0;

		if (type == 1) {
			result = presum[r] - presum[l - 1];
		} else if (type == 2) {
			result = presum_after_sorting[r] - presum_after_sorting[l - 1];
		}

		System.out.println(result);
	}

}
