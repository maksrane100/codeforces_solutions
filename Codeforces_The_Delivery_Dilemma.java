package com.exercises.general.codeforces;

import java.io.IOException;
import java.util.Arrays;

/**
 * Problem Link : https://codeforces.com/problemset/problem/1443/C
 * 
 * Problem Description:
 * 
 * Petya is preparing for his birthday. He decided that there would be n n
 * different dishes on the dinner table, numbered from 1 1 to n n . Since Petya
 * doesn't like to cook, he wants to order these dishes in restaurants.
 * 
 * Unfortunately, all dishes are prepared in different restaurants and therefore
 * Petya needs to pick up his orders from n n different places. To speed up this
 * process, he wants to order courier delivery at some restaurants. Thus, for
 * each dish, there are two options for Petya how he can get it: • the dish will
 * be delivered by a courier from the restaurant i i , in this case the courier
 * will arrive in a i ai minutes, • Petya goes to the restaurant i i on his own
 * and picks up the dish, he will spend b i bi minutes on this.
 * 
 * Each restaurant has its own couriers and they start delivering the order at
 * the moment Petya leaves the house. In other words, all couriers work in
 * parallel. Petya must visit all restaurants in which he has not chosen
 * delivery, he does this consistently.
 * 
 * For example, if Petya wants to order n=4 n=4 dishes and a=[3,7,4,5]
 * a=[3,7,4,5] , and b=[2,1,2,4] b=[2,1,2,4] , then he can order delivery from
 * the first and the fourth restaurant, and go to the second and third on your
 * own. Then the courier of the first restaurant will bring the order in 3 3
 * minutes, the courier of the fourth restaurant will bring the order in 5 5
 * minutes, and Petya will pick up the remaining dishes in 1+2=3 1+2=3 minutes.
 * Thus, in 5 5 minutes all the dishes will be at Petya's house.
 * 
 * Find the minimum time after which all the dishes can be at Petya's home.
 *
 * 
 * 
 */

public class Codeforces_The_Delivery_Dilemma {

	static class Order implements Comparable<Order> {
		int delivery;
		int pickUP;

		@Override
		public int compareTo(Order o) {
			return this.delivery - o.delivery;
		}
	}

	static void solve() throws IOException {
		int n = 4;

		Order orders[] = new Order[n];
		// int[] delivery = { 1, 2, 3, 4 };
		// int[] pickup = { 3, 3, 3, 3 }; // [9, 6, 3, 4]

		int[] delivery = { 1, 2, 3, 4 };
		int[] pickup = { 3, 3, 3, 3 }; // [3, 2, 3, 4]

		long answer = Long.MAX_VALUE;
		long total_picked = 0;

		long results[] = new long[n];

		for (int i = 0; i < n; i++) {
			orders[i] = new Order();
			orders[i].delivery = delivery[i];
		}

		for (int i = 0; i < n; i++) {
			orders[i].pickUP = pickup[i];
		}

		Arrays.sort(orders);

		for (int i = 0; i < n; i++) {
			total_picked += orders[i].pickUP;
		}

		answer = total_picked;

		for (int i = 0; i < n; i++) {
			total_picked -= orders[i].pickUP;
			results[i] = Math.max(orders[i].delivery, total_picked);
		}

		for (int i = 0; i < n; i++) {
			answer = Math.min(answer, results[i]);
		}

		System.out.println(answer);

	}

	public static void main(String[] args) throws Exception {
		solve();
	}

}
