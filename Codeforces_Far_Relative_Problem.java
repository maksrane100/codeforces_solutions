package com.codeforces;


/**
 * 
 * Problem Link: https://codeforces.com/problemset/problem/629/B
 * 
 * Problem Description:
 * 
 * Famil Door wants to celebrate his birthday with his friends from Far Far
 * Away. He has n friends and each of them can come to the party in a specific
 * range of days of the year from ai to bi. Of course, Famil Door wants to have
 * as many friends celebrating together with him as possible.
 * 
 * Far cars are as weird as Far Far Away citizens, so they can only carry two
 * people of opposite gender, that is exactly one male and one female. However,
 * Far is so far from here that no other transportation may be used to get to
 * the party.
 * 
 * Famil Door should select some day of the year and invite some of his friends,
 * such that they all are available at this moment and the number of male
 * friends invited is equal to the number of female friends invited. Find the
 * maximum number of friends that may present at the party.
 * 
 * 
 */
public class Codeforces_Far_Relative_Problem {

	public static void main(String[] args) {

		int n = 4;
		
		String[] input = { "M 151 307", "F 343 352", "F 117 145", "M 24 128" };

		int[] male = new int[366];
		
		int[] female = new int[366];

		for (int i = 0; i < n; i++) {
			String inputStr = input[i];
			
			//converting input string into array
			String[] arr = inputStr.split(" ");
			
			char c = arr[0].charAt(0);

			//when it's a Male friend
			if (c == 'M') {
				int s = Integer.valueOf(arr[1]) - 1;
				int e = Integer.valueOf(arr[2]) - 1;
				for (int j = s; j <= e; j++) {
					male[j]++;
				}
			} else {  //when it's a Female friend
				int s = Integer.valueOf(arr[1]) - 1;
				int e = Integer.valueOf(arr[2]) - 1;
				for (int j = s; j <= e; j++) {
					female[j]++;
				}
			}
		}

		int max_friends = 0;

		for (int i = 0; i < male.length; i++) {
			max_friends = Math.max(Math.min(male[i], female[i]), max_friends);
		}

		System.out.println(max_friends * 2);
	}

}
