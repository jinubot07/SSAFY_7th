package algo0209;

import java.util.Scanner;

public class Solution_D3_1208_Flatten {
	static int testcase = 10;
	static int[] map = new int[100];

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		for(int t=1; t<=testcase; t++) {
			int cnt = scann.nextInt();	// 덤프 제한 횟수
			// 입력받기 (문자열 통째로 받기)
//			char input = new char[100];
//			for(int i=0; i<100; i++) {
//				input[i] = scann.next().toCharArray();
//			}
			
			// 입력받기 (문자를 일일이 받기)
			for(int i=0; i<map.length; i++) {
				map[i] = scann.nextInt();
				//System.out.print(map[i]+" ");
			}
			
			// 제한 횟수만큼 덤프하기
			for(int n=0; n<cnt; n++) {
				dump();
			}
			
			// 정답 출력
			int result = map[high()]-map[low()];
			System.out.printf("#%d %d\n",t, result);
			
		}		
	}

	// 가장 높은 더미에서 가장 낮은 더미로 상자 한개 이동
	private static void dump() {
		map[high()]=map[high()]-1;
		map[low()]=map[low()]+1;		
	}

	// 가장 높은 상자 더미의 인덱스(앞에서부터) : 가장 큰 값의 인덱스
	private static int high() {
		int top_index = 0;
		for(int i=1; i<100; i++) {
			if(map[top_index]<map[i]) top_index = i;
		}
		return top_index;
	}
	
	// 가장 낮은 상자 더미의 인덱스(앞에서부터) : 가장 작은 값의 인덱스
	private static int low() {
		int bottom_index = 0;
		for(int i=1; i<100; i++) {
			if(map[bottom_index]>map[i]) bottom_index = i;
		}
		return bottom_index;
	}
	
	
}
