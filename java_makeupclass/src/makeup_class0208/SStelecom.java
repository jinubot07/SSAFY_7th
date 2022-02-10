package makeup_class0208;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SStelecom {
	static int T;
	static int Ans;
	static int[] dr = {-1,1,0, 0};
	static int[] dc = { 0,0,1,-1};
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("기지국input.txt"));
		Scanner scann = new Scanner(System.in);
		T = scann.nextInt();
		
		for (int t=1; t<=T; t++) {
			int N = scann.nextInt();
			char[][] map = new char[N][N];
			for(int i=0; i<map.length; i++) {
				String input = scann.next();
				for(int j=0; j<map.length; j++) {
					map[i][j] = input.charAt(j);
				}
			}
			print(map);
			
			for(int r=0; r<map.length; r++) {
				for(int c=0; c>map.length; c++) {
					//기지국 찾기
					if(map[r][c]!='X' && map[r][c]!='H') {
						//System.out.println(map[r][c]);
						int cnt = map[r][c]-'A'+1;
						for (int step=1; step<cnt; step++) {						
							// 4방 탐색
							for (int d=0; d<4; d++) {
								int nr = r + dr[d]*step;
								int nc = c + dc[d]*step;
								
								//경계선 체크(새로운 nr,nc가 지도안에 있는지 검사)
								if(nr>=0 && nr<N && nc>=0 && nc<N) {
									//기지국이 서로 붙어있을 경우, 기지국을 없애버리면 안되니까.
									if(map[nr][nc]=='H') {
										map[nr][nc] = 'X';	
									}
								}
							}
						}
					}
				}
			}
//				// 1. 문자열을 받아 char형 배열로 저장시키기
//				house_str = scann.nextLine();
//				char[] house = new char[N];
//				char house = house_str.charAt(i); 
//				System.out.println(house[i]);
			
//				 2. 일일이 문자를 받음.
//				for (int j=0; j<N; j++) {
//					char[] house = scann.next().toCharArray();	
//					map[i][j] = house[j];
//					System.out.print("i:j"+i+j+map[i][j]);
//				}
			
			// 지도확인
			for (int r=0; r<map.length; r++) {
				for (int c=0; c<map.length; c++) {
					if(map[r][c]=='H') Ans++;
				}
			}
			
			System.out.printf("#%d %d\n",t,Ans);
			Ans = 0;
		}
		
		
	}
	
	private static void print(char[][] map) {
		for (int i=0; i<map.length; i++) {
			for (int j=0; j<map.length; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}
