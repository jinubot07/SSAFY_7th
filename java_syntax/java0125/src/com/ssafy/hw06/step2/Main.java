package com.ssafy.hw06.step2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public String name;
	public String date;
	public static double w;
	public static double h;
	public static double bmi;
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scann = new Scanner(new File("input.txt"));
		String str;

		while (scann.hasNextLine()) { //입력받을 데이터가 다음 줄에 없을 때까지 반복
            //주의! while()안에서 NextLine()하면 읽어야하는 데이터를 건너 뜀.
			//하지만, hasNextLine()은 커서가 다음 줄로 넘어가지 않음!

			str = scann.nextLine();
			//System.out.println(str);
			
			//콤마(,)로 구분된 숫자 입력받기
			//1.우선 문자열 형태로 저장
			String[] data= str.split(",");
			//2.문자열 -> 정수형 자료형변환
			String name = data[0];
			String date = data[1];
			w = Double.parseDouble(data[2]);
			h = Double.parseDouble(data[3]);
			
			HealthBmi hb = new HealthBmi();
			hb = this.bmiProcess(w,h);
		}
	}
	
	
	
}
