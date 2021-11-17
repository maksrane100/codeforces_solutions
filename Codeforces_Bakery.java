package com.exercises.general.codeforces;

import java.util.ArrayList;

/**
 * Link To The Problem:
 * 
 * https://codeforces.com/problemset/problem/707/B
 * 
 * Problem Description: 
 * 
 * Masha wants to open her own bakery and bake muffins in
 * one of the n cities numbered from 1 to n. There are m bidirectional roads,
 * each of whose connects some pair of cities.
 * 
 * To bake muffins in her bakery, Masha needs to establish flour supply from
 * some storage. There are only k storages, located in different cities numbered
 * a1, a2, ..., ak.
 * 
 * Unforunately the law of the country Masha lives in prohibits opening bakery
 * in any of the cities which has storage located in it. She can open it only in
 * one of another n - k cities, and, of course, flour delivery should be paid —
 * for every kilometer of path between storage and bakery Masha should pay 1
 * ruble.
 * 
 * Formally, Masha will pay x roubles, if she will open the bakery in some city
 * b (ai ≠ b for every 1 ≤ i ≤ k) and choose a storage in some city s (s = aj
 * for some 1 ≤ j ≤ k) and b and s are connected by some path of roads of
 * summary length x (if there are more than one path, Masha is able to choose
 * which of them should be used).
 * 
 * Masha is very thrifty and rational. She is interested in a city, where she
 * can open her bakery (and choose one of k storages and one of the paths
 * between city with bakery and city with storage) and pay minimum possible
 * amount of rubles for flour delivery. Please help Masha find this amount.
 *
 */
class Node {
	int distance;
	int destination;

	public Node(int x, int y) {
		this.distance = x;
		this.destination = y;
	}

}

public class Codeforces_Bakery {

	public void solve(int n, int m, int k, int[][] arr, int[] storage) {

		ArrayList<Node>[] graph =  new ArrayList[n];

		boolean[] marked = new boolean[n];

		for (int i = 0; i < n; i++) {
			graph[i] = new ArrayList<Node>();
		}

		for (int i = 0; i < m; i++) {
			int[] input = arr[i];
			int u = input[0];
			int v = input[1];
			int length = input[2];
			// roads are bi-directional, so graph will have connection from u to v and from v to u as well.
			graph[u - 1].add(new Node(length, v - 1));
			graph[v - 1].add(new Node(length, u - 1));
		}

		//marking storage nodes
		for (int i = 0; i < k; i++) {
			marked[storage[i] - 1] = true;
		}

		int minlength = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			// if it's a storage location
			if (marked[i]) {

				for (Node p : graph[i]) {
					if (!marked[p.destination]) {
						minlength = Math.min(minlength, p.distance);
					}
				}
			}
		}

		if (minlength == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(minlength);
		}
	}

	public static void main(String[] args) {
		try {
			int n = 5;
			int m = 5;
			int k = 2;
			Codeforces_Bakery obj = new Codeforces_Bakery();
			int[][] arr = { { 1, 2, 5 }, { 1, 2, 3 }, { 2, 3, 4 }, { 1, 4, 10 }, { 5, 4, 1 } };
			int[] storage = { 1, 5 };
			obj.solve(n, m, k, arr, storage);

			System.out.println("done");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
