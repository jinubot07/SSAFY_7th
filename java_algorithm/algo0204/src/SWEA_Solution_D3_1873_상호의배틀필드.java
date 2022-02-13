// 59번째 코드 for문의 범위조건에 12대신 N이 들어가야합니다. 근데 N이 들어가면 go(map, S.charAt(i)); 호출문에서 java.lang.ArrayIndexOutOfBoundsException 오류가 발생합니다.ㅜㅜ

import java.util.Scanner;

public class SWEA_Solution_D3_1873_상호의배틀필드 {
	
	static int T;		// 테스트케이스
	static int H,W;		// 맵의 크기
	static char[][] map; // 맵
	//static int N;			// 명령어 개수 (문자열길이)
	//static String S;		// 전차가 수행해야할 명렁어

	static int[] dr = {-1, 1, 0, 0};	//UDLR : up,down,left,right
	static int[] dc = { 0, 0,-1, 1};	//up,down,left,right

	static int sr;		// 시작 위치 행
	static int sc;	 	// 시작 위치 열
	static int sd; 	 	// 시작방향
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in); //공백없이 입력 받는다.
		T=scann.nextInt();
		for (int t=1; t<=T; t++) {
			// 입력받은 문자열로 비어있는 맵 먼저 만들기
			H = scann.nextInt();
			W = scann.nextInt();
			map = new char[H][W];
			for (int i=0; i<H; i++) {
				//행마다 값을 받아서
				char[] cs= scann.next().toCharArray();
				for (int j=0; j<W; j++) {
					// 빈 맵에 넣어줌
					map[i][j] = cs[j];
					//시작할 위치 찾기 - switch-case로 구현가능
					if(map[i][j]=='^') {
						sr=i;
						sc=j;
						sd=0;
					}else if(map[i][j]=='v') {
						sr=i;
						sc=j;
						sd=1;
					}else if(map[i][j]=='<') {
						sr=i;
						sc=j;
						sd=2;
					}else if(map[i][j]=='>') {
						sr=i;
						sc=j;
						sd=3;
					}
				}
			}
			// 빈 맵에 값 넣어주기
			int N = scann.nextInt();	// 명령어 개수 (문자열길이)
			String S =scann.next();		// 전차가 수행해야할 명렁어
			

			// 명렁어 한자 씩 따라가면서 go메소드 수행
			for (int i=0; i<N; i++) {
				go(map, S.charAt(i));
				System.out.print(S.charAt(i));
			}
			System.out.println();
			// 결과출력
			System.out.print("#"+t+" ");
			print(map);
		}

	}

	
	private static void go(char[][] tank, char c) {
		
		
		if(c=='S') {
			if(sd==0) {	// 전차의 방향에 U인경우
				for (int i=sr+dr[sd]; i>=0; i--) {
					if(cango()&&tank[i][sc]=='#') {
						break;
					}else if(cango()&& tank[i][sc]=='*') {
						tank[i][sc]='.';
						break;
					}
				}
				
			}
			if(sd==1) {	// 전차의 방향에 U인경우
				for (int i=sr+dr[sd]; i<H; i++) {
					if(cango()&&tank[i][sc]=='#') {
						break;
					}else if(cango()&& tank[i][sc]=='*') {
						tank[i][sc]='.';
						break;
					}
				}
				
			}
			if(sd==2) {	// 전차의 방향에 U인경우
				for (int i=sc+dc[sd]; i>=0; i--) {
					if(cango(sr,i)&&tank[sr][i]=='#') {
						break;
					}else if(cango(sr,i)&& tank[sr][i]=='*') {
						tank[sr][i]='.';
						break;
					}
				}
				
			}
			if(sd==3) {	// 전차의 방향에 U인경우
				for (int i=sc+dc[sd]; i<W; i++) {
					if(cango(sr,i)&&tank[sr][i]=='#') {
						break;
					}else if(cango(sr,i)&& tank[sr][i]=='*') {
						tank[sr][i]='.';
						break;
					}
				}
				
			}
		
		}else {
			
		}
		
		
		
		
		//명령c가 UDLR이면 그에 따라 방향을 바꾸고 .를 만나면 위치를 바꾼다.
		//명령c가 S이면 현재방향에서 #,*을 만날 때까지 이동한다.
		switch (c) {
			case 'U':
				map[sr][sc]='^';
				sd=0;

				// 가려는 방향의 한 칸 앞이 '.'이면, tank의 위치를 한 칸 앞으로 이동시킨다
				// tank의 위치를 한 칸 앞으로 이동시킨다 : 기존tank위치의 값을 .으로, tank는 새로운 위치로 초기화
				if( sr-1<0 || map[sr-1][sc] != '.') {}	// 맵을 벗어나거나 앞에 .이 없으면 -> 제자리
				else {	// 그렇지 않으면(막다른 길이 아니고, 그 자리에 .이 있으면 -> tank위치 이동)
					map[sr][sc]='.';
					map[sr-1][sc] = '^';
				}
				break;
			case 'D':
				map[sr][sc]='v';
				sd=1;

				// 가려는 방향의 한 칸 앞이 '.'이면, tank의 위치를 한 칸 앞으로 이동시킨다
				if( sr+1>H || map[sr+1][sc] != '.') {}	// 맵을 벗어나거나 앞에 .이 없으면 -> 제자리
				else {	// 그렇지 않으면(막다른 길이 아니고, 그 자리에 .이 있으면 -> tank위치 이동)
					map[sr][sc]='.';
					map[sr+1][sc] = 'v';
				}
				break;
			case 'L':
				map[sr][sc]='<';
				sd=2;

				// 가려는 방향의 한 칸 앞이 '.'이면, tank의 위치를 한 칸 앞으로 이동시킨다
				if( sc-1<0 || map[sr][sc-1] != '.') {}	// 맵을 벗어나거나 앞에 .이 없으면 -> 제자리
				else {	// 그렇지 않으면(막다른 길이 아니고, 그 자리에 .이 있으면 -> tank위치 이동)
					map[sr][sc]='.';
					map[sr][sc-1] = '<';
				}
				break;
			case 'R':
				map[sr][sc]='>';
				sd=3;

				// 가려는 방향의 한 칸 앞이 '.'이면, tank의 위치를 한 칸 앞으로 이동시킨다
				if( sc+1>W || map[sr][sc+1] != '.') {}	// 맵을 벗어나거나 앞에 .이 없으면 -> 제자리
				else {	// 그렇지 않으면(막다른 길이 아니고, 그 자리에 .이 있으면 -> tank위치 이동)
					map[sr][sc]='.';
					map[sr][sc+1] = '>';
				}
				break;
				
			case 'S': // 발사할 방향이 UDLR에 따라				
				if(sd==0) {
					for(int i=sr-1; i>=0 ; i--) {
						if(map[i][sc] =='*') {
							map[i][sc] = '.';
							break;
						}else if(map[i][sc] =='#') {
							break;
						}
					}
					
				}else if(sd==1) {
					for(int i=sr+1; i<=H ; i++) {
						if(map[i][sc] =='*') {
							map[i][sc] = '.';
							break;
						}else if(map[i][sc] =='#') {
							break;
						}
					}
				}else if(sd==2) {
					for(int i=sc-1; i>=0 ; i--) {
						if(map[sr][i] =='*') {
							map[sr][i] = '.';
							break;
						}else if(map[sr][i] =='#') {
							break;
						}
					}
				}else if(sd==3) {
					for(int i=sc+1; i<=W ; i++) {
						if(map[sr][i] =='*') {
							map[sr][i] = '.';
							break;
						}else if(map[sr][i] =='#') {
							break;
						}
					}
				}
				
				break;
		}
	}
	
	
	

	private static boolean cango(int,int) {
		// TODO Auto-generated method stub
		return r>=0 && r<H && c>=0 && ;
	}


	private static void print(char[][] map2) {
		for (int i=0; i<H; i++) {
			for (int j=0; j<W; j++) {
				System.out.print(map2[i][j]);
			}
			System.out.println();
		}
	}

}
