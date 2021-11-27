package com.codeforces;

import java.util.Arrays;

/**
 * 
 * Problem Link: https://codeforces.com/problemset/problem/735/B
 * 
 * Problem Description:
 * 
 * Local authorities have heard a lot about combinatorial abilities of Ostap
 * Bender so they decided to ask his help in the question of urbanization. There
 * are n people who plan to move to the cities. The wealth of the i of them is
 * equal to ai. Authorities plan to build two cities, first for n1 people and
 * second for n2 people. Of course, each of n candidates can settle in only one
 * of the cities. Thus, first some subset of candidates of size n1 settle in the
 * first city and then some subset of size n2 is chosen among the remaining
 * candidates and the move to the second city. All other candidates receive an
 * official refuse and go back home.
 * 
 * To make the statistic of local region look better in the eyes of their
 * bosses, local authorities decided to pick subsets of candidates in such a way
 * that the sum of arithmetic mean of wealth of people in each of the cities is
 * as large as possible. Arithmetic mean of wealth in one city is the sum of
 * wealth ai among all its residents divided by the number of them (n1 or n2
 * depending on the city). The division should be done in real numbers without
 * any rounding.
 * 
 * Please, help authorities find the optimal way to pick residents for two
 * cities.
 * 
 */
public class Codeforces_Urbanization {

	public static void main(String[] args) {

		int n = 4;
		int n1 = 2, n2 = 1;
		int[] a = { 1, 4, 2, 3 };

		Arrays.sort(a);

		double sum1 = 0;
		double sum2 = 0;

		int min = (int) Math.min(n1, n2);
		int max = (int) Math.max(n1, n2);

		int p = min;
		int q = max;

		int i = n - 1;

		//choose minimum possible allowable residents to contribute in maximum possible sum
		while (p != 0) {
			sum1 += a[i];
			i--;
			p--;
		}

		//choose maximum possible allowable residents to contribute in maximum possible sum
		while (q != 0) {
			sum2 += a[i];
			i--;
			q--;
		}
		
		double result = (sum1 / min) + (sum2 / max);
		
		System.out.println(result);

	}

}
