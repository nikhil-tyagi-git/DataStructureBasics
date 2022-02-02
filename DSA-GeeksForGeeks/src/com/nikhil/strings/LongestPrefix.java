package com.nikhil.strings;

import java.util.ArrayList;

public class LongestPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"flower","flow","flight"};
		longestCommonPrefix(s);
	}
	  public static void longestCommonPrefix(String[] str) {
	        ArrayList<Character> al=new ArrayList<>();
	        int i=0;
	        while(i < str[0].length() && i<str[1].length() &&str[0].charAt(i) == str[1].charAt(i) ){
	            al.add(str[0].charAt(i));
	            System.out.println(str[0].charAt(i));
	            i++;
	        }
	        for(char c: al)
	        System.out.print(c);
	    }

}
