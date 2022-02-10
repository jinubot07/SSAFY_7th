import java.util.Scanner;

//BOJ 2563번

public class BOJ_Solution_2563_색종이 {
	
	static int T;
	static int map[][] = new int[100][100];
	static int cnt=0;
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
	
		// 입력받고
		T = scann.nextInt();
		for(int t=1; t<=T; t++) {
			int r = scann.nextInt();
			int c = scann.nextInt();
			// 바로 계산
			draw(r,c);
		}
		
		//결과 출력
		System.out.println(count());
	}

	// 색종이를 붙인 위치(r,c)가 주어지면 색종이가 덮혀질 부분을 모두 1로 초기화
	private static void draw(int r, int c) {
		for(int i=r; i<r+10; i++) {
			for (int j=c; j<c+10; j++) {
				map[i][j] = 1;
			}
		}
	}
	
	// 전체 도화지(map[100][100])에 색종이가 덮혀진 부분(1) 갯수 세기
	private static int count() {
		cnt=0;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if(map[i][j] == 1) cnt++;
			}
		}
		return cnt;
	}
}
