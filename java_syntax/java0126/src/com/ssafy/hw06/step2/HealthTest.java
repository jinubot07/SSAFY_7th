package com.ssafy.hw06.step2;

public class HealthTest {

	public static void main(String[] args) {
		HealthBmiReport bmi = HealthBmiReport.getInstance();
		bmi.read(); 	// input.txt파일 읽기 (+ 추가코드: 기본적인 학생 출력)
		bmi.print();  // 모든 학생 신체정보 출력
		bmi.printStudent();	// 검색기능
	}
}
