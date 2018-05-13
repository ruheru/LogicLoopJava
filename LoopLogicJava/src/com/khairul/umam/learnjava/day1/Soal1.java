package com.khairul.umam.learnjava.day1;

public class Soal1 {
	
	private void getData(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Soal1 jwb = new Soal1();
		jwb.getData(9);
	}

}
