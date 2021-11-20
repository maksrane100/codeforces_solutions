package com.exercises.general.codeforces;

import java.util.Arrays;

/**
 * Problem Link : https://codeforces.com/problemset/problem/424/B
 * 
 * Problem Description:
 * 
 * The administration of the Tomsk Region firmly believes that it's time to
 * become a megacity (that is, get population of one million). Instead of
 * improving the demographic situation, they decided to achieve its goal by
 * expanding the boundaries of the city.
 * 
 * The city of Tomsk can be represented as point on the plane with coordinates
 * (0; 0). The city is surrounded with n other locations, the i-th one has
 * coordinates (xi, yi) with the population of ki people. You can widen the city
 * boundaries to a circle of radius r. In such case all locations inside the
 * circle and on its border are included into the city.
 * 
 * Your goal is to write a program that will determine the minimum radius r, to
 * which is necessary to expand the boundaries of Tomsk, so that it becomes a
 * megacity.
 *
 * 
 */

class DistancePeoplePair implements Comparable<DistancePeoplePair> {
	int distance;
	int people;

	DistancePeoplePair(int dist, int ppl) {
		this.distance = dist;
		this.people = ppl;
	}

	public int compareTo(DistancePeoplePair o) {
		return distance - o.distance;
	}
}

public class Codeforces_Megacity {

	final static int MILLION = 1_000_000;

	static void solve() throws Exception {

		int n = 4, s = 999998;
		int[][] input = { { 1, 1, 2 }, { 2, 2, 1 }, { 3, 3, 1 }, { 2, -2, 1 } };

		if (s >= MILLION) {
			System.out.println(0);
			return;
		}

		DistancePeoplePair pairs[] = new DistancePeoplePair[n];

		for (int i = 0; i < n; i++) {
			int[] in = input[i];
			int x = in[0], y = in[1], k = in[2];
			int d2 = x * x + y * y;
			pairs[i] = new DistancePeoplePair(d2, k);
		}

		Arrays.sort(pairs);
		
		// simulating the expansion of the city
		for (int i = 0; i < n; i++) {
			s += pairs[i].people;

			if (s >= MILLION) {
				System.out.println(Math.sqrt(pairs[i].distance));
				return;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		solve();
	}

}
