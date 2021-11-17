package com.exercises.general;

import java.util.ArrayList;
import java.util.Collections;

/**
 * /** Problem Link : https://codeforces.com/problemset/problem/492/C
 * 
 * Problem Description:
 * 
 * Vanya wants to pass n exams and get the academic scholarship. He will get the
 * scholarship if the average grade mark for all the exams is at least avg. The
 * exam grade cannot exceed r. Vanya has passed the exams and got grade ai for
 * the i-th exam. To increase the grade for the i-th exam by 1 point, Vanya must
 * write bi essays. He can raise the exam grade multiple times.
 * 
 * What is the minimum number of essays that Vanya needs to write to get
 * scholarship?
 *
 */
class pair implements Comparable<pair> {
	int score;
	int essay;

	public pair(int a, int b) {
		this.score = a;
		this.essay = b;
	}

	@Override
	public int compareTo(pair arg0) {
		if (essay != arg0.essay)
			return Integer.compare(essay, arg0.essay);
		return Integer.compare(score, arg0.score);
	}

}

public class Codeforces_Vanya_And_Exams {

	public static void main(String[] args) {

		int n = 5;
		int r = 5;
		long avg = 4 * n;
		int[][] marks = { { 5, 2 }, { 4, 7 }, { 3, 1 }, { 3, 2 }, { 2, 5 } };

		int total_score = 0;
		ArrayList<pair> ps = new ArrayList<pair>();
		
		for (int i = 0; i < marks.length; i++) {
			int[] arr = marks[i];
			int score = arr[0];
			total_score += score;
			int essays = arr[1];
			ps.add(new pair(score, essays));
		}

		long needed = avg - total_score;
		
		Collections.sort(ps);

		long count = 0;

		for (pair p : ps) {
			if (needed > 0) {
				int current_score = p.score;
				int essays = p.essay;
				long number_raise = Math.min(r - current_score, needed);
				count += number_raise * essays;
				needed -= number_raise;
			}
		}
		System.out.println(count);

	}

}
