package com.nikhil.dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestIncreasingSubsequence {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		PrintWriter wr = new PrintWriter(System.out);
		int K = Integer.parseInt(br.readLine().trim());
		int N = Integer.parseInt(br.readLine().trim());
		String[] arr_A = br.readLine().split(" ");
		int[] A = new int[N];
		for (int i_A = 0; i_A < arr_A.length; i_A++) {
			A[i_A] = Integer.parseInt(arr_A[i_A]);
		}

		int out_ = kjump(A, K);
		System.out.println("\n"+out_);

//		wr.close();
		br.close();
	}

	static int kjump(int[] A, int K) {
		// Returns the length of longest subsequence
		int j = 0, prev = A[0];
		int lis[] = new int[A.length];
		lis[0] = 0;
		for (int i = 1; i < A.length; i++) {
			lis[i] = 0;
			for (int k = 0; k < i; k++) {
				if (A[k] < A[i]) {
					lis[i] = Math.max(lis[i], lis[k] + 1);
				}
			}
		}
		j = lis[0];
		for (int i = 0; i < lis.length; i++) {
			System.out.print(lis[i] + " ");
			j = Math.max(j, lis[i]);

		}
		return j;
	}
}
