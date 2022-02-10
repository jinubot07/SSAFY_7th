// 1. 새로운 프로젝트를 생성한다.(Tip. 정해진 양식의 레포지토리명과 일치시킨다.) 
// 2. default패키지에 Solution_D#_####_@@@@@@ 클래스를 생성해 코드를 작성한다.
// 3. lab.ssafy.com에서 양식에 맞는 프로젝트명으로 새로운 repository를 만든다.
// 4. 이클립스의 해당 프로젝트 우클릭 -> Team -> Share Project -> Use or create repository in parents folder of project -> Create Repository -> Finish
// 5. 커밋하려는 클래스 +(추가)하고, Commit Message에 클래스명 적고, Commit and Push클릭
// 6. lab.ssafy.com의 커밋하려는 레포지토리-> Project Overview -> Details -> HTTP Clone하기
// 7. URI에 붙여넣기 -> Finish -> master branch에 commit -> Close
// 8. lab.ssafy.com의 해당 레포지토리 -> Members -> Invite member -> "honey"검색, Guest -> Invite

import java.util.Scanner;

public class SWEA_Solution_D2_1954_달팽이숫자 {

	static int[] dr = { 0, 1, 0,-1};
	static int[] dc = { 1, 0,-1, 0};
	
	public static void main(String[] args) {
		int T=0;
		int N=0;
		int[][] map;
		//System.out.print("입력:");
		Scanner scann = new Scanner(System.in);
		T=scann.nextInt();	// testcase
		
		for (int t=1; t<=T; t++) {
			N=scann.nextInt();	// 판의 크기
			map=new int[N][N];
			int r=0;
			int c=0;
			int d=0;//방향 바꿀때
			
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					map[r][c] = i*N+j+1;
					int nr=r+dr[d];
					int nc=c+dc[d];
					
					if(nr<0 || nr>=N || nc<0 || nc>=N || map[nr][nc]!=0) {
						d=(d+1)%4;
					}
					r+=dr[d];
					c+=dc[d];
				}
			}
			System.out.println("#"+t);
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					System.out.print(map[i][j]+" ");					
				}
				System.out.println();				
			}
		}	
	}
}