package algo0211;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Solution_16926_배열돌리기1_delta {
	static int[][] map;	
	static int[][] new_map;	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int N = br.read()-'0';
		int M = br.read()-'0';
		int R = br.read()-'0';
		System.out.printf("\nN:%d, M:%d, R:%d\n",N,M,R);
		 */
		String[] str = br.readLine().split(" ");	// str문자열에 공백기준으로 구분된 문자를 입력받는다.
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		int R = Integer.parseInt(str[2]);
//		System.out.printf("\nN:%d, M:%d, R:%d\n",N,M,R);	// check input

		map = new int[N][M];
		new_map = new int[N][M];

		for (int i=0; i<N; i++) {
			str = br.readLine().split(" ");	// str문자열에 공백기준으로 구분된 문자를 입력받는다.
			for (int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(str[j]);
//				System.out.print(map[i][j]);	// check input
			}
		}
		
		// 로직
		int K = Math.min(N, M)/2; 			// 겹
		for (int rot=0; rot<R; rot++) {		// 회전
			for (int cnt=0; cnt<K; cnt++) {	// cnt겹
				int r=cnt;
				int c=cnt;
				int d=0;
				int temp = map[r][c];
				while(d<4) {
					int nr=r+dr[d];
					int nc=c+dc[d];
					if(nr>=cnt && nr<N-cnt && nc>=cnt && nc<M-cnt) {
						map[r][c] = map[r][c];
						r = nr;
						c = nc;
					}
				}
				
			}
			
		}
		
		
		
		
		
		
		for(int cnt=0; cnt<R; cnt++) {
			rotate(0,N-1,0,M-1);
			// map = new_map;   얕은복사-> 가리키는 주소가 달라질 뿐 값이 복사 되지 않음.
			// 깊은 복사
			for (int i=0; i<N; i++) {
				for (int j=0; j<M; j++) {
					map[i][j] = new_map[i][j];
				}
			}		
		}
			
		// 정답 출력
		for (int i=0; i<N; i++) {
			for (int j=0; j<M; j++) {
				System.out.print(new_map[i][j]+" ");
				//System.out.printf("%2d ",new_map[i][j]);
			}
			System.out.println();
		}
		
	}
	
	private static void rotate(int rs, int re, int cs, int ce) {  // rs:rowstart 첫번째 행의 인덱스 ce:colmnend 마지막열의 인덱스 
		// basic condition
		if(re<=rs || ce<=cs) {	
			return;
		}else {
			// 왼쪽 열 아래로 밀기
			for (int i=0; i<re-rs; i++) {					
				new_map[rs+i+1][cs] = map[rs+i][cs];
			}
			// 아래쪽 행 오른쪽으로 밀기
			for (int j=0; j<ce-cs; j++) {
				new_map[re][cs+j+1] = map[re][cs+j];
			}
			// 오른쪽 열 위로 밀기
			for (int i=re-rs; i>0; i--) {					
				new_map[rs+i-1][ce] = map[rs+i][ce];
			}
			// 위쪽 행 왼쪽으로 밀기
			for (int j=ce-cs; j>0; j--) {					
				new_map[rs][cs+j-1] = map[rs][cs+j];
			}
		}
		rotate(rs+1,re-1,cs+1,ce-1);
			
	}

}
