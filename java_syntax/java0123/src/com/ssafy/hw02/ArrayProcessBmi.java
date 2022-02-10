// project.ssafy.com -> 2일차 과제1
// 1085. 데일리과제 2-2. 2차원배열 실습 Lv2
// 2022.01.23

package com.ssafy.hw02;

public class ArrayProcessBmi {

	public static void main(String[] args) {
		//선언
		double[][] arr;
		// 초기화
		arr = new double[][] {{21,53.2,1.673},{35,90.3,1.781},{28,70.7,1.653},{25,75.1,1.811},{31,62.0,1.532}};
		
		// 선언과 동시에 초기화
		//double[][] arr = {{21,53.2,1.673},{35,90.3,1.781},{28,70.7,1.653},{25,75.1,1.811},{31,62.0,1.532}};
			
		// 평균구하기
		double[] sum = new double[3];
		for (int i=0; i<arr.length; i++) {
			sum[0] += arr[i][0]; //	sum[0]에는 arr[0~5][0]의 합, 즉 학원생들의 나이의 합
			sum[1] += arr[i][1]; //	sum[1]에는 arr[0~5][1]의 합, 즉 학원생들의 몸무게의 합
			sum[2] += arr[i][2]; //	sum[2]에는 arr[0~5][2]의 합, 즉 학원생들의 키의 합
		}
		double[] avg = new double[3];;
		for(int i=0; i<sum.length; i++) {
			avg[i]=sum[i]/arr.length;
		}
				
		// 출력
		System.out.printf("idx \t 만 나이 \t 몸무게(kg) \t 키(m)\n");
		for (int i=0; i<arr.length; i++) {
			System.out.printf("학원생%d \t %.1f \t %.1f \t %.3f\n",i+1,arr[i][0],arr[i][1],arr[i][2]);			
		}
		System.out.printf("평균 \t %.3f \t %.3f \t %.3f\n",avg[0],avg[1],avg[2]);
	}
	
}
