package com.ssafy.ws01.step3;

import java.util.Scanner;

public class DigitTest2 {
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int n=scann.nextInt();
		int cnt=0;
		for (int i=0; i<n; i++) {	     //i: 줄
			for (int j=0; j<i; j++) {    //j: 공백갯수
				System.out.printf("\t");
			}
			for(int k=0; k<n-i; k++) {	//k:
				System.out.printf((++cnt)+"\t");
			}
			System.out.println();
		}
	}
}
