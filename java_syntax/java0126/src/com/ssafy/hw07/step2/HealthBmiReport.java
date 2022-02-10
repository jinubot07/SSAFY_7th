// 저장된 학생들의 신체정보 출력 및 검색기능

package com.ssafy.hw07.step2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HealthBmiReport {
	// 싱글톤 디자인 패턴
	private static HealthBmiReport bmi=new HealthBmiReport();
	private HealthBmiReport() {			//생성자
		hs = new HealthStudent[MAX_SIZE];
	}
	public static HealthBmiReport getInstance() {
		return bmi;
	}
	//---------
	private static final int MAX_SIZE =100;
	private int size;
	private HealthStudent [] hs;	// input.txt파일에서 읽어들인 정보 저장할 공간
	
	// input.txt파일 읽어오기 + 저장된 학생들의 신체정보 출력하는 메소드
	public void read() {
		try {
			BufferedReader br =new BufferedReader(new FileReader("input.txt"));
			size=0;	// 신체 정보를 입력한 학생 수(같은 학생이라도 측정일이 다르면 중복 입력가능)
					// 하나씩 입력 받으면서 숫자도 같이 늘어남.
			String line="";
			
			System.out.println("이름\t측정일\t\t몸무게\t키");
			while((line=br.readLine())!=null){	//EOF 파일 끝까지 
				StringTokenizer st=new StringTokenizer(line,",");
				String name = st.nextToken().trim(); //trim 양쪽 공백제거
				String measure = st.nextToken().trim();
				double weight = Double.parseDouble(st.nextToken().trim());
				double height = Double.parseDouble(st.nextToken().trim());
				
				// 하나씩 입력 받으면서 숫자도 같이 늘어남.
				hs[size++]=new HealthStudent(name, measure, weight, height);

				System.out.println(name+"\t"+measure+"\t"+weight+"\t"+height);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public HealthStudent[] getList() {
		return Arrays.copyOf(hs, size);
	}
	
	
	// 학생의 이름으로 해당 학생의 신체정보 검색하는 메소드
	public void printStudent() {
		Scanner scann=new Scanner(System.in);
		System.out.printf("학생의 이름을 입력하세요. >>");	//개행문자을 입력받게 되면 오류가 발생할 때도 있음.
		String name_to_search = scann.next();
		
		// 검색한 이름에 해당하는 학생의 신체정보를 저장할 공간 할당
		HealthStudent[] hst=new HealthStudent[size];
		// 검색한 이름에 해당하는 학생의 신체정보로 계산한 bmi과 비만정도 정보를 저장할 공간 할당
		HealthBmi bmi=new HealthBmi();
		
		// 배열 앞에서부터 차례대로 훑으면서 검색어와 같은 저장된 학생이름 검색하여 신체정보 저장 
		int index=0;
		for (int i=0; i <size; i++) {
			if(hs[i].getName().equals(name_to_search)) {
				hst[index++]=hs[i];
			}
		}
		
		if(index>0) {
			double tw=0.0;
			double th=0.0;
			for (int i = 0; i <index; i++) {
				tw+=hst[i].getWeight();
				th+=hst[i].getHeight();
			}
			System.out.printf("%s : ",name_to_search);
			System.out.printf("몸무게:%.3fkg",tw/index);
			System.out.printf(", 키:%.3fcm",th/index);
			// 검색한 학생의 신체정보(hst)를 tw,th저장해서 새롭게 계산한다.
			System.out.printf(", bmi:%.3f, %s",
					bmi.bmiProcess(tw/index,th/index),	// 인자 : 한 명의 학생(이름이 같은 저장된 모든 학생)의 몸무게의 평균 
					bmi.fatProcess(bmi.bmiProcess(tw/index,th/index)));
			System.out.println();
		}else {	// index가 0이면 전체 배열을 훑으면서 같은 이름이 검색된 경우가 없다는 뜻 = 없는 학생.
			System.out.println("없는 학생입니다.");
		}
	}
	
	// 저장된 모든 학생들의 신체 정보를 출력하는 메소드
	public void print() {
		System.out.println("*************학생출력**********");
		SystemPrint sy=new SystemPrint();
		for (HealthStudent h: getList()) {
			sy.print(h.toString());
		}
	}
}



//		String str;
//		System.out.println("이름\t측정일\t\t몸무게\t키");
//		Scanner scann2=new Scanner(new File("input.txt"));
//		while(scann2.hasNextLine()) {
//			// 1. 전체 문자열 읽어들이기
//			str = scann2.nextLine();
//						
//			// 2. 배열에 쪼개 넣기(\t하기위해서)
//			String[] data = str.split(",");
//
//			System.out.println(data[0]+"\t"+data[1]+"\t"+data[2]+"\t"+data[3]);
//		}
//		
//		
//		System.out.println("학생의 이름을 입력하세요. >>");
//		Scanner scann=new Scanner(System.in);
//		String newSname=scann.next();
			