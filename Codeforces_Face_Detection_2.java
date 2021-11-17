package com.exercises.general;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Problem Link : https://codeforces.com/problemset/problem/549/A
 * 
 * Problem Description: 
 * 
 * The developers of Looksery have to write an efficient
 * algorithm that detects faces on a picture. Unfortunately, they are currently
 * busy preparing a contest for you, so you will have to do it for them.
 * 
 * In this problem an image is a rectangular table that consists of lowercase
 * Latin letters. A face on the image is a 2 × 2 square, such that from the four
 * letters of this square you can make word "face".
 * 
 * You need to write a program that determines the number of faces on the image.
 * The squares that correspond to the faces can overlap.
 */

public class Codeforces_Face_Detection_2 {

	static void solve() {
		int n = 4;
		int m = 4;
		char[][] input = { { 'x', 'x', 'x', 'x' }, { 'x', 'f', 'a', 'f' }, { 'x', 'c', 'e', 'c' },
				{ 'x', 'f', 'a', 'x' } };

		// int n = 2;
		// int m = 3;
		// char[][] input = { { 'f', 'a', 'c' }, { 'c', 'e', 'f' } };

		char[][] grid = new char[n + 1][m + 1];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				grid[i + 1][j + 1] = input[i][j];
			}
		}

		int total = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < m - 1; j++) {
				if (valid(input, i, j))
					total++;
			}
		}

		System.out.println(total);

	}

	private static boolean valid(char[][] grid, int i, int j) {
		Set<Character> set = new HashSet<Character>();

		set.add(grid[i][j]);
		set.add(grid[i][j + 1]);
		set.add(grid[i + 1][j]);
		set.add(grid[i + 1][j + 1]);

		if (set.contains('f') && set.contains('a') && set.contains('c') && set.contains('e')) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) throws IOException {

		solve();
	}

}
