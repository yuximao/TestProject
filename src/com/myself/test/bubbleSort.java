package com.myself.test;

import java.util.Collection;

public class bubbleSort {

	public static int[] SortArray(int[] A) {
		int n = A.length;
		for(int i = 0; i<n-1;i++) {
			for(int j=1; j<n-i;j++) {
				if(A[j-1]>A[j]) {
					int temp =A[j-1];
					A[j-1]=A[j];
					A[j]=temp;
				}
			}
		}
		return A;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {7,4,3,6,8};
		int[] res=SortArray(A);
		int leng=res.length;
		System.out.println(res[leng-2]);
	}

}
