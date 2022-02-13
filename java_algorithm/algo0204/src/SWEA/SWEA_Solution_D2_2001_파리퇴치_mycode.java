package SWEA;

import java.util.Scanner;

public class SWEA_Solution_D2_2001_파리퇴치_mycode {
	
	static int T;		// 테스트케이스
	static int[][] map; // 파리가 있는 맵
	static int N;		// 맵의 크기
	static int M;		// 파리채의 크기
	static String flystring;	// 파리 맵에 들어있는 파리의 수
	static String[] flychar;
	
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

			/*
			// 행마다 값을 받아서 빈 맵에 넣어줌
			// #1.nextInt()로 처음부터 정수값을 일일이 입력받음
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					map[i][j] = scann.nextInt();
				}
			}
			*/

			/*
			// #2.줄단위로 문자열을 입력받은후 정수값으로 초기화함(-'0')
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					// 빈 맵에 넣어줌
					char[] cs= scann.next().toCharArray();
					System.out.print(cs);
					map[i][j] = cs[i*N+j]-'0';				// <-- 이부분에서 indexRange 초과하는 에러가 뜸.
					}
					System.out.println();
			}
			*/
			
			// #3.줄단위
			for (int i=0; i<N; i++) {
				flystring = scann.nextLine();
				flychar = flystring.split(" ");
				for (int j=0; j<N; j++) {
					System.out.println(flychar[j]);
					//map[i][j] = scann.nextInt();
				}
			System.out.println(flystring);
			}
			
			
			//int result= go();
			//System.out.println("#"+T+" "+result);
			}
		}

	// N x N 맵에서 M x M 범위의 원소 값 합중 최대값 구하기
	private static int go() {
		int max_sum=0;
		int sum=0;
		
		for(int i=0; i<N-M+1; i++) {			// 파리채가 행(옆)으로 움직이는 반복 단위
			for (int j=0; j<N-M+1; j++) {		// 파리채가 열(아래)로 움직이는 반복 단위
				for (int k=0; k<M; k++) {		// 파리채 내 파리를 계산하기 위한 배열의 행을 지칭
					for (int l=0; l<M; l++) {	// 파리채 내 파리를 계산하기 위한 배열의 열을 지칭
						sum += map[i+k][j+l];
					}
				}
				if(max_sum < sum) max_sum = sum;
				sum = 0;
			}
		}
		

		return max_sum;
	}
}
