package com.codeforces;

import java.util.TreeSet;
/**
 * 
 * Problem Link: https://codeforces.com/problemset/problem/702/C
 * 
 * Problem Description:
 * 
 * You are given n points on the straight line — the positions (x-coordinates) of the cities and m points on the same line — the positions (x-coordinates) of the cellular towers. All towers work in the same way — they provide cellular network for all cities, which are located at the distance which is no more than r from this tower.

Your task is to find minimal r that each city has been provided by cellular network, i.e. for each city there is at least one cellular tower at the distance which is no more than r.

If r = 0 then a tower provides cellular network only for the point where it is located. One tower can provide cellular network for any number of cities, but all these cities must be at the distance which is no more than r from this tower.

 */
public class Codeforces_Cellular_Network_2 {

	public static void main(String[] args) {
/*
		int n = 3; //cities
		int m = 2; // number of towers
		long a[] = { -2, 2, 4 }; //city location
		long b[] = { -3, 0 }; //tower location
*/
		int n = 5;
		int m = 3;
		
		long a[] = { -8,-4,2,8,9 };
		long b[] = { -6,-3,6 };
		
		TreeSet<Long> treeSet = new TreeSet<Long>();

		for (int i = 0; i < m; i++) {
			treeSet.add(b[i]);
		}

		long r = Integer.MAX_VALUE;
		long result = 0;
		Long x;

		for (int i = 0; i < n; i++) {
			r = Integer.MAX_VALUE;
			
			System.out.println("Finding left and right towers location for city : "+a[i]);
			
			x = treeSet.lower(a[i] + 1);
			System.out.println("left cellular tower:"+x);
			
			if (x != null) {
				r = Math.min(r, a[i] - x);  //closest left tower
			}

			x = treeSet.higher(a[i] - 1);
			
			System.out.println("right cellular tower:"+x);
			
			if (x != null) {
				r = Math.min(r, x - a[i]); //closest right tower
			}

			result = Math.max(result, r);
		}

		System.out.println(result + "");
	}

}
