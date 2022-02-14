import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Scanner;

public class Test5 {
	// 교수님 코드
	static int N = 19; // 오목판 크기
	static int[][] map;
		
	public static void main(String[] args) throws FileNotFoundException {
			// 구현하세요.
			// 승리한 돌의 색 출력 : 1(흰색),2(검정색)
			// 승리한 오목 배열의 왼쪽상단에 있는 돌의 좌표 : 3 2
			
			// 교수님 코드
			// 오목 승리 조건 4가지 + 제약 4가지(육목)
			// 승리 조건1. 오른쪽으로 5개의 돌이 같은 색인 경우
			// 승리 조건2. 대각선 아래로 5개의 돌이 같은 색인 경우
			// 승리 조건3. 대각선 위로 5개의 돌이 같은 색인 경우
			// 승리 조건4. 아래로 5개의 돌이 같은 색인 경우
			// 제약1~4. 5개를 넘어 6개가 같은 색의 돌이 나열 되어있는 경우
			
			// 읽어들이기 : 띄어쓰기 때문에 charAt()사용
		
		//System.setIn(new FileInputStream("Test5.txt"));
		Scanner in = new Scanner(new File("Text5.txt"));
		
		map = new int[N+2][N+2];        // 주변 테두리를 0으로 채움. why? 승리조건시 가장자리라는 특수환경 조건을 추가할 필요 없도록.
		for (int i=1;  i<N+1; i++) {	// 열따라 가로로 이돟하면서 읽기, i=1부터 : 테두리 0으로 채웠기때문
			for (int j=1; j<N+1; j++) { // 행바꿔 세로로 이동하면서 읽기
				map[i][j] = in.nextInt();
			}
		}
		
		// 로직
		for(int r=1; r<N+1; r++) {		//r=1부터 : 테두리 0으로 채웠기때문
			for(int c=1; c<N+1; c++) {  //c=1부터 : 테두리 0으로 채웠기때문
				//바둑알이 있니?
				if(map[r][c]!=0) {
					// 승리 조건1. 오른쪽으로 5개의 돌이 같은 색인 경우
					if((map[r][c-1]!=map[r][c]) && 			// 기준점 왼쪽 1개의 바둑알은 다른색   : (r,c-1),
						(right(map[r][c],r,c))){  			// 기준점 오른쪽 5개의 바둑알은 같은색 : (r,c),(r,c+1),(r,c+2),(r,c+3),(r,c+4)
						System.out.println(map[r][c]);
						System.out.println(r+" "+c);
						return;
					}
					// 승리 조건2. 대각선 아래로 5개의 돌이 같은 색인 경우
					if((map[r-1][c-1]!=map[r][c]) && 			// 기준점 왼쪽 대각선 위로 1개의 바둑알은 다른색   : (r-1,c-1),
							(rightDown(map[r][c],r,c))){    // 기준점 오른쪽 대각선 아래로 5개의 바둑알은 같은색 : (r,c),(r+1,c+1),(r+2,c+2),(r+3,c+3),(r+4,c+4)
							System.out.println(map[r][c]);
							System.out.println(r+" "+c);
							return;
					}
					// 승리 조건3. 대각선 위로 5개의 돌이 같은 색인 경우
					if((map[r+1][c-1]!=map[r][c]) &&			 // 기준점 왼쪽 대각선 아래로 1개의 바둑알은 다른색   : (r+1,c-1),
							(rightUp(map[r][c],r,c))){		 // 기준점 오른쪽 대각선 위로 5개의 바둑알은 같은색 : (r,c),(r-1,c+1),(r-2,c+2),(r-3,c+3),(r-4,c+4)
							System.out.println(map[r][c]);
							System.out.println(r+" "+c);
							return;
					}
					// 승리 조건4. 아래로 5개의 돌이 같은 색인 경우
					if((map[r-1][c]!=map[r][c]) && 			 // 기준점 위로 1개의 바둑알은 다른색   : (r-1,c),
							(down(map[r][c],r,c))){   		 // 기준점 아래로 5개의 바둑알은 같은색 : (r,c),(r+1,c),(r+2,c),(r+3,c),(r+4,c)
							System.out.println(map[r][c]);
							System.out.println(r+" "+c);
							return;
					}
				}
			}
		}
		System.out.println("0");
	}
	
	// 승리 조건1. 오른쪽으로 5개가 같은 색의 돌인지 확인하는 메서드
	private static boolean right(int v, int r, int c) {
		int cnt=1;
		for (; v==map[r][c+1]; c++) {	//오른쪽으로 한 칸씩 이동
			cnt++;			
		}
		return cnt==5?true : false;
	}
	
	// 승리 조건2. 오른쪽 대각선 아래로 5개가 같은 색의 돌인지 확인하는 메서드
	private static boolean rightDown(int v, int r, int c) {
		int cnt=1;
		for (; v==map[r+1][c+1]; r++,c++) {	//오른쪽 대각선 아래로로 한 칸씩 이동
			cnt++;			
		}
		return cnt==5?true : false;
	}	
		
	// 승리 조건3. 오른쪽 대각선 위로 5개가 같은 색의 돌인지 확인하는 메서드
	private static boolean rightUp(int v, int r, int c) {
		int cnt=1;
		for (; v==map[r-1][c+1]; r--,c++) {	//오른쪽 대각선 위로 한 칸씩 이동
			cnt++;			
		}
		return cnt==5?true : false;
	}	
	
	// 승리 조건4. 아래로 5개가 같은 색의 돌인지 확인하는 메서드
	private static boolean down(int v, int r, int c) {
		int cnt=1;
		for (; v==map[r+1][c]; r--) {	//아래로 한 칸씩 이동
			cnt++;			
		}
		return cnt==5?true : false;
	}	
		

}
