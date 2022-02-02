package com.nikhil.strings;

public class SubSequence {

	public static void main(String[] args) {
		
		String s="ABEXX";
		String c="ED";
		System.out.println(subsequence(s,c));
		
	}
	
	static boolean subsequence(String s, String c) {
		int i=0,j=0;
		while(i < s.length() && j < c.length()) {
			if(s.charAt(i) == c.charAt(j)) {
				i++;
				j++;
			}
			else i++;
		}
		return (j == c.length());
	}

}
