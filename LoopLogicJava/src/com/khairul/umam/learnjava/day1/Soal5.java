package com.khairul.umam.learnjava.day1;

public class Soal5 {

	private void getData(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i+j == n-1 || i == j || j == n/2 || i == n/2 
				|| i == 0 || i == n-1 
				|| j == 0 || j == n-1) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Soal5 jwb = new Soal5();
		jwb.getData(9);
	}
}
