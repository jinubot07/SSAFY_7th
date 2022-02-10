package com.ssafy.ws01;

import java.util.Scanner;

/*
 * 내용 : 팩토리얼 구하기
 * @author 정진우
 * @since 2022.01.17
 * 설정
 * argument로 돌리기 : perperties -> Java Compiler = 1.8 
 * scanner로 돌리기   : properties ->
 * Run -> run as -> java application
 * show view - console
 */


public class FactorialLoop01 {
	
	public static void main(String[] args) {
	
		//Scanner scann = new Scanner(System.in); //입력받기
		//int n = scann.nextInt();
		int n = 5;
		int s = 1;
		//초기 - (조건 - 반복 - 스텝 - 조건 - 반복 - 스텝) - 조건 - 끝 
		for (int i=1; i<=n; i++) {
			s=s*i;
		}
		System.out.printf("%d!=%d",n,s);
	}
}
