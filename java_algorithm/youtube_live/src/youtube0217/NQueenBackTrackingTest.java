// 유망성을 미리 판단하고, 아에 접근하징 ㅏㄶ는 경우

package youtube0217;

import java.util.Scanner;

public class NQueenBackTrackingTest {
	
	static int N, ans=0;
	static int[] col;	// static int col[];
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();
		col = new int[N+1];
		
//		if(isAvailable(0)) 					// 1퀸은 모두 가능하니까 초기단계에서 굳이 언급X
		setQueen(1);						// 파라미터:놓아야하는 행 부터시작
		System.out.println(ans);
	}
	
	public static void setQueen(int rowNo) {	//rowNo:퀸을 놓아야하는 현재 행,  행 단위로 Q을 놓을것이기때문에

		// 기저조건
		if(rowNo > N) {		// 마지막행도 수행하고 끝내야함
			ans++;			// 유망성 판단을 통과한 노드들만 살아남음.
			return;
		}
		
		
		// 유도파트
		// 1열부터 ~ n열까지 퀸을 놓는 시도
		for (int i=1; i<=N; i++) {
			col[rowNo] = i;	
			
			// 유망성 판단(가지치기) : 호출하기전에 유망성을 따져준다. (1퀸은 모두 가능하니까 초기단계에서 굳이 언급X)
			if(isAvailable(rowNo)) {		// 현재 행에 퀸을 놓을 수 있다면
				setQueen(rowNo+1);			// 유망하다면 다음 작업 수행해라
			}								// 유망하지 않다면 작업을 끝내라
		}
		
	}
	
	// 유망성 여부 판단
	public static boolean isAvailable(int rowNo) { // 해당 행까지 가능하다~!
		
		for (int i=1; i < rowNo; i++) {
			if(col[rowNo] == col[i]) return false;	// 기존퀸과 현재퀸의 열이 같은 경우
			if(rowNo-i == Math.abs(col[rowNo]-col[i])) return false;	// 현재 놓은 퀸이 기존에 놓은 퀸의 대각선에 있을 경우	
		}
		return true;
		
	}
	
}
