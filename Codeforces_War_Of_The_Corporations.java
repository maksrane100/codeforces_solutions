package com.exercises.general;

/**
 * Problem Link : https://codeforces.com/problemset/problem/625/B
 * 
 * Problem Description:
 * 
 * A long time ago, in a galaxy far far away two giant IT-corporations Pineapple
 * and Gogol continue their fierce competition. Crucial moment is just around
 * the corner: Gogol is ready to release it's new tablet Lastus 3000.
 * 
 * This new device is equipped with specially designed artificial intelligence
 * (AI). Employees of Pineapple did their best to postpone the release of Lastus
 * 3000 as long as possible. Finally, they found out, that the name of the new
 * artificial intelligence is similar to the name of the phone, that Pineapple
 * released 200 years ago. As all rights on its name belong to Pineapple, they
 * stand on changing the name of Gogol's artificial intelligence.
 * 
 * Pineapple insists, that the name of their phone occurs in the name of AI as a
 * substring. Because the name of technology was already printed on all devices,
 * the Gogol's director decided to replace some characters in AI name with "#".
 * As this operation is pretty expensive, you should find the minimum number of
 * characters to replace with "#", such that the name of AI doesn't contain the
 * name of the phone as a substring.
 * 
 * Substring is a continuous subsequence of a string.
 */
public class Codeforces_War_Of_The_Corporations {

	public static void main(String[] args) {
		String original = "sirisiri";
		String s1 = "sir";
		int i = 0;
		long minimum_replacements = 0;
		
		
		while (original.indexOf(s1, i) >= 0) {
			minimum_replacements++;
			
			i = original.indexOf(s1, i) + s1.length();
			
			//System.out.println("updated index : "+i);
		}
		
		System.out.println("Result:" + minimum_replacements);

	}

}
