package com.nik.strings;

public class StringExpansion {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		String s = "1-5, 8, 11-14, 18, 20, 26-29";
		
		String[] str = s.split(", ");

		for (int i = 0; i < str.length ; i++) {
			System.out.println(str[i]);
			
			String[] a = str[i].split("-");
			
			if( a.length == 2) {
				
				int l = Integer.parseInt(a[0]);
				int h = Integer.parseInt(a[1]);
				
				while(l <= h) {
					sb.append(l+" ");
					l++;
				}
			}
			else sb.append(str[i]+" ");
		}
			System.out.print(sb);
	}
}
