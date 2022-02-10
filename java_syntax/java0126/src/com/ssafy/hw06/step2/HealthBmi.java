// bmi 값 계산해주는 메소드 bmiProcess
// 비만정도를 출력해주는 메소드 fatProcess

package com.ssafy.hw06.step2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HealthBmi {
	
	public double bmiProcess(double weight, double height) {
		return weight / Math.pow((height/100.0),2);		
	}
	
	public String fatProcess(double bmi) {
		String result="";
		if(bmi>30.0) {
			result = "고도비만";
		}else if(bmi<=30.0 && bmi>25.0) {
			result = "비만";
		}else if(bmi<=25.0 && bmi>23.0) {
			result = "과체중";
		}else if(bmi<=23.0 && bmi>18.5) {
			result = "정상";
		}else {
			result = "저체중";			
		}
		return result;
	}
}