package algo0214;

import java.util.Arrays;

public class SubsetTest1 {
	static int []p = {1,2,3,4,5};
	static int N=p.length;
	//static boolean[] v;		//<- 매개변수로 감
	static int count;
	
	public static void main(String[] args) {		
		//v = new boolean[N];	 // 필요없음
		subset(0,0);
		System.out.println(count);
	}
	
	
	private static void subset(int cnt, int total) {
		if(cnt==N) {			// 끝까지 다 돌아
			count++;
			System.out.println(total);
			return;
		}
		v[cnt] = true;
		subset(cnt+1,total+p[cnt]);		// 선택한 경우
		v[cnt]= false;
		subset(cnt+1,total);				// 선택 안할경우
		
	}
}
