package com.codeforces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 * 
 * Problem Link : https://codeforces.com/problemset/problem/580/C
 * 
 * Problem Description:
 * 
 * Kefa decided to celebrate his first big salary by going to the restaurant.
 * 
 * He lives by an unusual park. The park is a rooted tree consisting of n
 * vertices with the root at vertex 1. Vertex 1 also contains Kefa's house.
 * Unfortunaely for our hero, the park also contains cats. Kefa has already
 * found out what are the vertices with cats in them.
 * 
 * The leaf vertices of the park contain restaurants. Kefa wants to choose a
 * restaurant where he will go, but unfortunately he is very afraid of cats, so
 * there is no way he will go to the restaurant if the path from the restaurant
 * to his house contains more than m consecutive vertices with cats.
 * 
 * Your task is to help Kefa count the number of restaurants where he can go.
 */
public class Codeforces_Kefa_And_Park_2 {

	private static class Node {
		int u;
		int catCount = 0;

		Node(int u, int catCount) {
			this.u = u;
			this.catCount = catCount;
		}
	}

	private static void solve() {
		int n = 6;
		int m = 1;

		int cats[] = { 1, 1, 0, 0, 0, 0 };
		int[][] input = { { 1, 2 }, { 1, 3 }, { 1, 4 } , {4,5}, {4,6}};
		
		@SuppressWarnings("unchecked")
		List<Integer> adjacency_list[] = new ArrayList[n];

		for (int i = 0; i < n; i++) {
			adjacency_list[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < n - 1; i++) {
			int[] in = input[i];
			int u = in[0];
			int v = in[1];
			u--;
			v--;
			adjacency_list[u].add(v);
			adjacency_list[v].add(u);
		}

		boolean visited[] = new boolean[n];
		
		Queue<Node> queue = new LinkedList<Node>();
		
		if (cats[0] == 1) {
			queue.add(new Node(0, 1));
		} else {
			queue.add(new Node(0, 0));
		}

		visited[0] = true;

		int count_distinct_visitable_leaves = 0;

		//BFS Starts
		while (!queue.isEmpty()) {
			
			Node u = queue.remove();
			
			for (Integer v : adjacency_list[u.u]) {
				
				if (!visited[v]) {
					visited[v] = true;
				
					if (cats[v] == 1) {
						
						//if there is a cat on this vertex, we will check the consecutive cat count and make sure that it won't
						//go above allowable consecutive cat count limit that is given in the input.
						
						if (u.catCount + 1 <= m) {
							queue.add(new Node(v, u.catCount + 1));
							
							//if it's a leaf of the tree, increment the count
							if (adjacency_list[v].size() == 1) {
								count_distinct_visitable_leaves++;
							}
						}
					} else {
						queue.add(new Node(v, 0));
						
						//if it's a leaf of the tree, increment the count
						if (adjacency_list[v].size() == 1) {
							count_distinct_visitable_leaves++;
						}
					}
					
				}
			}
		}
		System.out.println(count_distinct_visitable_leaves);

	}

	public static void main(String[] args) {
		solve();
	}

}
