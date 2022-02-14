import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algo1_서울_15반_정진우 {
	 static int N, X, K;
	 static int[] arr;									// 야바위 종이컵
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());		// testcase
		for(int t=1; t<=T; t++) {
			String[] str = br.readLine().split(" ");
			N = Integer.parseInt(str[0]);				// cup 수
			X = Integer.parseInt(str[1]);				// 간식의 위치(index도 +1해줘야 함)
			
			arr = new int[N+1];							// arr[0]은 사용하지 않음
			arr[X] = 1;
			
			K = Integer.parseInt(str[2]);				// 스위칭 횟수
			for(int k=0; k<K; k++) {
				str=br.readLine().split(" ");
				int left = Integer.parseInt(str[0]);	// left : 인덱스. 간식여부는 arr[left] 값
				int right = Integer.parseInt(str[1]);
				swap(left,right);
			}
			
			System.out.printf("#%d %d\n",t,find());
		}

	}
	
	
	private static int find() {
		for(int i=1; i<=N; i++) {
			if(arr[i]==1) return i;
		}
		return -1;
	}


	private static void swap(int ath_index, int bth_index) {
		int temp = arr[ath_index];
		arr[ath_index] = arr[bth_index];
		arr[bth_index] = temp;
	}

}
