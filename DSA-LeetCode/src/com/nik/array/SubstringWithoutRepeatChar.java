package com.nik.array;

import java.util.*;

public class SubstringWithoutRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int lengthOfLongestSubstring(String s) {
        int j=0, max=0;
        HashSet<Character> hs  = new HashSet<>();
        int i=0;
        while( i < s.length() && j < s.length()){
            
            // System.out.println(s.charAt(i));
            if(hs.contains(s.charAt(i))){
                // System.out.println("Inside "+s.charAt(i));
                max = Math.max(max,hs.size());
                hs.clear();
                j++;
                i=j;
                continue;
            }
                
            hs.add(s.charAt(i));
            i++;
        }
        max = Math.max(max,hs.size());
        return max;
    }
}
