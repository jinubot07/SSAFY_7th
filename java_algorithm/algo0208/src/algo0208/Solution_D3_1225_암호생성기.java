// SWEA

package algo0208;

import java.util.Scanner;

public class Solution_D3_1225_암호생성기 {

	static int T=10;
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		for (int t=1; t<=T; t++) {
			int N = scann.nextInt();
			int[] arr = new int[8];
			for (int i=0; i<8; i++) {
				arr[i] = scann.nextInt();
			}
			
			int m=1; // 싸이클
			while(arr[7]!=0) {//0이면 끝내고 0이아니면 루프
				int a = arr[0] -=m;
				System.arraycopy(arr, 1, arr, 0, 7);
				m = (m%5+1);
				if(a<=0) arr[7]=0;
				else arr[7]=a;
			}
			System.out.print("#"+t);
			for(int i=0; i<8; i++) {
				System.out.print(" "+arr[i]);
			}
			System.out.println();
			
		}
	}

}
