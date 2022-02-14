/*
Test4.java : 팀원 평균

[테스트케이스]

5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) throws FileNotFoundException {
		
		// 교수님 코드
		Scanner in = new Scanner(new File("Test4.txt"));
		int T = in.nextInt();	// T : testcase
		for(int i=0; i<T; i++) {	 // i : testcase이동
			int N = in.nextInt();	 // N : 팀원수
			int[] nums = new int[N]; // nums : 점수
			double avg = 0.0;
			int tot=0;
			int cnt=0;
			for(int j=0; j<N; j++) {
				nums[j]=in.nextInt();	// 각 팀원들의 점수 읽기
				tot += nums[j];			// 평균을 구하기 위한 합계
			}
			avg = 1.0 * tot / N;
			for (int j=0; j<N; j++) {
				if(avg<nums[j]) {
					cnt++;				// 각 팀마다 평균미달인 팀원의 수
				}
			}
			System.out.printf("#%d %.3f%%\n",i+1,(100.0*cnt/N));

		}
		
		
		
		Scanner in = new Scanner(new File("Test4.txt"));
		int testcase = in.nextInt();	// 5 입력
		
		// 1. 배열을 만들어 저장한 후, 평균 구하기
		// 배열을 testcase만큼 만들고, 각 배열의 크기는 팀원수만큼 할당
//		int sum = 0;		// 문제점 : '각 팀마다 팀의 평균을 넘는 학생'
							// 해결 : 내 코드는 '전체 팀원들의 평균'을 계산했기때문에 반복문 밖에서 선언했지만
							//       '각 팀마다' 계산을 해야하는 거기때문에 팀이 바뀔때마다 새롭게 초기화 해줘야한다.
//		int tot_member = 0;
//
//		for(int i=0; i<testcase; i++) {
//			int team_member = in.nextInt();
//			int[][] score = new int[testcase][team_member];
//			tot_member += team_member;
//			for (int j=0; j<team_member; j++) {
//				score[testcase][j] = in.nextInt();
//				sum += score[testcase][j];
//			}
//		}
//		double avg = sum/(double)tot_member;
//		System.out.println("avg:"+avg);

		
//		// 1. 입력받은대로 바로 평균 구하기
		int sum = 0;
		int tot_member = 0;
		int score = 0;
		for (int i = 0; i < testcase; i++) {
			// 구현 하세요
			int team_member = in.nextInt();
			tot_member += team_member;
			for (int j=0; j<team_member; j++) {
				score = in.nextInt();
				sum += score;
				//tot_member++;
			}
		}
		double avg = sum/(double)tot_member;
		System.out.println("avg:"+avg);

		in.close();
	}
}
