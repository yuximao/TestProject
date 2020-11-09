package com.myself.test;

public class palindromeCheck {

	public static Boolean palindromeCheck(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
 
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == sb.charAt(i)) {
				count++;
			}
		}
		if (count == str.length()) {
			return true;
		} else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if integer:
		int i=354453;
		String str= Integer.toString(i);
		System.out.print(palindromeCheck(str));
	}

}
