package com.string.parantheses;

import java.util.Stack;

// () {} []
public class ValidParantheses {
	
	static boolean  isValid(String s) {
		Stack<Character> charStack = new Stack<>();
		
		for (int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			
			if (c == '{' || c == '(' || c == '[' ) {
				charStack.push(c);
			}
			else if (!charStack.isEmpty() && (c == '}' || c == ')' || c == ']')) {
				char top = charStack.pop();
				if (!((top == '{' && c == '}') ||(top == '[' && c == ']') || (top == '(' && c == ')'))) {
					return false;
				}
			}
			else {
				return false;
			}
		}
		return charStack.isEmpty();
    }
	
	public static void main(String[] args) {
		System.out.println(isValid("((}))"));
		System.out.println(isValid("([({]}))"));
		System.out.println(isValid("([({})])"));

	}

}
