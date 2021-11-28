package com.codeforces;

import java.util.Arrays;

/**
 * 
 * Problem Link : https://codeforces.com/problemset/problem/388/A
 * 
 * Problem Description:
 * 
 * Fox Ciel has n boxes in her room. They have the same size and weight, but
 * they might have different strength. The i-th box can hold at most xi boxes on
 * its top (we'll call xi the strength of the box).
 * 
 * Since all the boxes have the same size, Ciel cannot put more than one box
 * directly on the top of some box. For example, imagine Ciel has three boxes:
 * the first has strength 2, the second has strength 1 and the third has
 * strength 1. She cannot put the second and the third box simultaneously
 * directly on the top of the first one. But she can put the second box directly
 * on the top of the first one, and then the third box directly on the top of
 * the second one. We will call such a construction of boxes a pile.
 * 
 * Fox Ciel wants to construct piles from all the boxes. Each pile will contain
 * some boxes from top to bottom, and there cannot be more than xi boxes on the
 * top of i-th box. What is the minimal number of piles she needs to construct?
 * 
 * 
 */
public class Codeforces_Fox_Box_Accumulation_2 {

	public static void solve() {
		int n = 6;
		int a[] = { 0, 1, 1, 2, 2, 4 };

		Arrays.sort(a);

		int number_of_piles = 0;

		int number_of_boxes_put_in_pile = 0;

		// when we are putting the box into a pile, we will mark it as "visited", so
		// that we don't want to re-visit it.
		// (as a box can only be put into one pile)
		boolean[] visited_box = new boolean[n];

		while (number_of_boxes_put_in_pile < n) {

			number_of_piles += 1;

			int sum = 0;

			for (int j = 0; j < n; j++) {

				if (!visited_box[j] && sum <= a[j]) {

					sum += 1;

					visited_box[j] = true;

					// number of boxes put in pile
					number_of_boxes_put_in_pile++;
				}

			}
		}

		System.out.println(number_of_piles);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
