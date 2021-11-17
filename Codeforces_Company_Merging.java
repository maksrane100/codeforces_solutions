package com.exercises.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem Link : https://codeforces.com/problemset/problem/1090/A
 * 
 * Problem Description:
 * 
 * A conglomerate consists of n companies. To make managing easier, their owners
 * have decided to merge all companies into one. By law, it is only possible to
 * merge two companies, so the owners plan to select two companies, merge them
 * into one, and continue doing so until there is only one company left.
 * 
 * But anti-monopoly service forbids to merge companies if they suspect
 * unfriendly absorption. The criterion they use is the difference in maximum
 * salaries between two companies. Merging is allowed only if the maximum
 * salaries are equal.
 * 
 * To fulfill the anti-monopoly requirements, the owners can change salaries in
 * their companies before merging. But the labor union insists on two
 * conditions: it is only allowed to increase salaries, moreover all the
 * employees in one company must get the same increase.
 * 
 * Sure enough, the owners want to minimize the total increase of all salaries
 * in all companies. Help them find the minimal possible increase that will
 * allow them to merge companies into one.
 */
public class Codeforces_Company_Merging {

	private static void solve() {
		int n = 3;
		int[][] input = { { 2, 4, 3 }, { 2, 2, 1 }, { 3, 1, 1, 1 } };

		List<List<Integer>> mergeList = new ArrayList<>(n);
		
		int max = 0;

		for (int i = 0; i < n; i++) {
			int[] arr = input[i];
			int m = arr[0];

			List<Integer> tmp = new ArrayList<>(m);

			for (int j = 1; j <= m; j++) {
				int s = arr[j];
				tmp.add(s);
				max = Math.max(max, s);
			}

			Collections.sort(tmp);

			mergeList.add(tmp);
		}

		long ans = 0;

		for (List<Integer> e : mergeList) {

			int maxs = e.get(e.size() - 1);

			ans += (long) (max - maxs) * e.size();
		}

		System.out.println(ans);
	}

	public static void main(String[] args) {

		solve();
	}

}
