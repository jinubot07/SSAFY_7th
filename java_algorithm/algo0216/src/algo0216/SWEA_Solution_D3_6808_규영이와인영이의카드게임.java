// 순열, 비트와이즈순열, 넥스트순열로 풀어보기

package algo0216;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SWEA_Solution_D3_6808_규영이와인영이의카드게임 {

	static int T, N=9, gywin, iywin;	// 각 플레이어의 누적점수
	static int[] gycard;					// 규영이가 갖고있는 + 제시할 카드 순서
	static int[] iycard;					// 인영이가 갖고있는 카드
	static int[] tt;						//
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		T = Integer.parseInt(br.readLine());
		
		Scanner scann = new Scanner(System.in);
		T = scann.nextInt();
		System.out.println("테스트케이스 : "+T);

		String[] str;
		for(int t=1; t<=T; t++) {
			gycard = new int[N];
			iycard = new int[N];
//			tt = new int[2*N];
			
			str = br.readLine().split(" ");
			for(int i=0; i<N; i++) {
				gycard[i] = Integer.parseInt(str[i]);
//				tt[gycard[i]-1]=1;			//규영이의 카드 표시
				System.out.println(t+"번째 테케 : 규영이카드 "+gycard[i]);
			}
			
//			int cnt=0;
//			for(int i=0; i<2*N; i++) {
//				if(tt[i]==0) {				//인영이의 9개의 카드 얻기
//					iycard[cnt++] = i+1;
//				}
//			}
		
			gywin = 0;
			iywin = 0;
//		
//			
//			int[] tr = new int[N];
			// 교수님코드
			// perm(N,0,iycard);
			
//			iywinwount();
			
			
			// 정답 출력
			System.out.printf("#%d %d %d",t, gywin, iywin);
		}
	}
	

	
	private static void iywinwount() {
		// TODO Auto-generated method stub
		
	}
	
	


	private static void perm(int cnt, int flag, int[] iy ) {
		if(cnt==N) {
			// 인영과 규영카드 비교
			return;
		}
		
		// 순열공식
		for( int i=0; i<N; i++) {
			// flag 비트와이즈로 방문처리
			if( (flag & (1<<i)) != 0 ) continue;	// 방문한적 있다면
			iy[cnt] = iycard[i];
			perm(cnt+1, ( flag | (1<<i) ), iy);
		}
	}

}
