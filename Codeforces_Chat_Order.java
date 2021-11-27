package com.codeforces;

import java.util.LinkedHashSet;

/**
 * 
 * Problem Link: https://codeforces.com/problemset/problem/637/B
 * 
 * Problem Description:
 * 
 * Polycarp is a big lover of killing time in social networks. A page with a
 * chatlist in his favourite network is made so that when a message is sent to
 * some friend, his friend's chat rises to the very top of the page. The
 * relative order of the other chats doesn't change. If there was no chat with
 * this friend before, then a new chat is simply inserted to the top of the
 * list.
 * 
 * Assuming that the chat list is initially empty, given the sequence of
 * Polycaprus' messages make a list of chats after all of his messages are
 * processed. Assume that no friend wrote any message to Polycarpus.
 * 
 */
public class Codeforces_Chat_Order {

	public static void main(String[] args) {

		int n = 4;

		String[] a = { "alex", "ivan", "roman", "ivan" };

		LinkedHashSet<String> s = new LinkedHashSet<>();
		

		for (int i = n - 1; i >= 0; i--) {
			s.add(a[i]);
		}

		System.out.println("");

		Object[] p = s.toArray();

		for (int i = 0; i < p.length; i++) {
			System.out.println((String) p[i]);
		}
	}

}
