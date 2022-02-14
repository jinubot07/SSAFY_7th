import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algo3_서울_15반_정진우 {
	static int N, M;
	static int[] P;
	static int max;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		P = new int[N];
	
		int[] pw = new int[M];

		String[] str = br.readLine().split(" ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int p=0; p<M; p++) {
			pw[p] = Integer.parseInt(str[p]);	
		}
		
		max = Integer.MIN_VALUE;
		for(int n=0; n<N; n++) {
			int min = Integer.MAX_VALUE;
			for(int m=0; m<M; m++) {
				int tr=0;
				int xor = n^P[m];
				// ex. 3 XOR 8 은 3 ^ 8 = 11 ^ 1000 = 1011 이니까, 보안척도는 1의 개수 3
				// ex. 4 XOR 8 은 4 ^ 8 = 100 ^ 1000 = 1100 이니까, 보안척도는 1의 개수 2
				// 보안척도 3 과 보안척도 4 중에 최솟값(min)이 보안성!
				// 1 10 100 1000 10000
				for(int b=1; b<=N; b<<=1) {
					if((xor&b)>0) tr++;
				}
				min = Math.min(min,tr);
			}
			
			System.out.println(max);
		}
		
//		// 10진수 -> 2진수
//		while(pw[i] > 0){
//	       binary_pw[i] = pw[i] % 2;
//	       pw[i] /= 2;
//	       i++;
		 }

	}

}
