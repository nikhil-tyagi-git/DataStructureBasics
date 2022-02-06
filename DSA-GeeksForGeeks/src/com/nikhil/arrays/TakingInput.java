package com.nikhil.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakingInput {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 int n = Integer.parseInt(br.readLine().trim());
		 String[] str = br.readLine().split(" ");
		 int A[] = new int[str.length];
		 
		 for(int i=0; i < str.length; i++) {
			 A[i] = Integer.parseInt(str[i]);
			 System.out.println(A[i]);
		 }
	}

}
