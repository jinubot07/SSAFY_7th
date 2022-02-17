package youtube0217;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpaceDivideTest {
	
	static int white,green;
	static int[][] spaces;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		spaces = new int[N][N];
		
		// 입력받기
		for (int i=0; i<N; i++) {
			String[] str = br.readLine().split(" ");
			for (int j=0; j<N; j++) {
				spaces[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		// 로직
		cut(0,0,N);
		System.out.println("white:"+white+"\ngreen:"+green);
		
	}
	
	public static void cut(int r, int c, int size) {		// r,c : 분할후 시작 좌표 size : 분할 후 한변의 길이
	
		int sum = 0;					// 해당 영역의 색상 확인을 위한 변수(1로 채워져있으면->green, 0->white)
	
		for (int i=r, rEnd=r+size; i<rEnd; i++) {			// 분할 후 영역이 1로만 꽉차있는지 확인하는 for문
			for (int j=c, cEnd=c+size; j<cEnd; j++) {
				sum += spaces[i][j];
			}
		}
		
		
		if(sum == size*size) {			// 기저 조건 (색상이 같은경우
			green++;					//		  -> 사이즈가 1인경우가 기저조건이 아님. 사이즈가 1이 아니여도 끝일수도 있음)
			return;						// 리턴을 넣어주지 않아도 유도될 명령이 없어서 자동으로 종료
		}else if(sum == 0) {			// 기저 조건 (색상이 같은 경우)
			white++;
		}else {							// 유도 조건
			int half = size/2;
			cut(r,c,half);				// 분할 후 제 2사분면 영역
			cut(r,c+half,half);			// 분할 후 제 1사분면 영역
			cut(r+half,c,half);			// 분할 후 제 3사분면 영역
			cut(r+half,c+half,half);	// 분할 후 제 4사분면 영역
		}
		
		
		
		
		
	}

}
