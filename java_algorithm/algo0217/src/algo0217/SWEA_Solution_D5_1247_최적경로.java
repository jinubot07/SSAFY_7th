package algo0217;

import java.util.ArrayList;
import java.util.Scanner;

public class SWEA_Solution_D5_1247_최적경로 {
	static int T, N, min;
	static int[][] map;
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		// 입력
		T = scann.nextInt();
		for (int t=1; t<=T; t++) {
			N = scann.nextInt();
			map = new int[N+2][2];		// 방문해야할 곳 : 회사 + 고객집 N가구 +내집
			for (int i=0; i<N+2; i++) {
				for (int j=0; j<2; j++) {		// x좌표 y좌표
					map[i][j] = scann.nextInt();				
				}
			}
			
			// 0회사 1 myHome -> 고객 2 3 4 ... N+1
			min = Integer.MAX_VALUE;
			npr(0,new boolean[N], new ArrayList<String>());

			// 정답 출력
			System.out.println("#"+t+" "+min);
			
		}
	}
	
	
	
	private static void npr(int cnt, boolean[] v, ArrayList<String> list) {

		if(cnt==N) {				// 모든 고객의 집을 방문한 경우
			
			int departure = 0;										// 출발지: 회사 좌표
			
			// 회사 ~ 1고객집 까지 거리
			int arrival = Integer.parseInt(list.get(0));			// 도착지 : 첫번째 고객집 좌표
			int distance = dist(departure,arrival);
			
			// 1번째 고객집 ~ ... ~ N번째 고객집까지 거리
			for (int i=0; i<list.size()-1; i++) {					
				departure = Integer.parseInt(list.get(i));
				arrival = Integer.parseInt(list.get(i+1));
				distance += dist(departure,arrival);
			}
			
			// N고객집 ~ 내집까지 거리
			departure = Integer.parseInt(list.get(N-1));
			arrival = 1;
			distance += dist(departure,arrival);
			
			// 최소값 구하기
			min = Math.min(min, distance);
			return; 
		}
		
		for (int i=0; i<N; i++) {
			if(v[i]) continue;		// 한 번 방문 한 적있으면 skip
			v[i] = true;			// 한 번 방문했으면 했다고 표시
			list.add((i+2)+"");
			npr(cnt+1,v,list);
			list.remove((i+2)+"");
			v[i] = false;
		}
	}



	private static int dist(int start, int end) {
		return Math.abs(map[start][0]-map[end][0]) +
				Math.abs(map[start][1]-map[end][1]);
	}

}
