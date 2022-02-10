package youtube0207;

import java.util.Arrays;
import java.util.Scanner;

public class DiceTest {
	
	static int N, numbers[],totalCnt;	// totalCnt : 경우의 수
	
	// 뽑힌 주사위눈을 기록(중복 방지)
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();	// 던진 주사위 횟수
		numbers = new int[N];	// 차례대로 던져진 주사위 눈의 수(중복벙지)
		
		int M=scann.nextInt(); // 던지기 모드(4가지)
		switch(M) {
		case 1: 	// 주사위 던지기1 : 중복순열
			dice1(0);
			break;
		case 2:		// 주사위 던지기2 : 순열
			dice2(0,new boolean[7]);
			break;
		case 3:		// 주사위 던지기3 : 중복 조합
			dice3(0,1);
			break;
		case 4:		// 주사위 던지기4 :조합
			dice4(0,1);
			break;
		default:
				break;
		}
		System.out.println("총 경우의 수:"+totalCnt);
	}

	// 주사위 던지기1 : 중복순열
	public static void dice1(int cnt) {
		
		// 기저 조건
		if(cnt==N) {	// 주사위를 던져야 하는 횟수를 모두 채웠을때 종료.
			totalCnt++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		// 유도파트
		for (int i=0; i<6; i++) {
			// 중복을 허용하기 때문에 중복체크X
			numbers[cnt]=i;
			dice1(cnt+1);
		}
	}
	
	// 주사위 던지기2 : 순열
	public static void dice2(int cnt,boolean[] isSelected) { // 중복을 방지하기 위한 boolean 배열
		
		// 기저 조건
		if(cnt==N) {	// 주사위를 던져야 하는 횟수를 모두 채웠을때 종료.
			totalCnt++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		// 유도파트
		for (int i=1; i<6; i++) {	// 계산 편의상 index와 index안의 값을 일치시킨다
			// 중복 체크
			if(isSelected[i]) continue;
			// 중복 안됐을 경우,
			numbers[cnt]=i;
			isSelected[i] = true;				// 사용완료했음을 표시

			dice2(cnt+1,isSelected);
			isSelected[i] = false;				// 1번 주사위를 던진사실을 없애야함?
		}
	}

	
	// 주사위 던지기3 : 중복조합
	public static void dice3(int cnt,int start) { // 중복을 방지하기 위한 boolean 배열

		if(cnt == N) {
			totalCnt++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		for(int i=start; i<=6 ;i++) {
			numbers[cnt] = i;
			dice3(cnt+1,i);		// 다음 주사위는 선택한 현재수 부터 시도.
		}
	
	
	}
	
	// 주사위 던지기4 : 조합
	public static void dice4(int cnt,int start) { 
	
		if(cnt == N) {
			totalCnt++;
			System.out.println(Arrays.toString(numbers));
			return;
		}
		
		for(int i=start; i<=6 ;i++) {
			numbers[cnt] = i;
			dice4(cnt+1,i+1);
		}
	}
}














