package youtube0207;

import java.util.Arrays;
import java.util.Scanner;

public class CombinationTest {
	
	static int N, R;	// 보통 입력받는 변수는 대문자
	static int[] input, numbers;
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();
		R = scann.nextInt();
		
		input = new int[N];
		numbers = new int[R];
		
		for (int i=0; i<N; i++) {
			input[i]=scann.nextInt();
		}
		
		combination(0,0);
	}
	
	
	//  현재 자리에 수 뽑기
	public static void combination(int cnt, int start) {	// cnt : 직전까지 뽑은 수의 갯수 
		
		//  기저 조건
		if(cnt==R) {
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		
		//  유도 파트
		for (int i=start; i<N; i++) {			
			numbers[cnt] = input[i];
			//  다음 자리의 수 뽑기
			combination(cnt+1,i+1);	// 다음자리는 현재 뽑은 수i의 다음수부터 시작하도록 전달
		}
	}
}
