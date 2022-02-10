// project.ssafy.com -> 3일차 과제1
// 1087. 데일리과제 3-2. Class,Object,Method Lv2
// 2022.01.19

package com.ssafy.hw02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecursionProcess {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scann = new Scanner(new File ("input.txt"));
		int T;
		
		while(scann.hasNextInt()) {
			T = scann.nextInt();
			int r=sum(T);
			System.out.printf("1부터 %d까지 합 : %d\n",T,r);
			
		}
	}
	
	static int sum(int n) {
		if(n==1) {
			return 1;
		}else
			return n+sum(n-1);
	}
}
