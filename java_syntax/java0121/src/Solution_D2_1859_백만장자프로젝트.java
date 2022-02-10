import java.util.Scanner;

public class Solution_D2_1859_백만장자프로젝트 {

	// 풀이 법 : 매매가가 가장 비싼 날 전까지 1개씩 구매, 가장 비싼날 모두 판매
	//         남은 기간 중 매매가 가장 비싼 날 전까지 1개씩 구매, 가장 비싼날 모두 판매
	//		     남은 기간 중 매매가 가장 비싼 날이 첫 번째 날이면 아무것도 구매하지않고 하루 미룸.
	//         반복하면서, 남은 기간이 0 이면 종료. 
	
	// 구현 : 1. 매매가가 가장 비싼 날과 그 날의 매매가
	//      2. 매매가가 가장 비싼 날이 남은 기간 중 첫 번째 날인지 확인 후
	//      2-1. 첫번째 날이 아니면, 매매가가 가장 비싼 날 전까지 1개씩 구매
	//      2-2. 첫번째 날이 맞으면, 그 날은 아무것도 하지 구매도 판매도 하지않고 패쓰
	//		3. 남은 기간 동안 다시 반복
	//		4. 남은 기간이 없으면 반복문 탈출
	
	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		int T = scann.nextInt();	// 테케 수
		
		for (int i =0; i<T; i++) {	// 테케 수 만큼 반복
			
			int N = scann.nextInt();	// 매매 기간 입력
			int[] price = new int[N];	// 매매 날짜  별 매매가
			for (int j=0; j<N; j++) {
				price[j] = scann.nextInt();	
			}
			
			// 매매가가 가장 비싼 날과 그날의 매매가 (최고 매매가가 둘 이상 있을 경우, 훗날에 있는 것을 기준)
			int price_max_date = 0;
			int price_max = price[0];
			for (int k=0; k<price.length; k++) {
				if (price[k] >= price_max) {
					price_max=price[k];
					price_max_date = k;
				}
			}
			
			
			
			
			price_max
			
		}
		
	}

}
