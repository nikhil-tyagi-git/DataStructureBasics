package com.nik.array;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String longestPalindrome(String s) {

		int l = 0, h = s.length(), len = 0;
		int high = s.length();
		String res = "";
		while (h > l) {

			if (len < h - l && palin(s, l, h - 1)) {
				len = Math.max(len, h - l);
				res = s.substring(l, h);
			}

			h--;

			if (l == h - 1) {
				h = high;
				l++;
			}
		}
		return res;
	}

	boolean palin(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
