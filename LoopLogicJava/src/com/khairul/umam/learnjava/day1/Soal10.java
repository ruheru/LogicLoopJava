package com.khairul.umam.learnjava.day1;

public class Soal10 {

	private void getData(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if((i >= j && i+j <= n-1 && i <= n/2)
						|| (i <= j && i+j >= n-1 && i >= n/2)) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Soal10 jwb = new Soal10();
		jwb.getData(9);
	}
}
