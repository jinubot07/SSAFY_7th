package com.ssafy.ws02.step3;

import java.util.Arrays;
import java.util.Scanner;

public class SolutionBuilding {
	static int T;
	static int N;
	static char[][] map;
	
	public static void main(String[] args) {
		
		Scanner scann=new Scanner(System.in);
		T=scann.nextInt();
		for(int t=1; t<T; t++) {
			N=scann.nextInt();
			map=new char[N+2][N+2];
			
			//'B'로 모두 초기화
			for(int i=0; i<N+2; i++) {
				Arrays.fill(map[i],'B');
				//공백이 있으면 next로 불러서 text로 바꿈
			}
			
			//모서리를 뺀 중앙
			for(int i=1; i<N+1; i++) {
				for(int j=1; j<N+1; j++) {
					// 읽기
					//char c=scann.next().charAt(0); //next()하나만 하면 공백하나 띄고 charAt()하면 String 한 글자를 받는다.
					map[i][j] = scann.next().charAt(0);
					
				}
			}
			
			/*
			//-----------테스트
			for(int i=1; i<N+1; i++) {
				for(int j=1; j<N+1; j++) {
					System.out.println();
				}
			}
			*/
			
			//-----------로직 
			int max=-1;
			for(int i=1; i<N+1; i++) {
				for(int j=1; j<N+1; j++) {
					max=Math.max(max, go(i,j)); //go(r,c) go더블클릭해서 새로운 메소드 생성
					
				}
			}
			System.out.println("#"+t+" "+max);
		}//for T
	}

	// r,c중심으로 8방을 조사해서,
	// 8방이 모두 B이면 가로 세로의 B의 개수를 구한다.
	private static int go(int r, int c) {
		int cnt=0;
		
		//8방의 B의 개수가 8개 인가?
		if(count(r,c)==8) {	//double click -> create new method
			//cnt = 가로+세로-1
			cnt=width(r,c)+height(r,c)-1;
		}else {
			cnt=2;
		}
		return cnt;
	}
	

	private static int width(int r, int c) {
		int cnt=0;
		for (int i=1; i < N+1; i++) {
			if(map[r][i]=='B') {
				cnt++;
			}
		}
		return cnt;
	}
	
	private static int height(int r, int c) {
		int cnt=0;
		for (int i=1; i < N+1; i++) {
			if(map[i][c]=='B') {
				cnt++;
			}
		}
		return cnt;
	}

	// 8방 주변에 있는 B의 개수 구하기
	private static int count(int r, int c) {
		int count=0;
		for(int d=0; d<8;d++) {
			int nr=r+dr[d];
			int nc=c+dc[d];		
			//범위 안인가? 범위 밖이면 continue;
			//빼도 되고 넣어도 됨 (습관적 코드)
			//if(!check(r,c)) continue;
			
			// 범위 밖
			// B인가?
			if(map[nr][nc]=='B') {
				count++;
			}
		}
		return count;
	}
	
	
	// 범위 안
	private static boolean check(int r, int c) {
		return r>=1 && r<N+1 && c>=1 && c<N+1;
	}

	static int[] dr= {-1,-1,0,1,1, 1, 0,-1};
	static int[] dc= { 0, 1,1,1,0,-1,-1,-1};
	
}