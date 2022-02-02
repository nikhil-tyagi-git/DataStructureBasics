package com.nik;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class parent{
	public void funA(String s) {
		
	}
}

public class FreeFlow {
	
	public void funA(String s) throws IOException {
		
	}

	public static void main(String[] args) {

		/*
		 * int arr[] = {1,4,3,4};
		 * 
		 * for(int i=0; i<arr.length; i++) System.out.println(arr[i]);
		 * 
		 * Map<Integer,String> map= new HashMap<>();
		 */
		
		Optional got = Optional.of("Game of thrones");
		String[] str = new String[10];
		
		Optional gotstr = Optional.ofNullable(str[9]);
		
		System.out.println(gotstr.isPresent());
		System.out.println(got.isPresent());
		
	}

}
