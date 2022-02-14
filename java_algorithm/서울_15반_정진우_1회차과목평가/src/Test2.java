import java.lang.Math;

public class Test2 {
	public static void main(String[] args) {
		int[] su = { 45, 80, 68, 19, 34, 55, 27, 60, 27, 18 };
		// 구현하세요.
		// 1. 평균 구하기
		int sum=0;
		for (int i=0; i<su.length; i++) {
			sum += su[i];
		}
		double avg = sum/(double)su.length;
		
		// 2. gap배열을 선언 및 초기화하기
		double[] gap = new double[su.length];
		for(int i=0; i<su.length; i++) {
			gap[i] = Math.abs(su[i]-avg);
		}
		
		// 3. gap배열에서 최솟값 구하고, 최솟값인 배열의 인덱스 구하기
		int index=0;
		double min_gap=Math.abs(su[0]-avg);
		for(int i=0; i<gap.length; i++) {
			if(min_gap>gap[i]){
				min_gap = gap[i];
				index = i;
			}
		}
		
		// 교수님코드 2+3.
		for (int i=0; i<su.length; i++) {
			if(min_gap>=Math.abs(avg-su[i])) {
				min_gap = Math.abs(avg-su[i]);
				index = i;
			}
		}
		
		
		// 4. 출력
		System.out.println(avg+" "+su[index]);
	}
}
