package com.nik;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {

		List<Integer> al = Arrays.asList(2,4,7,2,4,7,34);
		
		for(int i : al)
			System.out.print(i+" ");
		
		Collections.sort(al, (i,j) -> j.compareTo(i));
		
		System.out.println();
		for(int i : al)
			System.out.print(i+" ");
		
		List<Integer> l = al.stream().filter(i -> i>20).collect(Collectors.toList());
		
		System.out.println();
		for(int i : l)
			System.out.print(i+" ");
		
	}

}
