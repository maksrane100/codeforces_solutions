package com.exercises.general;

import java.io.IOException;
import java.util.Arrays;

/**
 * Problem Link : https://codeforces.com/problemset/problem/1294/B
 * 
 * Problem Description:
 * 
 * There is a robot in a warehouse and n packages he wants to collect. The
 * warehouse can be represented as a coordinate grid. Initially, the robot stays
 * at the point (0,0). The i-th package is at the point (xi,yi). It is
 * guaranteed that there are no two packages at the same point. It is also
 * guaranteed that the point (0,0) doesn't contain a package.
 * 
 * The robot is semi-broken and only can move up ('U') and right ('R'). In other
 * words, in one move the robot can go from the point (x,y) to the point (x+1,y)
 * or to the point (x,y+1).
 * 
 * As we say above, the robot wants to collect all n packages (in arbitrary
 * order). He wants to do it with the minimum possible number of moves. If there
 * are several possible traversals, the robot wants to choose the
 * lexicographically smallest path.
 * 
 * The string s of length n is lexicographically less than the string t of
 * length n if there is some index 1≤j≤n that for all i from 1 to j−1 si=ti and
 * sj<tj. It is the standard comparison of string, like in a dictionary. Most
 * programming languages compare strings in this way.
 */

class Location implements Comparable<Location> {
	int x;
	int y;

	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Location ob) {
		if (this.x < ob.x)
			return -1;
		else if (this.x > ob.x)
			return 1;
		else {
			if (this.y < ob.y)
				return -1;
			else if (this.y > ob.y)
				return 1;
			return 0;
		}
	}
}

public class Codeforces_Collecting_Packages {

	public static void main(String[] args) throws IOException {
		StringBuilder stringBuilder = new StringBuilder();

		int n = 6;
		int[][] input = { { 1, 3 }, { 1, 2 }, { 3, 3 }, { 5, 5 }, { 4, 3 } , {0, 5}};
		
		Location[] A = new Location[n];
		
		for (int i = 0; i < n; i++) {
			A[i] = new Location(input[i][0], input[i][1]);
		}

		Arrays.sort(A);
		
		boolean flag = true;
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("YES\n");
		
		int prev_x = A[0].x;
		int prev_y = A[0].y;
		
		for (int i = 0; i < prev_x; i++) {
			sb.append("R");
		}
		
		for (int i = 0; i < prev_y; i++) {
			sb.append("U");
		}
		
		for (int i = 1; i < n; i++) {
			int x = A[i].x;
			int y = A[i].y;
			
			if (y < prev_y) {
				flag = false;
				break;
			} else {
				int diff_x = x - prev_x;
				int diff_y = y - prev_y;
				
				for (int j = 0; j < diff_x; j++) {
					sb.append("R");
				}
				for (int j = 0; j < diff_y; j++) {
					sb.append("U");
				}
			}
			
			prev_x = x;
			prev_y = y;
		}
		
		if (flag) {
			stringBuilder.append(sb).append("\n");
		}
		else {
			stringBuilder.append("NO\n");
		}
		
		System.out.println(stringBuilder.toString());
	}

}
