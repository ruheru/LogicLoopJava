package com.khairul.umam.learnjava.day1;

public class Soal3 {

	private void getData(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i+j == n-1 || i == j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Soal3 jwb = new Soal3();
		jwb.getData(9);
	}
}
