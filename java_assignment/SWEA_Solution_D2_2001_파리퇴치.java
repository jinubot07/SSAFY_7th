import java.util.Scanner;

public class SWEA_Solution_D2_2001_파리퇴치 {
		
	static int T;		// 테스트케이스
	static int[][] map; // 파리가 있는 맵
	static int N;		// 맵의 크기
	static int M;		// 파리채의 크기

	static int[] dr = {-1, 1, 0, 0};	//UDLR : up,down,left,right
	static int[] dc = { 0, 0,-1, 1};	//up,down,left,right
	static int cs;
    
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in); //공백없이 입력 받는다.
		T=scann.nextInt();
		for (int t=1; t<=T; t++) {
			// 입력받은 문자열로 비어있는 맵 먼저 만들기
			N = scann.nextInt();
			M = scann.nextInt();
			//System.out.println(N+" "+M);
			map = new int[N][N];

			//행마다 값을 받아서 빈 맵에 넣어줌
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
                    cs = scann.nextInt();
                    //System.out.print(cs);
					map[i][j] = cs;
					}
				}
			//System.out.println("testcase:"+t);
			int result= go();
			System.out.println("#"+t+" "+result);
			}
		}

	// N x N 맵에서 M x M 범위의 원소 값 합중 최대값 구하기
	private static int go() {
		int max_sum=0;
		int sum=0;
		
		for(int i=0; i<N-M+1; i++) {			// 파리채가 행(옆)으로 움직이는 반복 단위
			for (int j=0; j<N-M+1; j++) {		// 파리채가 열(아래)로 움직이는 반복 단위
				for (int k=0; k<M; k++) {		// 파리채가 ㅇ
					for (int l=0; l<M; l++) {
						sum += map[i+k][j+l];
					}
				}	
                if(max_sum < sum) max_sum = sum;
                sum = 0;
			}
		}
		return max_sum;
	}
}