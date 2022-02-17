package youtube0217;

import java.util.Scanner;

public class NQueenBackTrackingTest2 {
	
	static int N, ans=0;
	static int[] col;	// static int col[];
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();
		col = new int[N+1];
		setQueen(1);							// 파라미터:놓아야하는 행 부터시작
		System.out.println(ans);
	}
	
	public static void setQueen(int rowNo) {	//rowNo:퀸을 놓아야하는 현재 행,  행 단위로 Q을 놓을것이기때문에

		// 퀸 배열 생성시 2차원이 아닌 1차원을 해도 되는 이유 : 행마다 한 곳에만 둘것이기 때문에, 인덱스=행, 값=열로 고려
		// 검사해야할 것 3가지
		// 1. 같은 행에 있는지 -> 1차원 배열로 해결 가능(인덱스 0에 두개의 값이 못들어가니까)
		// 2. 같은 열에 있는지
		// 3. 대각선에 있는지  -> |행의 변화량| == |열의 차이값| 대각선
		
		
		// 백트래킹 유망성 판단(기저조건X, 가지치기) : 현재 행에 퀸을 놓을 수 없는 상황
		if(!isAvailable(rowNo-1)) return;			// rowNo - 1 : "직전"까지의 상황이 유망하지 않다면 리턴	 
		
		
		// 기저조건
		if(rowNo > N) {		// 마지막행도 수행하고 끝내야함
			ans++;			// 유망성 판단을 통과한 노드들만 살아남음.
			return;
		}
		
		
		// 유도파트
		// 1열부터 ~ n열까지 퀸을 놓는 시도
		for (int i=1; i<=N; i++) {
			col[rowNo] = i;	
			setQueen(rowNo+1);
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
