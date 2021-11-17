package com.exercises.general;

import java.io.IOException;
import java.util.Stack;

public class Codeforces_Bad_Sequence {

	public static void main(String[] args) throws IOException {
		int n = 4;
		String s = ")()(";

		//String s = "))()((";

		int closed = 0;
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);

			if (ch == '(')
				stack.push(ch);
			else {
				if (stack.empty()) {
					closed++;
				} else {
					stack.pop();
				}
			}
		}

		if (closed == 0 && stack.size() == 0) {
			System.out.println("Yes");
		} else if (closed == 1 && stack.size() == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
