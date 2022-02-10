package com.ssafy.ws01.step3;

import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class GameTest {

	public static void main(String[] args) {
		//읽어들이기
		String[] rcp = {"가위","바위","보"}; // 정적배열 초기화
		Scanner scann=new Scanner(System.in);
		
		System.out.println("가위바위보 게임을 시작합니다.");
		System.out.println("");
		System.out.println("1. 5판3승");
		System.out.println("2. 3판2승");
		System.out.println("3. 2판1승");
		System.out.println("");
		System.out.println("번호를 입력하세요.");
		
		int choice=scann.nextInt(); // 입력 번호 -> 승 횟수(주요 숫자로 변형)
		int num=0;				// 우승하기 위한 필요한 승리 횟수
		int total_num=0;		// 총 라운드 수
		if(choice==1) {
			num=3;
			total_num=5;
		}else if(choice==2) {
			num=2;
			total_num=3;
		}else if(choice==3) {
			num=1;
			total_num=2;
		}else {
			System.out.println("잘 못 입력 하셨습니다.");
		}
		
		 int succ=0;
		 int fail=0;
		 int same=0;
		 
		 int round=0;	//한 라운드 한 경우
		 while(true) {		//끝나는 조건 명시
			//5번게임을 치뤘거나, 내가 세번 이기거나, 세번 지는경우만 아니면반 반복
			 if((succ+fail+same<total_num) && (succ<num) && (fail<num)) {
				String t=rcp[(int)(Math.random()*26)%3];	// t:컴퓨터가 낸 것. *26 한쪽으로 몰리는 상황방지
				System.out.println("가위바위보 중 하나 입력:");

				String s=scann.next();		// s:내가 낸 것. 공백하나를 읽은후 입력 받기

				//컴퓨터가 가위 낼 때, 내거 비교
				if(t.equals("가위")) {//참조타입은 equal equal아니고 equals이다
					if(s.equals("가위")) {
						System.out.println("무승부입니다!!!");
						same++;
					}else if(s.equals("바위")) {
						System.out.println("이겼습니다!!!");
						succ++;
					}else if(s.equals("보")) {
						System.out.println("졌습니다!!!");
						fail++;
					}
					else {
						System.out.println("잘 못 입력하셨습니다.");
					}
				}
				
				//컴퓨터가 바위 낼 때, 내거 비교
				else if(t.equals("바위")) {//참조타입은 equal equal아니고 equals이다
					if(s.equals("바위")) {
						System.out.println("무승부입니다!!!");
						same++;
					}else if(s.equals("보")) {
						System.out.println("이겼습니다!!!");
						succ++;
					}else if(s.equals("가위")) {
						System.out.println("졌습니다!!!");
						fail++;
					}
					else {
						System.out.println("잘 못 입력하셨습니다.");
					}
				}
				
				//컴퓨터가 보 낼 때, 내거 비교
				else if(t.equals("보")) {//참조타입은 equal equal아니고 equals이다
					if(s.equals("보")) {
						System.out.println("무승부입니다!!!");
						same++;
					}else if(s.equals("가위")) {
						System.out.println("이겼습니다!!!");
						succ++;
					}else if(s.equals("바위")) {
						System.out.println("졌습니다!!!");
						fail++;
					}
					else {
						System.out.println("잘 못 입력하셨습니다.");
					}
				}
					
			 }
			//내가 세번 이기거나 세번 지는경우에 게임이 끝남.
			 else {
				 break;
			 }
		 }	//while끝
		 
		 //최종 승패 결정
		 if(succ>fail) {
			 System.out.println("###당신 승리###");
		 }else if(succ<fail) {
			 System.out.println("###컴퓨터 승리###"); 
		 }else {
			 System.out.println("###무승부###");
		 }
	}

}
