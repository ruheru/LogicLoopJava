package com.khairul.umam.learnjava.day1;

public class Soal6 {

	private void getData(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i >= j) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Soal6 jwb = new Soal6();
		jwb.getData(9);
	}

}
