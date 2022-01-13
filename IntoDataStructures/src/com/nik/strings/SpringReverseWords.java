package com.nik.strings;

public class SpringReverseWords {
	
	public static void main(String[] args) {
		
		String s = "i,like,this,program,very,much";
		
		String s1 = s.replace(",", ".");
		
		System.out.println(s1);
		
		StringBuilder sb = new StringBuilder();
		
		String[] str = s.split(",");

		for (int i = str.length - 1 ; i >=0 ; i--) {
			
			if(i == 0) sb.append(str[i]);
			else sb.append(str[i]+".");
			
		}
		String n = sb.toString();
		System.out.println(n);
	}

}
