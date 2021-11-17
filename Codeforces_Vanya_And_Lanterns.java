package com.exercises.general;

import java.util.Arrays;

/**
 * Problem Link : https://codeforces.com/problemset/problem/492/B
 * 
 * Problem Description:
 * 
 * Vanya walks late at night along a straight street of length l, lit by n
 * lanterns. Consider the coordinate system with the beginning of the street
 * corresponding to the point 0, and its end corresponding to the point l. Then
 * the i-th lantern is at the point ai. The lantern lights all points of the
 * street that are at the distance of at most d from it, where d is some
 * positive number, common for all lanterns.
 * 
 * Vanya wonders: what is the minimum light radius d should the lanterns have to
 * light the whole street?
 */
public class Codeforces_Vanya_And_Lanterns {

	public static void main(String[] args) {

		int n = 7;
		int l = 35;
		int[] a = { 15, 5, 3, 7, 9, 14, 0 };

		Arrays.sort(a);

		double result = Math.max(a[0], l - a[n - 1]);

		for (int i = 0; i < n - 1; i++) {

			double current_radius = (a[i + 1] - a[i]) * 1.0 / 2;

			System.out.println(a[i] + "   " + a[i + 1] + "    current_radius:" + current_radius);

			result = Math.max(result, current_radius);
		}

		System.out.println("Result:" + result);

	}

}
