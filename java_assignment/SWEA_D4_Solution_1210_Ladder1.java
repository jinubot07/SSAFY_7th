import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// SWEA 1210
public class SWEA_D4_Solution_1210_Ladder1 {
	static int[][] map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = br.read();					// read는 문자열이라서 정수형 T에 아스키코드로 저장됨.
		System.out.printf("T값:%d\n",T-'0');	// 아스키코드 식에 밀리만큼 정렬
		int N = 2;							// 사다리 맵의 크기
		map = new int[N][N];
		
		String str = br.readLine();
		System.out.println("readLine() 버퍼드리더후 -> str:"+str);
		
//		int ladderi = Integer.parseInt(str);
//		System.out.println("parseInt(str) 형변환후-> ladderi:"+ladderi);
//
//		String[] arr = str.split(" ");
//		System.out.println("str.split() 공백구분후 -> arr: "+arr);
//		for(int t=1; t<T; t++) {
//			for(int i=0; i<N; i++) {
//				// 라인 단위로 입력을 받는다.(Enter경계로 String형태로)
//				String str = br.readLine();
//				// 정수형으로 형변환
////				int ladderi = Integer.parseInt(str);
////				System.out.println(ladderi);
//				// 공백을 기준으로 구분하기(1) .split
////				String arr[] = str.split(" ");
//				// 공백을 기준으로 구분하기(2) StringTokenizer
//				StringTokenizer st = new StringTokenizer(str);
//				for(int j=0; j<N; j++) {
//					// 배열에다가 토큰을 하나씩 불러서 입력해준다.
//					ladder[i][j] = Integer.parseInt(st.nextToken());
//				}	
//			}
//		}
	}
}
