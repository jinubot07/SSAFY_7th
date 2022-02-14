package algo0214;

import java.util.Scanner;

public class 과목평가2회_Solution_1_야바위 {
	static int N, X, K;
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int T = scann.nextInt();
		for(int t=1; t<=T; t++) {
			N = scann.nextInt();
			X = scann.nextInt();
			K = scann.nextInt();
			
			for(int i=0; i<K; i++) {
				int cup1 = scann.nextInt();
				int cup2 = scann.nextInt();
				if(cup1 == X) {
					X = cup1;
				}else if(cup2==X) {
					X=cup2;
				}
			}
			System.out.println("#"+t+" "+X);
		}

	}

}
