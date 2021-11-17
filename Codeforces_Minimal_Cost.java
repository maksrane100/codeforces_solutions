package com.exercises.general;

/**
 * Problem Link : https://codeforces.com/problemset/problem/1491/B
 * 
 * Problem Description:
 * 
 * There is a graph of n rows and 106+2 columns, where rows are numbered from 1
 * to n and columns from 0 to 106+1:
 * 
 * Let's denote the node in the row i and column j by (i,j).
 * 
 * Initially for each i the i-th row has exactly one obstacle — at node (i,ai).
 * You want to move some obstacles so that you can reach node (n,106+1) from
 * node (1,0) by moving through edges of this graph (you can't pass through
 * obstacles). Moving one obstacle to an adjacent by edge free node costs u or v
 * coins, as below:
 * 
 * If there is an obstacle in the node (i,j), you can use u coins to move it to
 * (i−1,j) or (i+1,j), if such node exists and if there is no obstacle in that
 * node currently. If there is an obstacle in the node (i,j), you can use v
 * coins to move it to (i,j−1) or (i,j+1), if such node exists and if there is
 * no obstacle in that node currently. Note that you can't move obstacles
 * outside the grid. For example, you can't move an obstacle from (1,1) to
 * (0,1). Refer to the picture above for a better understanding.
 * 
 * Now you need to calculate the minimal number of coins you need to spend to be
 * able to reach node (n,106+1) from node (1,0) by moving through edges of this
 * graph without passing through obstacles.
 */
public class Codeforces_Minimal_Cost {

	public static void main(String[] args) {

		int n = 2;
		int u = 3;
		int v = 4;

		int arr[] = { 3, 2 };

		int max_difference = -1;

		for (int i = 1; i < n; i++) {
			max_difference = Math.max(max_difference, Math.abs(arr[i - 1] - arr[i]));
		}

		if (max_difference == 0) {
			int cost = Math.min(u + v, 2 * v);
			System.out.println(cost);
		} else if (max_difference == 1) {
			int cost = Math.min(u, v);
			System.out.println(cost);
		} else {
			System.out.println(0);
		}

	}

}
