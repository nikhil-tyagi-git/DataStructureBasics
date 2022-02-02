package com.nikhil.strings;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		String s1="silennt1";
		String s2="linsten1";
		System.out.println(anagramChar(s1,s2));
		System.out.println(anagram(s1,s2));

	}
	
	static boolean anagram(String s1, String s2) {
		
		if(s1.length() != s2.length() ) {
			return false;
		}
		char a[] = s1.toCharArray();
		char b[]= s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		s1 = new String(a);
		s2 = new String(b);
		
		return s1.equals(s2);
	}
	
	/*Using char Array*/
	
	static boolean anagramChar(String s1, String s2) {
		if(s1.length() != s2.length() ) {
			return false;
		}
		final int CHAR= 256;
		int count[] = new int[CHAR];
		for(int i = 0 ; i < s1.length() ; i++) {
			count[s1.charAt(i)]++;
			System.out.println(s1.charAt(i));
			count[s2.charAt(i)]--;
		}
		
		for(int i = 0 ; i < CHAR ; i++) {
			if(count[i] != 0) return false; 
		}
		return true;
	}
}
