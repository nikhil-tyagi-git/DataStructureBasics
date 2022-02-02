package com.nikhil.arrays;

public class LeaderInAnArray {

	public static void main(String[] args) {
		int[] a = { 100,2,3,1,100,24,6,7,20,9,1 };
		leader(a);
		System.out.println("----------------------------------");
		leaderEfficient(a);
		//leftRotate2(a,4);
		}
	
	static void leader(int a[]) {
		for(int i=0; i < a.length ; i++) {
			for(int j=i+1; j < a.length; j++) {
				if(a[i] <= a[j]) {
					//System.out.println(a[i]+" is not a leader");
					break;
				}
				else {
					if( j == a.length-1)
					System.out.println(a[i]+" is a leader");
				}
			}
		}
		System.out.println(a[a.length-1]+" is a leader");
	}
	
	static void leaderEfficient(int a[]) {
		int cur_leader = a[a.length-1];
		System.out.println(cur_leader+" is a leader");
		for(int i=a.length-2; i>=0; i--) {
			if(a[i] > cur_leader) {
				cur_leader = a[i];
				System.out.println(cur_leader+" is a leader");
			}
		}
	}

}
