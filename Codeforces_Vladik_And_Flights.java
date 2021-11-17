package com.exercises.general;

import java.io.IOException;

/**
 * Problem Link : https://codeforces.com/problemset/problem/743/A
 * 
 * Problem Description:
 * 
 * Vladik is a competitive programmer. This year he is going to win the
 * International Olympiad in Informatics. But it is not as easy as it sounds:
 * the question Vladik face now is to find the cheapest way to get to the
 * olympiad.
 * 
 * Vladik knows n airports. All the airports are located on a straight line.
 * Each airport has unique id from 1 to n, Vladik's house is situated next to
 * the airport with id a, and the place of the olympiad is situated next to the
 * airport with id b. It is possible that Vladik's house and the place of the
 * olympiad are located near the same airport.
 * 
 * To get to the olympiad, Vladik can fly between any pair of airports any
 * number of times, but he has to start his route at the airport a and finish it
 * at the airport b.
 * 
 * Each airport belongs to one of two companies. The cost of flight from the
 * airport i to the airport j is zero if both airports belong to the same
 * company, and |i - j| if they belong to different companies.
 * 
 * Print the minimum cost Vladik has to pay to get to the olympiad.
 */
public class Codeforces_Vladik_And_Flights {

	public static void main(String[] args) throws IOException {

		int n = 4;
		int a = 1;
		int b = 4;
		String airportString = "1010";

		if (airportString.charAt(a - 1) == airportString.charAt(b - 1)) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}

}
