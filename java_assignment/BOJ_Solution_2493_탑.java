// 백준은 제출시 class명을 Main으로 해야한다.
// 2022. 02. 07 과제
// BOJ 2493번 문항

import java.util.Scanner;

public class BOJ_Solution_2493_탑 {
	
	static int N;
	static int[] tower;
	static int[] signal;
	
	public static void main(String[] args) {
		// 입력받기
		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();
		tower = new int[N];
		signal = new int[N];
		for (int i=0; i<N; i++) {
			tower[i] = scann.nextInt();
			//System.out.print(tower[i]);
		}
		
		
		// 각 탑에서 보내는 신호를 받는 탑의 인덱스 구하기
		for (int i=0; i<N; i++) {		// 각 탑마다 구해야하니까
			signal[i] = recept(i);		// signal[i]에 i+1번째 탑(index=i)이 보내는 신호를 받는 탑의 위치(index+1)를 반환값으로 넣어줌.
		}
		
		// 결과 출력
		for (int i=0; i<N; i++) {
			System.out.print(signal[i]);
			if(i==N-1) {break;}
			System.out.print(" ");
		}
	}
	
	public static int recept(int send) {	// 파라미터 : 신호를 보낸 탑의 index값
		if(send == 0) return 0;				// 첫 번쨰 탑에서 보내는 신호는 어떤 탑도 수신 할 수 없다.
		for(int i=send-1; i>=0; i--) {		// 수신하려는 (왼쪽)탑의 높이와 신호를 보낸 탑의 높이를 비교한다.
			if(tower[i] >= tower[send]) {	// 수신하려는 탑의 높이가 신호를 보낸 탑의 높이보다 높거나 같으면 그 탑의 index+1리턴
				return i+1;
			}
											// 수신하려는 탑의 높이가 신호를 보낸 탑의 높이보다 작으면 그 다음 왼쪽탑으로 이동
		}
		return 0;
	}
}
