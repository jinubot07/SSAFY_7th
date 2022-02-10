package java0125;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test05_2 {
	static int N=19;
	static int [][] map;
	
	// 4방 
	static int dr[] = { 0,-1, 1,-1,1,-1,1,0};
	static int dc[] = {-1,-1,-1, 0,0, 1,1,1};	//(dr,dc): {왼쪽,왼쪽위,왼쪽아래,위,아래,오른쪽위,오른쪽아래,오른쪽}
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
					
					for (int d=0; d<4; d++) { //4방향
						int nr=r+dr[d];
						int nc=r+dc[d];
						if((map[nr][nc]!=map[r][c]) && (steps(map[r][c],r,c,7-d))) {	//7-d방향: 주어진 방향의 반대 방향. 
							System.out.println(map[r][c]);
							System.out.println(r+" "+c);
							return;
						}
					}
				}
			}
		}
		System.out.println("0");		// 비겼을 때, 0 출력
	}
	private static boolean steps(int v, int r, int c,int d) {
		int cnt=1;
		for (; v ==map[r+dr[d]][c+dc[d]]; r+=dr[d], c+=dc[d]) {	//바둑돌이 없으면 for문 종료.
			cnt++;
		}
		return cnt==5?true:false;
	}
}