package com.khairul.umam.learnjava;

public class SegitigaSiku {
	public void segitiga1(int n) {
		System.out.println("segitiga 1: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i >= j) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		SegitigaSiku ss = new SegitigaSiku();
		int n = 9;
		ss.segitiga1(n);
	}
}
