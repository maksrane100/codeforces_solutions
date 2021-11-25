package com.codeforces;

import java.util.ArrayList;

/**
 * 
 * Problem Link: https://codeforces.com/problemset/problem/690/F1
 * 
 * Problem Description:
 * 
 * Heidi has finally found the mythical Tree of Life – a legendary combinatorial
 * structure which is said to contain a prophecy crucially needed to defeat the
 * undead armies.
 * 
 * On the surface, the Tree of Life is just a regular undirected tree well-known
 * from computer science. This means that it is a collection of n points (called
 * vertices), some of which are connected using n - 1 line segments (edges) so
 * that each pair of vertices is connected by a path (a sequence of one or more
 * edges).
 * 
 * To decipher the prophecy, Heidi needs to perform a number of steps. The first
 * is counting the number of lifelines in the tree – these are paths of length
 * 2, i.e., consisting of two edges. Help her!
 */
public class Codeforces_Tree_Of_Life {

	public static void main(String[] args) {

		int n = 5;
		
		int[][] input = { { 1, 2 }, { 1, 3 }, { 1, 4 } , {1, 5} };
		
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] map = new ArrayList[n];
		
		for (int i = 0; i < n; i++) {
			map[i] = new ArrayList<Integer>();
		}
		
		//create adjacency list from the input edges given
		for (int i = 0; i < n - 1; i++) {
			int[] in = input[i];
			int a = in[0] - 1;
			int b = in[1] - 1;
			map[a].add(b);
			map[b].add(a);
		}
		
		long result = 0;
		
		for (int i = 0; i < n; i++) {
			long v = map[i].size();
			result += v * (v - 1) / 2;
		}
		
		System.out.println(result);
	}

}
