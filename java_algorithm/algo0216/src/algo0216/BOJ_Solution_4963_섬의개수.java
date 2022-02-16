// 8방향으로 계산 => dfs여러번

package algo0216;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_Solution_4963_섬의개수 {
	
	static int W, H;
	static int[][] map;
	static int[] dr = {-1,-1, 0, 1, 1, 1, 0,-1}; 	// 12시부터 시계방향 8방
	static int[] dc = { 0, 1, 1, 1, 0,-1,-1,-1};	// 12시부터 시계방향 8방

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
				
		W = Integer.parseInt(str[0]);
		H = Integer.parseInt(str[1]);
		
		map = new int[H][W];
		for (int i=0; i<H; i++) {
			str = br.readLine().split(" ");
			for (int j=0; j<W; j++) {
				map[i][j] = Integer.parseInt(str[i]);
			}
		}
		
		/*
		//Scanner로 입력받는 경우
		Scanner scann = new Scanner(System.in);
		//W = scann.nextInt();
		map = new int[H][W];
		for (int i=0; i<H; i++) {
			for (int j=0; j<W; j++) {
				map[i][j] = scann.nextInt();
			}
		}
		*/

		int cnt = 0;
		for (int i=0; i<H; i++) {
			for (int j=0; j<W; j++) {
				if(map[i][j] == 1) {
					cnt++;
					bfs(i,j,cnt+1);					// 좌표(i,j)에서 8방향으로 이동. cnt+1은 그룹이름
				}
			}
		}
		System.out.println();
	}

	// 연결된 땅(1로 연결된 배열의 값) -> 이동
	// 2group -> 3 group?
	private static void bfs(int start_r, int start_c, int group) {
		
	}

}
