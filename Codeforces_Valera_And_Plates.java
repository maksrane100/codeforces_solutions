package com.exercises.general;

/**
 * Link To The Problem:
 * 
 * https://codeforces.com/problemset/problem/369/A
 * 
 * Problem Description:
 * 
 * Valera is a lazy student. He has m clean bowls and k clean plates.
 * 
 * Valera has made an eating plan for the next n days. As Valera is lazy, he
 * will eat exactly one dish per day. At that, in order to eat a dish, he needs
 * exactly one clean plate or bowl. We know that Valera can cook only two types
 * of dishes. He can eat dishes of the first type from bowls and dishes of the
 * second type from either bowls or plates.
 * 
 * When Valera finishes eating, he leaves a dirty plate/bowl behind. His life
 * philosophy doesn't let him eat from dirty kitchenware. So sometimes he needs
 * to wash his plate/bowl before eating. Find the minimum number of times Valera
 * will need to wash a plate/bowl, if he acts optimally.
 *
 */
public class Codeforces_Valera_And_Plates {

	public static void main(String[] args) {
		try {

			int n = 8;
			int m = 2; // number of bowls
			int k = 2; // number of plates

			int type_of_dish[] = { 1, 2, 1, 2, 1, 2, 1, 2 };

			int cleaning_required = 0;

			for (int i = 0; i < n; i++) {

				if (type_of_dish[i] == 1) { // he is cooking type 1 dish
					if (m > 0) {
						m--;
					} else {
						cleaning_required++;
					}
				} else { // he is cooking type 2 dish
					if (k > 0) {
						k--;
					} else if (m > 0) {
						m--;
					} else {
						cleaning_required++;
					}
				}
			}

			System.out.println("result:" + Integer.toString(cleaning_required));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
