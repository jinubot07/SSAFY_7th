// Greedy Algorithm : Tip감각적으로 찾기
package algo0215;

import java.util.Scanner;

public class BOJ_Solution_2839_설탕배달 {
	
	static int N;
	static int min;
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();
		min = Integer.MAX_VALUE;
		
		/* 메소드 이용X
		 * for(int i=0; i<N/5; i++){
		 * 		if((N-i*5)%3 == 0){
		 * 			min=Math.min(min, i+(N-i*5)/3);
		 * 		}
		 * }
		 */
	
		sugamove(N,0,0);
		System.out.println(min==Integer.MAX_VALUE?-1 : min);
		
		
/*		// my wrong code
		if((N%5 !=0) && (N%3==0) ) {
			min = N/3;
			System.out.println(min);
		}
		
		else{
			if(N%5 == 0) {
				min = N/5;
			}else {
				min = N/5;
				if((N%5)%3 == 0) {
					min += (N%5)/3;
					System.out.println(min);
				}else {
					System.out.println(-1);;
				}
			}
		}
*/
	}

	private static void sugamove(int weight, int f, int t) {		//three five
		
		if(weight<0) {					//가능한 푸르닝
			return;	
		}
		if(weight==0) {
			min = Math.min(min, f+t);
			return;
		}
		sugamove(weight-5, f+1, t);		// 5kg짜리 설탕 짐 추가
		sugamove(weight-3, f, t+1);		// 3kg짜리 설탕 짐 추가
	}

}
