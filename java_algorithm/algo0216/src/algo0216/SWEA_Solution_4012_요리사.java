package algo0216;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SWEA_Solution_4012_요리사 {
	static int N;			// 식재료 수 (짝수)
	static int[][] synergy;
	
	static int[] aIng;		// A음식의 식재료 종류(조합)
	static int[] aPor;		// A음식의 식재료 배합(순열)
	static int[] bIng;
	static int[] bPor;
	static int min;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int t=1; t<=T; t++) {
			N = Integer.parseInt(br.readLine());
			synergy = new int[N][N];
			
			for(int i=0; i<N; i++) {
				String[] str = br.readLine().split(" ");
				for (int j=0; j<N; j++) {
					synergy[i][j] = Integer.parseInt(str[j]);
				}
			}// synergy에 입력넣기 끝
			
			// 식재료 고르기 (조합) (새로운 식재료때 , 즉 testcase떄마다 업뎃)
			// 그 for문안에 배합 (순열) (새로운 식재료 조합떄마다 업뎃)
			// 그때, |음식A의 시너지 합 - 음식B의 시너지 합|의 min값 저장 (새로운 tasetcase마다 업뎃)
			
			
			aIng = new int[N/2];		// N이 6일때,
			
			combi(0,0);		// 1. A,B 각음식의 식재료 고르기 -> aIng = {0,2,3}, bIng = {1,4,5}
							// 2. aIng[
			
	
			
			
			
		}
	}
	
	// 주어진 식재료 배합
	private static void cook(int i, int j) {
		// TODO Auto-generated method stub
		
	}
	public static void combi(int cnt, int start) {
		if(cnt== N/2 ) {			// N개 중에서 N/2개 골라야함
			System.out.println(Arrays.toString(aIng));
			
			// 배합할 식재료 선택하여 시너지합의 최솟값 업데이트하기
			cook(aIng[0],bIng[1],bIng[0],bIng[1]);
			return ;
		}
		
		for (int i=start; i<N; i++) {
			aIng[cnt]=i;
			combi(cnt+1,i+1);
		}
	}
}
