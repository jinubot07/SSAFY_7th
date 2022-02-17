package algo0217;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_Solution_3109_빵집_mycode {
	static int R, C;
	static char[][] map;
	static int ans = 0;	 			// 출력할 정답, 파이프를 설치할 수 있는 경우의 수
	static int[] dr = {-1,0,1};
	static int[] dc = { 1,1,1};
	
	public static void main(String[] args) throws IOException{
		Scanner scann = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str;
		
		R = Integer.parseInt(st.nextToken());		// R = scann.nextInt();
		C = Integer.parseInt(st.nextToken());		// C = scann.nextInt();
		
		map = new char[R][C];
		for (int i=0; i<R; i++) {
//			map[i] = scann.next().toCharArray();//교수님 코드
			
//			st = new StringTokenizer(br.readLine());
			str = br.readLine();
			for (int j=0; j<C; j++) {
//				System.out.println(st.nextToken().toCharArray());
				map[i][j] =str.charAt(j);
//				System.out.print(map[i][j]+" ");		// check input
			}
		}
		
		
		for(int i =0; i<R;i++) {
			if(dfs(i,0)) ans++;
		}
		System.out.println();
		dfs(0,0);					// 가스관 설치하기
		
		
		
		
	}

	// 현 위치에 도착 -> 값이 x면 해당 재귀 중단, .이면 설치함, 마지막열을 벗어나면 종료. 
	private static void dfs(int startR, int startC) {		// startR,starC : 현위치, 그 이후에 파이프를 설치하려고 함
		
		// 기저 조건
		if( startR > C) {
			ans++;
			return;
		}
		
		// 가지치기
		if(map[startR][startC].equals('x')) return;			// 현위치 값이 x 인 경우 중단
		if(map[startR][startC].equals('p')) return;			// 현위치 값이 p 인 경우 중단
		
		// 유도 파트 : map[startR][startC] 값이 '.' 인경우
		map[startR][startC] = 'p';							// 파이프 방문했다고 적음.
		if(startR-1>=0 && startC+1<R+1) {					// 오른쪽 위 대각선으로 갈 수 있을 때
			map[startR-1]
		}else if() {			// 오른쪽으로 갈 수 있을 때
			
		}else if() {			// 오른쪽 아래 대각선으로 갈 수 있을 때
			
		}
		
		
	}

}
