package com.nikhil.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissingAndDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3,4,5,6,7,8,9,10,10,11,12,13,14,15,16,17,18,19,20,21,22};//,24
//				,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47};
		int b[]= {2,2};
		int[] q = check(b);
		
		for(int i: q) {
			System.out.println(i+" ");
		}
	}
	
	static int[] check(int[] arr) {
		
		int n=arr.length;
		Map<Integer,Integer> m = new HashMap<>();
        int[] ans=new int[2];
        int fill=1;
        
        while(fill <=n){
            m.put(fill,0);
            fill++;
        }
        
        for(int i=0; i < n; i++){
            m.put(arr[i], m.getOrDefault(arr[i],0)+1);
        }
        
        for(Map.Entry<Integer,Integer> k: m.entrySet()){
            //System.out.println(k.getKey()+" "+k.getValue());
            if(k.getValue() > 1){
                ans[0]=k.getKey();
            }
            if(k.getValue() == 0){
                ans[1]=k.getKey();
            }
        }
        
        
        return ans;
	}

}
