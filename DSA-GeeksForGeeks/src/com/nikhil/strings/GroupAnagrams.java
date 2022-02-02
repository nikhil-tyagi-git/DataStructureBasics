package com.nikhil.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {

		
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
            List<String> temp = map.get(st);
            
            if(!temp.contains(strs[i]))
                temp.add(strs[i]);
            
            // System.out.println(map.get(st)+" ,");
            
        }
        List<List<String>> res = new ArrayList<>();
        
        for(Map.Entry<String, ArrayList<String>> e : map.entrySet()){
            System.out.println(e.getValue());
            if(e.getValue() != null){
                res.add(e.getValue());
            }
        }
        return res;

    }
    

}
