package com.exercises.general;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Problem Link : https://codeforces.com/problemset/problem/903/C
 * 
 * Problem Description:
 * 
 * Mishka has got n empty boxes. For every i (1 ≤ i ≤ n), i-th box is a cube
 * with side length ai.
 * 
 * Mishka can put a box i into another box j if the following conditions are
 * met:
 * 
 * i-th box is not put into another box; j-th box doesn't contain any other
 * boxes; box i is smaller than box j (ai < aj). Mishka can put boxes into each
 * other an arbitrary number of times. He wants to minimize the number of
 * visible boxes. A box is called visible iff it is not put into some another
 * box.
 * 
 * Help Mishka to determine the minimum possible number of visible boxes!
 */
public class Codeforces_Boxes_Packing {

	public static void main(String[] args) {

		int n = 3;

		int arr[] = { 1, 2, 3 };

		Arrays.sort(arr);

		// frequency map
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);
		}

		int max = Integer.MIN_VALUE;

		for (int i : map.keySet()) {
			max = Math.max(max, map.get(i));
		}

		System.out.println(max);
	}

}
