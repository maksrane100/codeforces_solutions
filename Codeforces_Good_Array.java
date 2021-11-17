package com.exercises.general;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

/**
 * 
 * Problem Link: https://codeforces.com/problemset/problem/1077/C
 * 
 * Problem Description: Let's call an array good if there is an element in the
 * array that equals to the sum of all other elements. For example, the array
 * a=[1,3,3,7] is good because there is the element a4=7 which equals to the sum
 * 1+3+3.
 * 
 * You are given an array a consisting of n integers. Your task is to print all
 * indices j of this array such that after removing the j-th element from the
 * array it will be good (let's call such indices nice).
 * 
 * For example, if a=[8,3,5,2], the nice indices are 1 and 4:
 * 
 * if you remove a1, the array will look like [3,5,2] and it is good; if you
 * remove a4, the array will look like [8,3,5] and it is good. You have to
 * consider all removals independently, i. e. remove the element, check if the
 * resulting array is good, and return the element into the array.
 */
public class Codeforces_Good_Array {

	public static void main(String[] args) throws IOException {

		int n = 4;
		int A[] = { 8, 3, 5, 2 };
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			map.put(A[i], 1);
		}

		long sum = Arrays.stream(A).sum();

		for (int i = 0; i < n; i++) {

			long temp = sum - A[i];

			if (map.get(A[i]) > 1) {
				long y = map.lastKey();
				if (y == temp - y) {
					list.add(i + 1);
				}
			} else {
				map.remove(A[i]);
				long y = map.lastKey();
				if (y == temp - y) {
					list.add(i + 1);
				}
				map.put(A[i], 1);
			}
		}

		System.out.println(list.size());

		for (int i : list) {
			System.out.print(i + " ");
		}

	}

}
