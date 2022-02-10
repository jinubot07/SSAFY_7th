package com.ssafy.ws02.step3;

import java.util.Scanner;

public class Solution_D2_1954_달팽이숫자 {

	static int T;
	static int N;
	static int[][] snail;
	
	static int[] dr= {0,1, 0,-1};
	static int[] dc= {1,0,-1, 0};
	public static void main(String[] args) {
		
		Scanner scann=new Scanner(System.in);
		T=scann.nextInt();	//테스트 케이스 개수
		for(int t=1; t<=T; t++) {
			N=scann.nextInt();
			snail=new int[N][N];
			int r=0;
			int c=0;
			int d=0; //방향 (0,0)에서 오른쪽으로 시작한다.
			

			//1차 -> 2차 배열: 아나칼 아모칼 m[i/col][i%col] = n[i]
			//2차 -> 1차 배열: 알칼제이       n[i*col + j]    = m[i][j]
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					snail[r][c] = i*N+j+1;
					
					int nr = r+dr[d];
					int nc = c+dc[d];
					//nr,nc 범위 밖이거나 + snail[nr][nc]에 값이 있을때 -> 방향을 바꾼다
					//r=r+dr[d];
					//c=c+dc[d];
					if(!(check(nr,nc) && snail[nr][nc]==0)) {
						d=(d+1)%4;
					}
					r+=dr[d];
					c+=dc[d];
					//else ->
				}
			}//for
			
			System.out.println("#"+t);
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					System.out.printf("%d ",snail[i][j]);
				}
				System.out.println();
			}
			
			
		}// for T
	}
	private static boolean check(int r, int c) {
		return r>=0 && r<N && c>=0 && c<N;
	}

}
