package SWEA;

import java.util.Scanner;

public class Solution_Input_Test {
		static int T;		// 테스트케이스
		static int[][] map; // 파리가 있는 맵
		static int N;		// 맵의 크기
		static int M;		// 파리채의 크기
		
		static int[] dr = {-1, 1, 0, 0};	//UDLR : up,down,left,right
		static int[] dc = { 0, 0,-1, 1};	//up,down,left,right

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in); //공백없이 입력 받는다.
		T=scann.nextInt();
		for (int t=1; t<=T; t++) {
			// 입력받은 문자열로 비어있는 맵 먼저 만들기
			N = scann.nextInt();
			M = scann.nextInt();
			//System.out.println(N+" "+M);
			map = new int[N][N];

			//행마다 값을 받아서
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					// 빈 맵에 넣어줌
					map[i][j] = scann.nextInt();
					}
				}
			System.out.println();
			for(int i=0 ; i<N ; i++) {
				for(int j=0; j<N; j++) {
					System.out.print(map[i][j]+" ");
				}
				System.out.println();
			}
		}		
	}
}
