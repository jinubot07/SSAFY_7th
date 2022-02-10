// project.ssafy.com -> 1일차 과제1
// 1084. 데일리과제 1-2. JAVA 기본문법
// 2022.01.22

package com.ssafy.hw02;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BmiCalculator {
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner scann = new Scanner(new File("input.txt"));
		String str = scann.nextLine();          // "나이,몸무게,키" 에 해당하는 문자열 버리기


		while (scann.hasNextLine()) { //입력받을 데이터가 다음 줄에 없을 때까지 반복
			                    //주의! while()안에서 NextLine()하면 읽어야하는 데이터를 건너 뜀.
								//하지만, hasNextLine()은 커서가 다음 줄로 넘어가지 않음!
			
			str = scann.nextLine();
			//System.out.println(str);

			
			//콤마(,)로 구분된 숫자 입력받기
		    //1.우선 문자열 형태로 저장
			String[] agewh= str.split(",");
			//2.문자열 -> 정수형 자료형변환
			int age = Integer.parseInt(agewh[0]);
			int w = Integer.parseInt(agewh[1]);
			int h = Integer.parseInt(agewh[2]);

			
			if(age>=2) {
				double h2 = (h/(double)100)*(h/(double)100);
				double bmi=w / h2;
		
				if(30<bmi) {
					System.out.printf("BMI 지수는 %.15f로 <고도비만>입니다.",bmi);
					System.out.println();
				}else if(25<bmi && bmi<=30) {
					System.out.printf("BMI 지수는 %.15f로 <비만>입니다.",bmi);
					System.out.println();
				}else if(23<bmi && bmi<=25) {
					System.out.printf("BMI 지수는 %.15f로 <과체중>입니다.",bmi);
					System.out.println();
				}else if(18.5<bmi && bmi<=23) {
					System.out.printf("BMI 지수는 %.15f로 <정상>입니다.",bmi);
					System.out.println();
				}else {
					System.out.printf("BMI 지수는 %.15f로 <저체중>입니다.",bmi);
					System.out.println();
				}
			}else {
				System.out.println("BMI 지수를 계산할 수 없는 나이입니다.");
			}
		}
	}
}