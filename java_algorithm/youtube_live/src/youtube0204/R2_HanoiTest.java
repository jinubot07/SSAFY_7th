package youtube0204;

public class R2_HanoiTest {

	public static void main(String[] args) {
	}
	
	public static void hanoi(int n, int from, int temp, int to) {

		// 기저조건
		if (n==0) return;
		
		// n-1개의 원판 덩어리 temp기둥으로 이동 (n-1개의 원판덩어리 입장에서는 temp기둥이 목적지가됨.)
		hanoi(n-1,from, to, temp);
		// n번 원판 이동 to기둥으로 이동
		System.out.println(n+" : "+from+"->"+to);
		// n-1개의으 원판 덩어리 temp기둥에서 to기둥으로 이동 (n-1개의 원판 덩이라 입장에서는 temp기둥이 출발지가 됨.)
		hanoi(n-1,temp,from,to);
		}

}
