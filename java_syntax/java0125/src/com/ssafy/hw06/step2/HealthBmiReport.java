// 학생들의 신체정보 출력, 및 검색기능

package com.ssafy.hw06.step2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HealthBmiReport {

	public static void main(String[] args) throws Exception {
		// 자동으로 한줄씩 읽겠다. 
		BufferedReader br=new BufferedReader(new FileReader("input.txt"));
		String line="";
		//최대 100명 이하를 읽는다고 가정
		HealthStudent [] st=new HealthStudent [100];
		int cnt=0;
		while((line=br.readLine())!=null) {
			StringTokenizer stz=new StringTokenizer(line,",");
			String name=stz.nextToken().trim();
			String measure=stz.nextToken().trim();
			double weight=Double.parseDouble(stz.nextToken().trim());
			double height=Double.parseDouble(stz.nextToken().trim());
			st[cnt++]=new HealthStudent(name, measure, weight, height);
		}
		
		
		String str;
		System.out.println("이름\t측정일\t\t몸무게\t키");
		Scanner scann2=new Scanner(new File("input.txt"));
		while(scann2.hasNextLine()) {
			// 1. 전체 문자열 읽어들이기
			str = scann2.nextLine();
						
			// 2. 배열에 쪼개 넣기(\t하기위해서)
			String[] data = str.split(",");

			System.out.println(data[0]+"\t"+data[1]+"\t"+data[2]+"\t"+data[3]);
		}
		
		
		System.out.println("학생의 이름을 입력하세요. >>");
		Scanner scann=new Scanner(System.in);
		String newSname=scann.next();
		
		int num=0; // 호출수
		double tw=0.0;
		double th=0.0;
		for (int i = 0; i < cnt; i++) {
			if(newSname.equals(st[i].getName())) {
				num++;
				tw+=st[i].getWeight();
				th+=st[i].getHeight();
			}
		}
		

		
		if(num>0) {
			System.out.printf("평균 몸무게 : %.3fkg, 평균 키 : %.3fcm\n"
					,tw/num,th/num);
		}else {
			System.out.println(newSname+"은 없습니다.");
		}
		
		
	}
}