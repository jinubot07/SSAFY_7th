package com.ssafy.edu.first;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InputTest {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		String s=scann.next();
		int t=scann.nextInt();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String h="sdfsd sdfsa sdfasdfsdf";
		StringTokenizer st=new StringTokenizer(h);
		
		while(st.hasMoreTokens()) {
			String sss=st.nextToken();
		}
		
	}
}