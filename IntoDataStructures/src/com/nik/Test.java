package com.nik;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2 = "Nikhil";
		String s3 = "Nikhil";
		String s = new String("Nikhil");
		char[] c =s.toCharArray();
		
//		for(int i=0 ; i < c.length;i++) {
//			System.out.print(c[i]);
//		}
//		System.out.println(s.charAt(5));
//		char[] c1 = reverse(c);
//		for(int i=0; i<c1.length;i++)
//		{
//			System.out.print(c1[i]);
//		}
		
		int a=10,b=20;
		abc(a,b);
	}
	
	static void abc(byte a,int b) {
		System.out.println(a+" "+b);
	}
	
	static void abc(int a,float b) {
		System.out.println(a+" "+b);
	}
	
	static char[] reverse(char[] s) {
		int left=0;
		int right=s.length-1;
		
		while(right>left)
		{
			char a=s[left];
			s[left]=s[right];
			s[right]=a;
			left++;
			right--;
			
		}
		
		return s;
	}

}
