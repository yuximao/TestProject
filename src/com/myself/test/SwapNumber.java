package com.myself.test;

public class SwapNumber {

	public static void switchNumber(int a, int b) {
		int c = 0;
		c=a;
		a=b;
		b=c;
		System.out.println(a+"  /  "+b);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1;
		int b=2;
		switchNumber(a,b);
	}

}
