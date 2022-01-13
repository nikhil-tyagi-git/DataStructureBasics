package com.nik;

import java.util.Stack;

public class StackCheck {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<>();
		s.push(23);
		s.push(26);
		s.push(25);
		s.push(22);
		s.push(21);
		
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		
	}

}
