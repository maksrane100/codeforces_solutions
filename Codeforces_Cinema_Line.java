package com.exercises.general;

/**
 * Problem Link : https://codeforces.com/problemset/problem/349/A
 * 
 * Problem Description:
 * 
 * The new "Die Hard" movie has just been released! There are n people at the
 * cinema box office standing in a huge line. Each of them has a single 100, 50
 * or 25 ruble bill. A "Die Hard" ticket costs 25 rubles. Can the booking clerk
 * sell a ticket to each person and give the change if he initially has no money
 * and sells the tickets strictly in the order people follow in the line?
 */
public class Codeforces_Cinema_Line {

	public static void main(String[] args) {

		int n = 5;
		int[] a = { 25, 25, 50, 50, 100 };

		int fifty_bill = 0;
		int twenty_five_bill = 0;

		for (int i = 0; i < n; i++) {
			int current_bill = a[i];

			if (current_bill == 25) {
				twenty_five_bill++;
			} else if (current_bill == 50) {
				if (twenty_five_bill >= 1) {
					twenty_five_bill--;
					fifty_bill++;
				} else {
					// can't sell ticket
					System.out.println("NO");
					return;
				}
			} else {
				if (fifty_bill >= 1 && twenty_five_bill >= 1) {
					twenty_five_bill--;
					fifty_bill--;
				} else if (fifty_bill < 1 && twenty_five_bill >= 3) {
					twenty_five_bill -= 3;
				} else {
					// can't sell ticket
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println("YES");

	}

}
