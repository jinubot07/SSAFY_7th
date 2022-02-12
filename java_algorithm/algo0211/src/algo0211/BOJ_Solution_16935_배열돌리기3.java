package algo0211;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Solution_16935_배열돌리기3 {
	static int N, M;
	static int[][] map;
	static int[][] new_map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// N M R 입력받기
		String[] str = br.readLine().split(" ");	// str문자열에 공백기준으로 구분된 문자를 입력받는다.
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		int R = Integer.parseInt(str[2]);

		// 배열 입력받아 정적할당한 배열에 저장하기
		map = new int[N][M];

		for (int i=0; i<N; i++) {
			str = br.readLine().split(" ");
			for (int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(str[j]);
			}			
		}
		
		// 연산번호 입력받기
		str = br.readLine().split(" ");
		int O = Integer.parseInt(str[0]);

		// 연산수행
		switch(O) {
		case 1:
			new_map = new int[N][M];
			for(int cnt=0; cnt<R; cnt++) {
				operator1(0, N-1);				
			}
			break;
		case 2:
			new_map = new int[N][M];
			for(int cnt=0; cnt<R; cnt++) {
				operator2(0, M-1);				
			}
			break;
		case 3:
			new_map = new int[M][N];
			for(int cnt=0; cnt<R; cnt++) {
				operator3(0, N-1, 0, M-1);				
		}
			break;
		case 4:
			new_map = new int[M][N];
			for(int cnt=0; cnt<R; cnt++) {
				//operator4();				
			}
			break;
		case 5:
			new_map = new int[N][M];
			for(int cnt=0; cnt<R; cnt++) {
				//operator5();				
			}
			break;
		case 6:
			new_map = new int[N][M];
			for(int cnt=0; cnt<R; cnt++) {
				//operator6();				
			}
			break;
		}
		
		// 결과출력
		for (int i=0; i<N; i++) {
			for (int j=0; j<M; j++) {
				System.out.print(new_map[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	// 상하 반전
	private static void operator1(int rs, int re) {
		if(rs>re) {
			return ;
		}else {
			for (int j=0; j<M; j++) {
				new_map[rs][j] = map[re][j];
				new_map[re][j] = map[rs][j];
			}
			operator1(rs+1,re-1);
		}
	}

	// 좌우 반전
	private static void operator2(int cs, int ce) {
		if(cs>ce) {
			return ;
		}else {
			for (int i=0; i<N; i++) {
				new_map[i][cs] = map[i][ce];
				new_map[i][ce] = map[i][cs];
			}
			operator2(cs+1,ce-1);
		}
	}
	
	// 시계방향 90도 회전
	private static void operator3(int rs, int re, int cs, int ce) {
		new_map = new int[M][N];
		if(rs>re || cs>ce) {
			return ;
		}else {
			for (int i=0; i<N; i++) {
				for (int j=0; j<M; j++) {
					new_map[j][re-rs+1-i] = map[i][j];					
				}
			}
			new_map = new int[M][N];
			int temp = M;
			M = N;
			N = temp;
//			M = new_map.length;
//			N = new_map[0].length;
			operator3(rs+1,re-1,cs+1,ce-1);
		}
	}
}
