package com.nikhil.strings;

public class Palindrome {

	public static void main(String[] args) {

		String s="ABCOOXXCBA";
		System.out.println(palindromecheck(s));
		System.out.println(palindromecheck2(s));
	}
	
	static boolean palindromecheck(String s) {
		char c[] = s.toCharArray();
		int j=s.length()-1;
		for(int i=0; i<s.length()/2; i++) {
			if(c[i] != c[j]) return false;
			j--;
		}
		/* Can be done with begin & end with while (begin < end)*/
		return true;
	}
	
	static boolean palindromecheck2(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return s.equals(sb.toString());
	}

}
