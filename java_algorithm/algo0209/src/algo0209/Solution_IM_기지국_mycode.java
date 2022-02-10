package algo0209;

import java.io.File;
import java.util.Scanner;

public class Solution_IM_기지국_mycode {
	
	static int T;
	static int N;
	static char[][] map;
	public static void main(String[] args) throws Exception {
		Scanner scann = new Scanner(new File("기지국_input.txt"));
		//Scanner scann = new Scanner(System.in); 	//(제출용)
		T = scann.nextInt();
		for(int t=1; t<=T; t++) {
			// int un_h = 0;		// 기지국에 의해 커버되지 않은 집들의 수
			N = scann.nextInt();	// N : 배열크기(map한 변의 길이)
			map = new char[N][N];
			
			for (int i=0; i<map.length; i++) {
				/*
				String str = scann.nextLine();
				for (int j=0; j<map.length; j++) {
					char[] ch = str.toCharArray();
					map[i][j] = ch[j];
					System.out.println(map[i][j]);  //map[i][j] = str.toCharArray();랑 같은거아니야?얜 왜안돼
				}
				 */
				// 문자열 통째로 넣어서 한방에 해결
				map[i] = scann.next().toCharArray();
			}
			
			uncover();
			int anwer = count();
			System.out.printf("#%d %d\n",t,anwer);	
		}	
	}
	
	// 기지국을 찾고 기지국 주변 H를 X로 변환. 단 기지국종류에따라 변환범위가 다름(switch)
	private static void uncover() {
		// 1.기지국찾기
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if (map[i][j] == 'X' || map[i][j] == 'H') continue;	// 아무것도 없거나 집이면 pass
				// 2. 기지국을 찾으면 종류 구분
				switch(map[i][j]) {
					case 'A':
						change(i,j,1);
						break;
						
					case 'B':
						change(i,j,2);
						break;

					case 'C':
						change(i,j,3);
						break;

					default :
						break;
				}
			}
		}
	}


	// 기지국 주변 H를 X로 변환하는 메소드 
	private static void change(int r,int c, int range) {
		
		for (int delta=-range; delta<=range; delta++) {			//range는 map[r][c]-'A'+2 : A면 1, B면 2, C면 3 -> switch구문 안써도됨
			if(map[r+delta][c]=='H') map[r+delta][c] = 'X';
			if(map[r][c+delta]=='H') map[r][c+delta] = 'X';
		}
		
		/*
	 	static int[] dr={-1,0,1,0};
	 	static int[] dc={0,1,0,-1};
		for (int delta=1; delta<=map[r][c]-'A'+2; delta++) {
			for (int d=0; d<4; d++){
				int nr = r+dr[d]*delta;
				int nc = r+dc[d]*delta;
				if(!check(nr,nc)) continue;	// 기지국이 커버하는 영역이 아니면 pass
				if(map[nr][nc]=='H'){
					map[nr][nc]='X';		// 기지국이 커버하는 영역에  H있으면 X로 변환
				}
			}
		}		
		 
		 check 함수는 return r>=0 && r<N && c>=0 && c<N;
		 */
		return;
	}

	// un_h의 수를 계산해주는 메소드
	private static int count() {
		int un_h=0;		// 기지국에 의해 커버되지 않은 집들의 수
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				if(map[i][j] == 'H') un_h++; 
			}
		}
		return un_h;
	}


}
