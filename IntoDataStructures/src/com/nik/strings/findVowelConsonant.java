package com.nik.strings;

public class findVowelConsonant {

	public static void main(String[] args) {

		String s = "geeks for geeks";
		int v = 0; int c=0;
		
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				v++;
			}
			else if (s.charAt(i) >= 'a' && s.charAt(i)<='z') c++;
		}
		System.out.println("Vowels count: "+v+" \nConsonants count: "+c);
	}

}
