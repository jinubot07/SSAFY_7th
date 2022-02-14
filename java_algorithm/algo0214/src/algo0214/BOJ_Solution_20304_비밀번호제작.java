package algo0214;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BOJ_Solution_20304_비밀번호제작 {


	static int N;
	static int M;
	static int[] P;
	static int max;
	//15
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(
				new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		M=Integer.parseInt(br.readLine());
		P=new int[M];
		StringTokenizer st= new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			P[i]=Integer.parseInt(st.nextToken());
		}
		max=Integer.MIN_VALUE;
		for (int n = 0; n < N; n++) {
			int min=Integer.MAX_VALUE;
			for (int m = 0; m < M; m++) {
				int tr=0;
				int xor=n^P[m];
				// 3^ 8 = 11^1000 1011 
				// 4^ 8 = 100^1000 1100 
				//1  10 100 1000 10000 
				for (int b = 1; b <=N; b<<=1) {
					if((xor & b)>0 ) tr++;
				}
				min=Math.min(min, tr);
			}
			max=Math.max(max, min);
		}
		
		System.out.println(max);
	}

}
