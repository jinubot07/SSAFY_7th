// 첫번째 단어의 길이 = 크로스워드 맵 열의 크기
// 두번째 단어의 길이 = 크로스워드 맵 행의 크기
package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Solution_2804_크로스워드만들기 {
	static char[][] cw;		//crossword map
	static int N;
	static int M;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		char[] fw = str[0].toCharArray();			// first word input data


//		String A = str[0];							// A라는 스트링 변수에 문자열이 통째로 들어감
													// A 출력가능. A[1]으로 출력 불가능

//		char B = str[0].charAt(1);					// B라는 문자형 변수에 문자열에서 특정부분 문자만 가져오기
													// B출력시 str[0]의 2번째 글자 출력, B[1]접근 X
		
//		String[] C = str[0].charAt(1);				// 스트링변수에 X. 틀린 문법
//		String[] D = str[0].toCharArray()			// 스트링변수에 X .틀린문법

//		String secondString = str[1];				// 틀린 문법
//		char[] secondChar = str[1].charAt(0~5);		// 틀린 문법
		
		char[] sw = str[1].toCharArray();			// second word input data
		
		N = fw.length;								// 가로로 배치할 첫번째 단어 배열의 크기 : 크로스워드의 열 갯수
		M = sw.length;								// 세로로 배치할 두번째 단어 배열의 크기 : 크로스워드의 행 갯수 
		
		cw = new char[M][N];						// string형 변수명.length(), char형 변수명.length
													// length() 문자열의 길이,    length 배열의 길이
		
		for (int r=0; r<M; r++) {					
			for (int c=0; c<N; c++) {				
				cw[r][c] = '.';
			}
		}
		
		findletter(fw, sw);

		
		// 정답 출력
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(cw[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
	private static void findletter(char[] fw, char[] sw) {
		for(int j=0; j<N; j++) {
			for(int i=0; i<M; i++) {
				if(fw[j]==sw[i]) {					// 각 단어의 문자가 일치하면,
					crossword(fw,sw,i,j);			// 그 문자가 있는 인덱스 값 -> 크로스워드의 인덱스 값 결정
					return;
				}
			}
		}		
	}

	// 겹치는 문자(철자)에 대한 첫번째 단어(가로)의 인덱스가 맵에 있어서 두번째 단어(세로)의 열 위치를 결정
	// 겹치는 문자(철자)에 대한 두번째 단어(세로)의 인덱스가 맵에 있어서 첫 번째 단어(가로)의 행 위치를 결정
	private static void crossword(char[] row, char[] col, int m, int n) {
		for (int i=0; i<N; i++) {					// 첫 번재 단어를 맵에 세로로 넣기 
			cw[m][i] = row[i];						// m : 첫번째 단어(가로)가 놓일 행의 위치 결정
		}
		for (int j=0; j<M; j++) {					// 두 번째단어 가로로 넣기
			cw[j][n] = col[j];						// n : 두번째 단어(세로)가 놓일 열의 위치 결정
		}
	}
}


