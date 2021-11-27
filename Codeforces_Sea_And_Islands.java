package com.codeforces;

/**
 * 
 * Problem Link: https://codeforces.com/problemset/problem/544/B
 * 
 * Problem Description:
 * 
 * A map of some object is a rectangular field consisting of n rows and n
 * columns. Each cell is initially occupied by the sea but you can cover some
 * some cells of the map with sand so that exactly k islands appear on the map.
 * We will call a set of sand cells to be island if it is possible to get from
 * each of them to each of them by moving only through sand cells and by moving
 * from a cell only to a side-adjacent cell. The cells are called to be
 * side-adjacent if they share a vertical or horizontal side. It is easy to see
 * that islands do not share cells (otherwise they together form a bigger
 * island).
 * 
 * Find a way to cover some cells with sand so that exactly k islands appear on
 * the n × n map, or determine that no such way exists.
 * 
 */
public class Codeforces_Sea_And_Islands {

	public static void main(String[] args) {

		int n = 5;
		int k = 10;
        char[][] a = new char[n][n];
 
        //greedily create number of islands that is given in "k"
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = i + j;
                if (k > 0 && sum % 2 == 0) {
                    a[i][j] = 'L';
                    k--;
                } else {
                    a[i][j] = 'S';
                }
            }
        }
        
        //if we can not create number of islands that is given in "k",
        //then print NO
        if (k > 0) {
            System.out.println("NO");
        } else {
        	
        	//print the grid after island creation
        	System.out.println("YES");
            for (char[] c : a) {
            	System.out.print(new String(c));
            	System.out.println();
            }
        }

	}

}
