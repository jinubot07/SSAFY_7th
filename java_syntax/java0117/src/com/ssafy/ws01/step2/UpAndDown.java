package com.ssafy.ws01.step2;

import java.util.Scanner;

/*
 * 내용 : 업 앤 다운
 * @author 정진우
 * @since 2022.01.17
 * 
 * ctrl A - ctrl C : 이클립스 코드 복사해서
 * https://project.ssafy.com/ 이동
 * 실습 참여하기 - 실습하기 - </> - src - com - ssafy- ws01 - step2 - UpAndDown.java
 * ctrl V : 온라인 실습실에 코드붙여넣기
 * Commit - master branch
 * 실행하기 클릭
 */

public class UpAndDown {
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int com = (int)(Math.random()*100)+1;      //1~100
		int count = 0;
		while(true) {
			System.out.println("예측값을 입력하시오 :");
			int guess = scann.nextInt();
			count++;
			if(com == guess){
				System.out.printf("정답입니다. (현재까지 %d회 예측시도)\n",count);
				break;
			}else if(com > guess){
				System.out.printf("더 큰 수를 입력하세요.(현재까지 %d회 예측시도)\n",count);
			}else {
				System.out.printf("더 작은 수를 입력하세요.(현재까지 %d회 예측시도)\n",count);	
			}
		}
		
	}
}
