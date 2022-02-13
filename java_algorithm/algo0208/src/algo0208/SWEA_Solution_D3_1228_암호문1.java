// SWEA

package algo0208;

import java.util.Scanner;

public class SWEA_Solution_D3_1228_암호문1 {

	static int[] arr;
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);

		//while((N = scann.nextInt()) != null) {	// 더 이상 입력되는 테스트 케이스가 없으면 루프 탈출
		for(int t=1; t<=1;t++) {				// 10개의 테스트케이스
			int N = scann.nextInt();			// 첫번째 줄 : 원분 암호문의 길이 입력
			arr = new int[N];
			for (int i=0; i<N; i++) {			// 두번째 줄 : 원본 암호문 입력
				arr[i] = scann.nextInt();
				//System.out.println("원본 암호문:"+arr[i]);
			}
			
			int M = scann.nextInt();			// 세번째 줄 : 명렁어 개수
			for (int i=0; i<M; i++) {			// 네번째 줄 : 명령어
				String I = scann.next();
				int add_index = scann.nextInt();
				int howmany = scann.nextInt();
				int[] add_arr = new int[howmany];
				for(int j=0; j<howmany; j++) {
					add_arr[j] = scann.nextInt();
					//System.out.println("추가 암호문:add_arr["+j+"]:"+add_arr[j]);
				}
			
				// 암호문 삽입하기
				// 1. 추가 암호문이 들어오기전 추가 암호문의 길이만큼 뒤로 밀어두기
				int d=0;
				while(add_index+howmany+d<10) {	// 추가 암호문으로 10자리가 넘어가면 원본 암호문 의미X
					arr[add_index+howmany+d] = arr[d];
					d++;
				}
				
				// 2. 삽입 위치에 추가 암호문 값 넣기 (삽입위치 : 배열 arr의 add_index인덱스, 추가 암호문 값: 배열 add_arr의 인덱스 0~howmany에 저장된 값)			
				for(int k=0; k<howmany; k++) {
					if(add_index+howmany+k>9) break;
//					System.out.print("추가 암호문:add_arr["+k+"]:"+add_arr[k]);
//					System.out.println(" 원본 암호문:arr["+k+"]:"+arr[k]);
//					System.out.println("add_index:"+add_index+" k:"+k);
					arr[add_index+k] = add_arr[k];
				}
			}
			
			for(int i=0; i<10; i++) {
				System.out.print(arr[i]+" ");
			}
			
		}
		
		
	}

}
