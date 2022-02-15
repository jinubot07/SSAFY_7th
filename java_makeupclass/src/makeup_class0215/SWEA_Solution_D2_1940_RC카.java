package makeup_class0215;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_Solution_D2_1940_RC카 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t=1; t<=T; t++) {				// testcase만큼 반복
			
			int N = Integer.parseInt(br.readLine());
			int dist = 0;
			int speed = 0;
			for(int i=0; i<N; i++) {			// command 수 만큼 반복
			
				// 몇개가 입력될지 다르기때문에 Tokenizer로 받아야한다.
				StringTokenizer st = new StringTokenizer(br.readLine());
				int c = Integer.parseInt(st.nextToken());
				int v;							// command 0 일경우는 초기화 되지않음.
				switch(c) {
				case 0:							// c가 int면 case다음에 숫자를 적자. char가 아니라
					v = 0;
					dist += speed;
					break;
				case 1:
					v = Integer.parseInt(st.nextToken());
					speed += v;
					dist += speed;
					break;
				case 2:
					v = Integer.parseInt(st.nextToken());
					speed -= v;
					if(speed < 0) speed = 0;	// 속도가 음수면 뒤로 가지않고, 정지
					dist +=  speed;				// 뒤로가는 경우는 없으니까 +=로 계산
				}				
			}
			System.out.printf("#%d %d\n", t, dist);
			
		}
	}

}
