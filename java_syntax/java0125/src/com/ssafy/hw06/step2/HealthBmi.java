package com.ssafy.hw06.step2;

public class HealthBmi {
	
	public static double bmiProcess(double w, double h){
		double h2 = (h/(double)100)*(h/(double)100);
		double bmi = w / h2;
		return bmi;
	}


	public static String fatProcess(double bmi) {
		String fatstatus;
		if(30<bmi) {
			fatstatus = "고도비만";
			System.out.printf("BMI 지수는 %.15f로 <%s>입니다.\n",bmi,fatstatus);
			return fatstatus;
		}else if(25<bmi && bmi<=30) {
			fatstatus = "비만";
			System.out.printf("BMI 지수는 %.15f로 <%s>입니다.\n",bmi,fatstatus);
			return fatstatus;
		}else if(23<bmi && bmi<=25) {
			fatstatus = "과체중";
			System.out.printf("BMI 지수는 %.15f로 <%s>입니다.\n",bmi,fatstatus);
			return fatstatus;
		}else if(18.5<bmi && bmi<=23) {
			fatstatus = "정상";
			System.out.printf("BMI 지수는 %.15f로 <%s>입니다.\n",bmi,fatstatus);
			return fatstatus;
		}else {
			fatstatus = "저체중";
			System.out.printf("BMI 지수는 %.15f로 <%s>입니다.\n",bmi,fatstatus);
			return fatstatus;
		}
	}
}
