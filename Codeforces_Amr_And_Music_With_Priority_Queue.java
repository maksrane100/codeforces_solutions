package com.exercises.general;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Problem Link : https://codeforces.com/problemset/problem/507/A
 * 
 * Problem Description: 
 * Amr is a young coder who likes music a lot. He always
 * wanted to learn how to play music but he was busy coding so he got an idea.
 * 
 * Amr has n instruments, it takes ai days to learn i-th instrument. Being busy,
 * Amr dedicated k days to learn how to play the maximum possible number of
 * instruments.
 * 
 * Amr asked for your help to distribute his free days between instruments so
 * that he can achieve his goal.
 * 
 */
public class Codeforces_Amr_And_Music_With_Priority_Queue {

	static class Pair {
		int days_required_to_learn;
		int instrument_number;

		public Pair(int u, int v) {
			this.days_required_to_learn = u;
			this.instrument_number = v;
		}
	}

	public static void main(String[] args) {
		try {
			int n = 5;
			int k = 6;
			int[] days = { 4, 1, 1, 1, 2 };

			PriorityQueue<Pair> pq = new PriorityQueue<Pair>(
					(a, b) -> a.days_required_to_learn - b.days_required_to_learn);

			for (int i = 0; i < n; i++) {
				pq.add(new Pair(days[i], i));
			}

			int i = 0;

			List<Integer> instrumentNumberList = new LinkedList<Integer>();

			while (i < n) {
				Pair p = pq.poll();

				if (k >= p.days_required_to_learn) {
					k -= p.days_required_to_learn;
					instrumentNumberList.add(p.instrument_number);
				} else {
					break;
				}
				i++;
			}

			System.out.println(i);

			for (int j = 0; j < i; j++) {
				System.out.print((instrumentNumberList.get(j) + 1) + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
