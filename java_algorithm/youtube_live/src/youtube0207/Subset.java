package youtube0207;

import java.util.Scanner;

public class Subset {
	
	static int N, input[],totalCnt;	// 원소개수, 입력된 수를 배열에 저장
	static boolean[] isSelected;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();
		
		input = new int[N];
		isSelected = new boolean[N];
		
		for (int i=0; i<N; i++) {
			input[i] = scann.nextInt();
		}
		
		generateSubset(0);
	}
	
	public static void generateSubset(int cnt) {	// 부분집합에서 고려해야하는 원소, 직전까지 고려한 원소수
		
		if(cnt==N) {	// 마지막 원소까지 부분집합에 다 고려된 상황
			
			for (int i=0; i<N; i++) {
				System.out.print((isSelected[i]?input[i]:"X")+" ");
			}
			System.out.println();
			return;
		}
		
		// 현재 원소를 선택
		isSelected[cnt] = true;
		generateSubset(cnt+1);
		
		// 현재 원소를 비선택
		isSelected[cnt] = false;
		generateSubset(cnt+1);
	}
	
}
