package com.exercises.general;

import java.io.IOException;

/**
 * Problem Link : https://codeforces.com/problemset/problem/902/A
 * 
 * Problem Description:
 * 
 * Pig is visiting a friend.
 * 
 * Pig's house is located at point 0, and his friend's house is located at point
 * m on an axis.
 * 
 * Pig can use teleports to move along the axis.
 * 
 * To use a teleport, Pig should come to a certain point (where the teleport is
 * located) and choose where to move: for each teleport there is the rightmost
 * point it can move Pig to, this point is known as the limit of the teleport.
 * 
 * Formally, a teleport located at point x with limit y can move Pig from point
 * x to any point within the segment [x; y], including the bounds.
 * 
 * Determine if Pig can visit the friend using teleports only, or he should use
 * his car.
 */
public class Codeforces_Visiting_A_Friend {

	static void solve() {
		int n = 4;
		int m = 8;
		int arr[][] = { { 0, 2 }, { 2, 4 }, { 4, 6 }, {5,8} };
		
		int x = 0;
		
		for (int i = 0; i < n; i++) {
			if (arr[i][0] <= x)
				x = Math.max(x, arr[i][1]);
		}
		
		if (x >= m) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static void main(String[] args) throws IOException {

		solve();
	}

}
