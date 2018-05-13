package com.khairul.umam.learnjava.day1;

public class Soal9 {
	
	private void getData(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if((i >= j && i+j <= n-1)
						|| (i <= j && i+j >= n-1)) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Soal9 jwb = new Soal9();
		jwb.getData(9);
	}
}
