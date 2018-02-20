package com.khairul.umam.learnjava.function;

import java.util.Arrays;

public class Fibonnaci {
	
	public int[] getFibbonaci(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			if(i < 2) {
				arr[i] = 1;
			}else {
				arr[i] = arr[i-1]+arr[i-2];
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Fibonnaci fib = new Fibonnaci();
		int[] arr = fib.getFibbonaci(9);
		
		System.out.println(Arrays.toString(arr));
	}

}
