package com.exercises.general;


/**
 * Problem Link : https://codeforces.com/problemset/problem/616/B
 * 
 * Problem Description:
 * 
 * Jack decides to invite Emma out for a dinner. Jack is a modest student, he
 * doesn't want to go to an expensive restaurant. Emma is a girl with high
 * taste, she prefers elite places.
 * 
 * Munhattan consists of n streets and m avenues. There is exactly one
 * restaurant on the intersection of each street and avenue. The streets are
 * numbered with integers from 1 to n and the avenues are numbered with integers
 * from 1 to m. The cost of dinner in the restaurant at the intersection of the
 * i-th street and the j-th avenue is cij.
 * 
 * Jack and Emma decide to choose the restaurant in the following way. Firstly
 * Emma chooses the street to dinner and then Jack chooses the avenue. Emma and
 * Jack makes their choice optimally: Emma wants to maximize the cost of the
 * dinner, Jack wants to minimize it. Emma takes into account that Jack wants to
 * minimize the cost of the dinner. Find the cost of the dinner for the couple
 * in love.
 * 
 */
public class Codeforces_Dinner_With_Emma {

	public static void main(String[] args) {
		int n = 3;
		int m = 3;
		int mat[][] = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };

		int minimum_cost = 0;
		
		for (int i = 0; i < n; i++) {
			
			int min = Integer.MAX_VALUE;
			
			for (int j = 0; j < m; j++) {
				min = Math.min(min, mat[i][j]);
			}
			
			minimum_cost = Math.max(minimum_cost, min);
		}
		
		System.out.println("Result:" + minimum_cost);

	}

}
