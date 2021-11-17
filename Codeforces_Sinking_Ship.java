package com.exercises.general;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Link To The Problem:
 * 
 * https://codeforces.com/problemset/problem/63/A
 * 
 * Problem Description: 
 * 
 * The ship crashed into a reef and is sinking. Now the
 * entire crew must be evacuated. All n crew members have already lined up in a
 * row (for convenience let's label them all from left to right with positive
 * integers from 1 to n) and await further instructions. However, one should
 * evacuate the crew properly, in a strict order. Specifically:
 * 
 * The first crew members to leave the ship are rats. Then women and children
 * (both groups have the same priority) leave the ship. After that all men are
 * evacuated from the ship. The captain leaves the sinking ship last.
 * 
 * If we cannot determine exactly who should leave the ship first for any two
 * members of the crew by the rules from the previous paragraph, then the one
 * who stands to the left in the line leaves the ship first (or in other words,
 * the one whose number in the line is less).
 * 
 * For each crew member we know his status as a crew member, and also his name.
 * All crew members have different names. Determine the order in which to
 * evacuate the crew.
 * 
 * 
 * content of test.txt is given below:
 * 
 * 
 * 

6
Jack captain
Alice woman
Charlie man
Teddy rat
Bob child
Julia woman

 *
 */
public class Codeforces_Sinking_Ship {

	public static void main(String[] args) {
		try {

			File file = new File(
					"C:\\Users\\test.txt");

			BufferedReader br = new BufferedReader(new FileReader(file));

			String input;

			List<String> rats = new ArrayList<String>();
			List<String> womenChildren = new ArrayList<String>();
			List<String> men = new ArrayList<String>();
			List<String> captains = new ArrayList<String>();

			while ((input = br.readLine()) != null) {

				// System.out.println(input);
				if (input.contains(" rat")) {
					rats.add(input);
				}
				if (input.contains(" woman") || input.contains(" child")) {
					womenChildren.add(input);
				}
				if (input.contains(" man")) {
					men.add(input);
				}
				if (input.contains(" captain")) {
					captains.add(input);
				}

			}

			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < rats.size(); i++) {
				sb.append(rats.get(i).replace(" rat", "\n"));
			}

			for (int i = 0; i < womenChildren.size(); i++) {
				if (womenChildren.get(i).contains(" woman")) {
					sb.append(womenChildren.get(i).replace(" woman", "\n"));
				} else {
					sb.append(womenChildren.get(i).replace(" child", "\n"));
				}
			}

			for (int i = 0; i < men.size(); i++) {
				sb.append(men.get(i).replace(" man", "\n"));
			}

			for (int i = 0; i < captains.size(); i++) {
				sb.append(captains.get(i).replace(" captain", "\n"));
			}

			System.out.println("Result : " + sb.toString().trim());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
