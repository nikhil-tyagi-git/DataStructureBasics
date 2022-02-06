package com.nik.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public List<List<String>> groupAnagrams(String[] strs) {
	      
	        Map<String, ArrayList<String>> map = new HashMap<>();
	        
	        for(int i =0 ; i < strs.length; i++){
	            
	            char[] a = new char[256];
	            
	            for(int j=0; j < strs[i].length(); j++){
	                a[strs[i].charAt(j)]++;
	            }
	            
	            String st = String.valueOf(a);
	            
	            map.putIfAbsent(st, new ArrayList<String>());
	            
	            map.get(st).add(strs[i]);
	        
	            // System.out.println(map.get(st)+" ,");
	            
	        }
	        
	        return new ArrayList<>(map.values());

	    }

}
