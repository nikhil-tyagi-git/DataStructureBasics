package com.nik.strings;

public class StringGFG {

	public static void main(String[] args) {

		StringGFG cs = new StringGFG();

		/*
		 * char[] chr = { 'n', 'i', 'k' }; String s = new String(chr);
		 * System.out.println(s);
		 * 
		 * String n = "NIKHIL"; String n2 = "TYAGI"; System.out.println(n.substring(3,
		 * 4)); System.out.println(n.concat(n2));
		 */

		String swap = "i like you";

		char[] cSwap = swap.toCharArray();
		cs.printString(cSwap);
		cs.printString(cs.swap(cSwap));
	}

	void printString(char[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
	char[] swap(char[] c) {
		
		int k = 0;
		for(int i=0; i< c.length; i++) {
			k=i;
			
			while(i< c.length && c[i] != ' ') {
				i++;
			}
			char temp = c[i-1];
			c[i-1] = c[k];
			c[k]=temp;
		}
		
		return c;
	}

}
