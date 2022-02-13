import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// SWEA 1210
public class SWEA_D4_Solution_1210_Ladder1 {
	static int[][] map;
	static int r ;			// 현 위치의 행
	static int c ;	 		// 현 위치의 열
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int T = Integer.parseInt(br.readLine());	// readLine는 문자열이라서 정수형 T에 아스키코드로 저장됨. 형변환 필수
		int T = 10; 			// 테스트케이스 수
		//System.out.println("T값:"+T);
		
        for (int t=1; t<=T; t++) {
        	// 사다리 맵 입력받기
        	br.readLine();
        	String[] str = br.readLine().split(" ");	// str문자열에 공백기준으로 구분된 문자를 입력받는다.
        
        	int N = str.length;
    		map = new int[N][N];
            
        	for (int j=0; j<str.length; j++) {
				map[0][j] = Integer.parseInt(str[j]);
			}
    		
    		for(int i=1; i<str.length;i++) {
            	str = br.readLine().split(" ");
    			for (int j=0; j<str.length; j++) {
					map[i][j] = Integer.parseInt(str[j]);
//					System.out.print(map[i][j]+" ");
				}
//    			System.out.println();
    		}
    		
    		
    		// 값이 2인 map의 인덱스 구해서 시작점 찾기
    		startpoint();
    		//System.out.println("시작점 좌표 ("+ r+", "+c+")");
    		findroute();
    		System.out.printf("#%d %d\n",t,c);
    
    		
    		
		}
		
	}

	private static void findroute() {
		if(r == 0) {									// 꼭대기 시작점 도착
			return ;									// 현 위치의 열에 해당하는 c값
		}else if(c-1 == -1){							// 왼쪽 막다른길 -> 우측길 확인하면서 위로 이동
			if(map[r][c+1]==1) { 
				goright();								// goright(): 오른쪽==0이 나올때까지 오른쪽으로만 감
				r--;									// 기껏 왼쪽으로 왔는데, 다시 오른쪽으로 가게되는거 방지.
				findroute();
			}else {
				r--;
				findroute();
			}
		}else if(c+1 == map.length){					// 오른쪽 막다른길 -> 좌측길 확인하면서 위로 이동
			if(map[r][c-1]==1) { 
				goleft();								// goleft(): 왼쪽==0이 나올때까지 왼쪽으로만 감
				r--;									// 기껏 왼쪽으로 왔는데, 다시 오른쪽으로 가게되는거 방지.
				findroute();
			}else{
				r--;
				findroute();
			}
		}else if(map[r][c-1]==0 && map[r][c+1]==0) {	// 좌우 값이 모두 0인경우, 사다리 탈 수 있는 방향이 위로만 있는 경우
			r--;										// 현위치를 위로 한칸 이동, 행에 해당하는 r값 1감소
			findroute();
		}else if(map[r][c-1]==1){						// 좌측 값이 1인 경우, 사다리 왼쪽으로 가는 메소드
			goleft();									// goleft(): 왼쪽==0이 나올때까지 왼쪽으로만 감
			r--;										// 기껏 왼쪽으로 왔는데, 다시 오른쪽으로 가게되는거 방지.
			findroute();
		}else if(map[r][c+1]==1) {						// 우측 값이 1인 경우, 사다리 오른쪽으로 가는 메소드 
			goright();									// goright(): 오른쪽==0이 나올때까지 오른쪽으로만 감
			r--;										// 기껏 왼쪽으로 왔는데, 다시 오른쪽으로 가게되는거 방지.
			findroute();
		}else {
			System.out.println("ERROR");
		}
		//findroute();
		return;
	}

	private static void goright() {
		if(c+1==map.length || map[r][c+1]==0) {			// 오른쪽 == 0&& 막다른 길이면 현위치에서 정지
			return;								
		}else {											// 오른쪽 != 0이면 현위치 우측으로 1만큼 이동
			c++;								
			goright();
		}
	}

	private static void goleft() {
		if(c-1==-1 || map[r][c-1]==0) {					// 왼쪽 == 0 && 막다른 길이면 현위치에서 정지 
			return;								
		}else {											// 왼쪽 != 0이면 현위치 우측으로 1만큼 이동
			c--;								
			goleft();
		}
	}

	private static void startpoint() {
		for (int j=0; j<map.length; j++) {
			if(map[map.length-1][j]==2) {
				r = map.length-1;
				c = j;
				return;
			}
		}
		return;
	}
}
