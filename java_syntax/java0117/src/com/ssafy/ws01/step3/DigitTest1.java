// project.ssafy.com
// 1077. 데일리실습 1-3. JAVA 기본 문법 응용 Lv3
// 2022.01.17

package com.ssafy.ws01.step3;

import java.util.Scanner;

public class DigitTest1 {
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		//int n=scann.nextInt();
		int n =5;
		int cnt=0;
		for (int i=0; i<n; i++) {	     //i: 줄
			for (int j=0; j<i; j++) {    //j: 공백갯수
				System.out.printf("\t");
			}
			for(int k=0; k<n-i; k++) {	 //k: 하나씩 커지는 입력되는 숫자들
				System.out.printf((++cnt)+"\t");//cnt가 0인데 출력은 1부터 찍혀야 하므로
			}
			System.out.println();
		}
	}
}
