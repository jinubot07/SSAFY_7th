package youtube0207;

import java.util.Arrays;
import java.util.Scanner;

// nPr : n개를 입력받아 처리
public class PermutationTest {
	static int N, R;	// 보통 입력받는 변수는 대문자
	static int[] input, numbers;
	static boolean[] isSelected;
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();
		R = scann.nextInt();
		
		input = new int[N];
		numbers = new int[R];
		isSelected = new boolean[N];	// 1,2,3, ... ,N 순서가 아니라,
										// 자리수에 맞춰서 true, false입력
		
		for (int i=0; i<N; i++) {
			input[i]=scann.nextInt();
		}
		
		permutation(0);
	}
	
	//  현재 자리에 수 뽑기
	public static void permutation(int cnt) {	// cnt : 직전까지 뽑은 수의 갯수 
		
		//  기저 조건
		if(cnt==R) {
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		
		//  입력받은 모든 수를 현재 자리에 넣어보자.
		for (int i=0; i<N; i++) {
			//  기존자리의 수들과 중복되는지 체크하자. True:사용가능, False:사용완료.
			if(isSelected[i]) continue;		// 중복되면 건너 뛰자.
			
			numbers[cnt] = input[i];
			isSelected[i] = true;			// 
			
			//  다음 자리의 수 뽑기
			permutation(cnt+1);
			isSelected[i]=false;
		}
	}
	
}
