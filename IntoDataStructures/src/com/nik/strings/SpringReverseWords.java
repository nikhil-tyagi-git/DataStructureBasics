package com.nik.strings;

import java.util.ArrayList;

public class SpringReverseWords {
	
	public static void main(String[] args) {
		
		String s = "i,like,this,program,very,much";
		
		System.out.println(s);
		
		/*
		 * StringBuilder sb = new StringBuilder();
		 * 
		 * String[] str = s.split(",");
		 * 
		 * for (int i = str.length - 1 ; i >=0 ; i--) {
		 * 
		 * if(i == 0) sb.append(str[i]); else sb.append(str[i]+".");
		 * 
		 * } String n = sb.toString(); System.out.println(n);
		 */
		ArrayList<String> res = new ArrayList<>();
		String t = "";
		for(int i=0; i < s.length() ; i++) {
			
			if(s.charAt(i) == ',') {
				res.add(t);
				t = new String();
				continue;
			}
			t = t+s.charAt(i);
		}
		res.add(t);
		
		String a ="";
		for(int i = res.size()-1; i >=0; i--){
			if(i ==  res.size()-1)
				a=res.get(i);
			else
				a = a + " "+ res.get(i);
		}
		System.out.println(a);
	}

}
