package java0125;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test05 {
	static int N=19;
	static int [][] map;
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("Test5.txt"));
		map=new int[N+2][N+2]; // 주변을 0으로 채움
		for (int i = 1; i < N+1; i++) {
			for (int j = 1; j < N+1; j++) {
				map[i][j]=in.nextInt();
			}
		}
		//로직 
		for (int r = 1; r < N+1; r++) {
			for (int c = 1; c < N+1; c++) {
				// 바둑알이 있니 
				if(map[r][c]!=0) {
					//오른쪽으로 5개 (r,c-1)다른색  (r,c)~(r,c+4)같은색
					if((map[r][c-1]!=map[r][c]) && (right(map[r][c],r,c))) {
						System.out.println(map[r][c]);
						System.out.println(r+" "+c);
						return ;
					}
					//오른쪽 아래로 이동 5개 (r-1,c-1)다른색  (r,c)~(r+4,c+4)같은색
					if((map[r-1][c-1]!=map[r][c]) && (rightDown(map[r][c],r,c))) {
						System.out.println(map[r][c]);
						System.out.println(r+" "+c);
						return ;
					}
					
					//오른쪽 위로 이동 5개 (r+1,c-1)다른색  (r,c)~(r-4,c+4)같은색
					if((map[r+1][c-1]!=map[r][c]) && (rightUp(map[r][c],r,c))) {
						System.out.println(map[r][c]);
						System.out.println(r+" "+c);
						return ;
					}
					//아래 이동 5개 (r-1,c)다른색  (r,c)~(r+1,c)같은색
					if((map[r-1][c]!=map[r][c]) && (down(map[r][c],r,c))) {
						System.out.println(map[r][c]);
						System.out.println(r+" "+c);
						return ;
					}
				}
			}
		}
		System.out.println("0");		// 비겼을 때, 0 출력
	}
	private static boolean down(int v, int r, int c) {
		int cnt=1;
		for (; v ==map[r+1][c]; r++) {
			cnt++;
		}
		return cnt==5?true:false;
	}
	private static boolean rightUp(int v, int r, int c) {
		int cnt=1;
		for (; v ==map[r-1][c+1]; r--, c++) {
			cnt++;
		}
		return cnt==5?true:false;
	}
	private static boolean rightDown(int v, int r, int c) {
		int cnt=1;
		for (; v ==map[r+1][c+1]; r++, c++) {
			cnt++;
		}
		return cnt==5?true:false;
	}
	private static boolean right(int v, int r, int c) {
		int cnt=1;
		for (; v ==map[r][c+1]; c++) {
			cnt++;
		}
		return cnt==5?true:false;
	}
}