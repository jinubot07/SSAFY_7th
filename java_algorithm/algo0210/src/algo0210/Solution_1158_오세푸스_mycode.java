// BOJ 1158

package algo0210;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution_1158_오세푸스_mycode {
	static int[] arr;
	static int[] josephus;
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int N = scann.nextInt();
		int K = scann.nextInt();
		arr = new int[N];
		josephus = new int[N];
		//arraylist와 array차이는?
		
		// arr에 수열입력
		for (int i=0; i<N; i++) {
			arr[i]= i+1;			
		}
		
		// 요세푸스에 수열 넣기
		int arr_index=0;
		int jose_index=0;
		
		while(true) {
			int loopcnt = 0;		// 무한루프 방지:arr의 모든 값이 0 이어서 무한루프 도는것 방지
			// K칸 이동(단 arr값이 0이면 이동한걸로 세지않는다.->cnt)
			for (int cnt=0; cnt<K; cnt=cnt) {
				if(loopcnt==N*K-1) break;
				if(arr[arr_index] != 0) cnt++;
//				System.out.print("이동전 arr["+arr_index+"]?:"+arr[arr_index]);
				arr_index = (arr_index+1) % N;	
				loopcnt++;
//				System.out.print(", arr_index?:"+arr_index);
//				System.out.print(", cnt?:"+cnt);
//				System.out.print(", loopcnt?:"+loopcnt);
//				System.out.println(", 이동후 arr["+arr_index+"]?:"+arr[arr_index]);
			}
			
			if(loopcnt==N*K-1) break;
			// K번째 값 뽑기(단 arr값이 0이면 다음 값을 출력한다.)
			josephus[jose_index] = arr[(arr_index-1+N)%N];
//			System.out.println("삽입하려는 arr의 인덱스:"+(arr_index-1+N)%N);
//			System.out.println("삽입하려는 josephus의 인덱스:"+jose_index);
//			System.out.println("josephus["+jose_index+"]:"+josephus[jose_index]);
			arr[(arr_index-1+N)%N] = 0;
			jose_index++;
			
		}

		
		// 출력
		System.out.print("<");
		for (int i=0; i<N; i++) {
			System.out.print(josephus[i]);
			if(i==N-1)break;
			System.out.print(", ");
		}
		System.out.print(">");

	}
}