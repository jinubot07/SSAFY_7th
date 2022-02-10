package com.ssafy.ws01.step3;

public class SaveDeposit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sum=0.0;
		double money=1000000;
		double r=0.02/12;	//공리는 1년 기준이이므로
		
		int year=1;			//개월 단위이면 int month
		for (int i=0; i<year*12; i++) {
			money=money*(1+r);
			sum += money;
		}
		// \n 엔터 라인 내리기
		System.out.printf("%.0f씩 %d년을 적금하면 %.0f다.",	//.2 소수점3자리에서 반올림해서  .0은 소수점 첫자리에서 반올림하여 정수형태로
							money,year,sum);
		
		
	}

}
