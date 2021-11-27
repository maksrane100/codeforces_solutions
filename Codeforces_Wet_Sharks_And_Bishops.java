package com.codeforces;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Problem Link: https://codeforces.com/problemset/problem/621/B
 * 
 * Problem Description:
 * 
 * Today, Wet Shark is given n bishops on a 1000 by 1000 grid. Both rows and
 * columns of the grid are numbered from 1 to 1000. Rows are numbered from top
 * to bottom, while columns are numbered from left to right.
 * 
 * Wet Shark thinks that two bishops attack each other if they share the same
 * diagonal. Note, that this is the only criteria, so two bishops may attack
 * each other (according to Wet Shark) even if there is another bishop located
 * between them. Now Wet Shark wants to count the number of pairs of bishops
 * that attack each other.
 * 
 */
public class Codeforces_Wet_Sharks_And_Bishops {

	public static void main(String[] args) {

		int n = 5;
		
		int[][] input = { { 1, 1 }, { 1, 5 }, { 3, 3 }, { 5, 1 }, { 5, 5 } };

		Map<Integer, Integer> sumMap = new HashMap<Integer, Integer>();

		Map<Integer, Integer> minusMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			int[] in = input[i];

			int a = in[0];
			int b = in[1];

			int total = a + b;

			int sub = b - a;

			if (!sumMap.containsKey(total)) {
				sumMap.put(total, 1);
			} else {
				sumMap.put(total, sumMap.get(total) + 1);
			}

			if (!minusMap.containsKey(sub)) {
				minusMap.put(sub, 1);
			} else {
				minusMap.put(sub, minusMap.get(sub) + 1);
			}

		}

		long result = 0;

		for (int i : sumMap.keySet()) {
			long v = sumMap.get(i);
			//calculate number of  pairs we can make using formula (n * (n-1))/2
			result += v * (v - 1) / 2;
		}

		for (int i : minusMap.keySet()) {
			long v = minusMap.get(i);
			//calculate number of  pairs we can make using formula (n * (n-1))/2
			result += v * (v - 1) / 2;
		}

		System.out.println(result);
	}

}
