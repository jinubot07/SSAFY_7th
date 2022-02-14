import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algo2_서울_15반_정진우 {
	static int N, S, M;
	static int[][] score;
	static StringBuilder pass = new StringBuilder();		// 통과한 학생들의 점수
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		
		N = Integer.parseInt(str[0]); 			
		S = Integer.parseInt(str[1]);
		M = Integer.parseInt(str[2]);
		
		// 입력받기
		score = new int[N][3];				// 행: 동아리 번호, 열: 팀원들 개인 점수

		int cnt = 0;
		for(int i=0; i<N; i++) {
			str = br.readLine().split(" ");
			for(int j=0; j<3; j++) {
				score[i][j] = Integer.parseInt(str[j]); 				
			}
		}
		
		// 정답출력
		cnt = select(); // 메소드 호출하면 score에 값이 저장되지 않는 오류
		System.out.print(cnt +"\n" + pass );
	}

	
	
	// select() : 조건에 맞는 팀 선발 (조건1. 개개인의 학생의 점수가 M이상인 경우, 조건2. 팀원의 점수합이 S이상인 경우)
	private static int select() {
		int cnt=0;
		for(int i=0; i<N; i++) {
			// 합격조건
			int sum = score[i][0] + score[i][1] + score[i][2];
			
			if(score[i][0] >= M && score[i][1] >= M && score[i][2] >= M && sum >= S) {
				for(int j=0; j<3; j++) {
					pass.append(score[i][j]+" ");
				}
				cnt++;				
			}
		}
		return cnt;
	}

}