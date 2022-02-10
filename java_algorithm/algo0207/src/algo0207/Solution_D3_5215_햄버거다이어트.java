package algo0207;

import java.util.Scanner;

public class Solution_D3_5215_햄버거다이어트 {
	static int N, R;	// 보통 입력받는 변수는 대문자
	static int[] input, numbers;
	static boolean[] isSelected;
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();
		R = scann.nextInt();
		
		input = new int[N];
		numbers = new int[R];
		isSelected = new boolean[N];	// 1,2,3, ... ,N 순서가 아니라,
										// 자리수에 맞춰서 true, false입력
		
		for (int i=0; i<N; i++) {
			input[i]=scann.nextInt();
		}
	}
}