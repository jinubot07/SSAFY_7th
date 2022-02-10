package algo0209;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_D3_13428_숫자조작_mycode {
	
	static int[] arr;
	static int[] min;
	static int[] max;
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int testcase = scann.nextInt();
		for(int t=1; t<=testcase; t++) {
			// 입력받기 : 9자리이하 숫자를 입력받고 배열에 나누기
//			int N = scann.nextInt();

			// 입력받기 : 문자열로 받고, 아스키코드값으로 변환하여 int로 초기화
			String str = scann.next();
			arr = new int[str.length()];
			for(int i=0;i<str.length();i++) {
				arr[i] = str.charAt(i)-'0';
				//System.out.print(arr[i]+" ");
			}
			
			// 답안지 생성
			min = arr;
			max = arr;
			
			// 출력 : 문자열로 변환후 출력
			System.out.printf("#%d ",t);
			min(0,0);
	        String min_str = Arrays.toString(min);
	        min_str = min_str.substring(1,min_str.length()-1).replace(", ","");
	        System.out.print(min_str+" ");

			max(0,0);
			String max_str = Arrays.toString(min);
	        max_str = max_str.substring(1,max_str.length()-1).replace(", ","");
	        System.out.println(max_str);

			
/*			// 출력 : int형 배열 일일이 접근후 출력
			System.out.printf("#%d ",t);

			min(0,0);
			for(int i=0;i<str.length();i++) {
				System.out.print(min[i]);
			}
			System.out.print(" ");
			
			max(0,0);
			for(int i=0;i<str.length();i++) {
				System.out.print(max[i]);
			}
			
			System.out.println(" ");
*/
			//System.out.printf("#%d %d %d\n",t, ,);

		}

	}
	
	// 재귀 : 맨 앞자리가 큰자리일 때 까지
	private static void max(int front,int back) {	// front:앞쪽 바꿀 대상의 인덱스 (최대한 앞) , back:뒤쪽 바꿀 대상의 인덱스(최대한 큰 수)
		
		if(front == max.length) return;				// 루프 끝까지 다 돌았는데 첫번쨰 자리 수가 가장 큰 수여서 바꿀 필요가 없을 때. 
		
		// 배열 내 최고값의 인덱스 찾기
		for(int i=front+1; i<max.length; i++) {
			if(max[back]<max[i]) back = i;
		}
		
		// 최고값이 맨 앞에 있을 경우, 그 다음자리수가 최고값인지 확인(재귀)
		if(back == front) {
			max(front+1,back+1);
		}else {
			int temp = max[front];
			max[front] = max[back];
			max[back] = temp;
		}
		return ;
	}


	// 재귀 : 맨 앞자리가 작은 자리일 때 까지 + 맨 앞자리가 0이 아니어야한다.
	private static void min(int front, int back) {	// front:앞쪽 바꿀 대상의 인덱스 (최대한 앞) , back:뒤쪽 바꿀 대상의 인덱스(최대한 큰 수)
		
		if(front == min.length) return;				// 루프 끝까지 다 돌았는데 첫번쨰 자리 수가 가장 작은수 이거나, 뒷자리가 모두 0이어서 바꿀수없을떄.
		// 배열 내 최저값의 인덱스 찾기
		for(int i=front+1; i<min.length; i++) {		
			if(min[back]>min[i]) back = i;
		}
		
		// 최저값이 맨 앞에 있을 경우 + 최저값이 0인 경우, 그 다음자리수가 최저값인지 확인(재귀)
		if(back == front || (front==0 && min[back]==0)) {
			min(front+1,back+1);
		}else {
			int temp = min[front];
			min[front] = min[back];
			min[back] = temp;
		}
		
		return ;
		}

}
