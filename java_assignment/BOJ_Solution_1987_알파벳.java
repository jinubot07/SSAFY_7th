package hwalgo13_서울_15반_정진우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_Solution_1987_알파벳 {

	static int R,C;
	static char[][] map;	
	static int[][] imap;
	static boolean[] alphabet = new boolean[26]; // 각 알파벳(인덱스0:알파벳A, 인덱스1:알파벳B)의 등장 여부. ex)alphabet[2]=1 : C가 등장했다.
	static int ans=0; 			// 말이 지날 수 있는 최대의 칸 수
	static int[] dr = {-1, 0, 1, 0};
	static int[] dc = { 0, 1, 0,-1};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 입력받기
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());		
		map = new char[R][C];
		
		// StringTokenizer로 String 데이터를 받고 toCharArry()로 '한번에' 문자형배열로 바꾸기
//		for (int i=0; i<R; i++) {
//			map[i] = br.readLine().toCharArray();
//		}
		
		// StringTokenizer로 String 데이터를 받아 String변수에 저장하고, String변수에서 '일일이' 문자 추출
//		for (int i=0; i<R; i++) {
//			String str = br.readLine();
//			for (int j=0; j<C; j++) {
//				map[i][j] =  str.charAt(j);		// st.nextToken().charAt(j)하면 문자 추출할때마다 계속 새로운 토큰이 업뎃됌
//				System.out.print(map[i][j]);
//			}
//		}
		
		// int형 2차원 배열 imap에다가 값 저장
		imap = new int[R][C];
		for (int i = 0; i < R; i++) {
			String str = br.readLine();
			for (int j = 0; j < C; j++) {
				imap[i][j] = str.charAt(j) - 'A';	// char형 - char형 숫자로 리턴
			}
		}
		
		//	로직
		route(0,0,0);						// 좌표 (0,0)부터 시작하고, 현재까지 말이 밟은 알파벳 수 = 0;

		// 정답 출력 : 정답: 말이 지날 수 있는 최대의 칸 수 = 갱신된 ans 값 = alphabet배열의 1의 갯수
		System.out.print(ans);
	}
	
	
	
	private static void route(int r, int c,int cnt) {
		
		// 기저조건 
		// 동시에, 백트래킹 유망성 검사
		if(alphabet[imap[r][c]]) {			// 현 위치의 알파벳이 이전에 등장했던 알파벳이면
			ans = Math.max(ans, cnt);		// 현재까지 말이 지나온 칸의 수의 최댓값으로 갱신후에
			return;							// 탈출한다.
		}
				
		
		// 유도 조건							// 새로운 알파벳 등장했으면
		alphabet[imap[r][c]] = true;		// 그 알파벳에 해당하는 인덱스로 접근해 배열 값 1로 초기화
		for (int d=0; d<4; d++) {
			int nr = r+dr[d];
			int nc = c+dc[d];
			if(!check(nr,nc)) continue;
			
			route(nr,nc,cnt+1);	
		}
		
		alphabet[imap[r][c]] = false;		// 경로를 검색할 때 마다, 등장 여부를 업데이트 해야
		
	}
	private static boolean check(int nr, int nc) {
		return nr>=0 && nr<R && nc>=0 && nc<C ;
	}

}
