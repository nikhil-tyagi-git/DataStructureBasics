package com.nikhil.strings;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalin("aaaabbaa"));
	}
	
static String longestPalin(String S){
        
        int len=0;
        int ch=0;
        int s=0,e=0;
        for(int i =0 ; i < S.length(); i++){
            for(int j=i; j<S.length(); j++){
                
                if(isValidPalin(S,i,j)){
                    
                    if( j-i+1 > len){
                        len = Math.max(len,(j-i)+1);  
                        ch++;
                        s=i;e=j;
                    }
            
                }
            }
        }
        
        char[] c= new char[len];
        int k=0;
        for(int i=s; i <= e; i++){
            c[k]=S.charAt(i);
            k++;
        }
        
        return new String(c);
    }
    
    static boolean isValidPalin(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;end--;
        }
        return true;
    }

}
