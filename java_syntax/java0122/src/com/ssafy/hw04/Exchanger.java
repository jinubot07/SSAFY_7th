// project.ssafy.com -> 1일차 과제2
// 1090. 데일리과제 1-4. JAVA 기본문법
// 2022.01.22

package com.ssafy.hw04;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exchanger {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scann = new Scanner(new File ("input.txt"));
		String str;
		//str = scann.nextLine(); // "통화종류,금액" 읽어서 버리기
		
		while(scann.hasNextLine()) {	// 환율을 화폐정보가 있으면 while문 작동, 없으면 반복문 탈출
			// 1.한 줄 마다 전체 문자열을 읽어들이고,
			// 2.필요한 정보를 자료형에 맞게 변환하여 새로운 변수에 초기화
			// 3.통화종류에 따라 호출할 메소드 결정 : KRW면 toDollar()호출 ,USD면 toKRW()호출
			// 4.호출한 메서드에서 리턴 받은 값(=환전된 금액) 출력 (원/달러 구분, 천단위마다 콤마찍기)
			
			// 1. 전체 문자열 읽어들이기
			str = scann.nextLine();
			
			// 2. 새로운 변수에 자료형에 맞게 변환하여 초기화
			String[] data = str.split(",");
			//check    //System.out.printf("data[0]:%s, data[1]:%s\n",data[0],data[1]);
			           //System.out.printf("data[0]의 자료형:%s, data[1]의 자료형:%s\n",
		               //		           data[0].getClass().getName(),data[1].getClass().getName());	
			String country = data[0];
			Double money = Double.parseDouble(data[1]);
		    //check    //System.out.printf("country:%s, money:%s\n",data[0],data[1]);
		               //System.out.println("country의 자료형"+country.getClass().getName());
		    	       //System.out.println("money의 자료형"+money.getClass().getName());
			
			// 3. country가 KRW면 toDollar()호출 , country가 USD면 toKRW()호출
			if(country.equals("KRW")) {
				double dollar = toDollar(money);				
				// 4. 천 단위마다 콤마 찍기
				DecimalFormat df = new DecimalFormat("###,###,###,###,###,###.##");
				String dollar_str= df.format(dollar);
				System.out.printf("%.0f원  >>  %s달러\n\n",money,dollar_str);
				//System.out.println(money + "원  >>  " + dollar + "달러");
				//System.out.println();
			}else if(country.equals("USD")){
				double won = toKRW(money);
				// 4. 천 단위마다 콤마 찍기
				DecimalFormat df = new DecimalFormat("###,###,###,###,###,###.##");
				String won_str= df.format(won);
				System.out.printf("%.0f달러 >>  %s원\n\n",money,won_str);
			}else {		
				System.out.println("통화종류를 확인해 주십시오.(KRW, USD만 입력가능)");
			}
		}//while문 닫기
	}//main 닫기
	
	public static double toDollar(double money_krw) {
		return money_krw*0.000909;
	}
	
	public static double toKRW(double money_usd) {
		return money_usd*1100.00;
	}
}
