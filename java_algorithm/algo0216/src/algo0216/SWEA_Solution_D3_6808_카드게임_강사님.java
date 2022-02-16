package algo0216;

import java.util.Scanner;

public class SWEA_Solution_D3_6808_카드게임_강사님 {
	static int T, N=9, imax, gmax;
	static int [] gy;
	static int [] iy;
	static int [] tt;
	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		T=scann.nextInt();
		for (int t = 1; t <= T; t++) {
			gy=new int[N];
			iy=new int[N];
			tt=new int[2*N];
			for (int i = 0; i < N; i++) {
				gy[i]=scann.nextInt();
				tt[gy[i]-1]=1;  // 구영이의 카드 표시
			}
			int cnt=0;
			for (int i = 0; i < 2*N; i++) {
				if(tt[i]==0) { // 표시 안됨-> 인영이 9개 카드 얻기
					iy[cnt++]=i+1;
				} 
			}
			imax=0;
			gmax=0;
			// iy를 넥스트 순열로 완탐하면서 비교
			do {
				int gtot=0; // 규영이 카드값
				int itot=0;
				for (int i = 0; i < N; i++) {
					if(gy[i]>iy[i]) {
						gtot+=gy[i]+iy[i];
					}else if(gy[i]<iy[i]){
						itot+=gy[i]+iy[i];
					}
				}
				// 누가큰가?
				if(gtot>itot) {
					gmax++;
				}else if(gtot<itot) {
					imax++;
				}
			}while(np(N-1));
			System.out.println("#"+t+" "+gmax+" "+imax);
		}
	}
	private static boolean np(int size) {
	    
		return true;
	}
	
}