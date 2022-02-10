import java.util.Scanner;

public class Solution_D2_1204_최빈수구하기 {

	static int T;
	static int[] array;
	
	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		T=scann.nextInt();
		for (int t=1; t<=T; t++) {
			int num = scann.nextInt(); // 저장할 필요없다면 int num = 부분은 생략 가능
			array = new int[1000+1];
			for (int i=0; i<args.length; i++) {
				int n=scann.nextInt();
				array[n]++;
			}
			int max =-1;
			int index = -1;
			for(int i=0; i<array.length; i++) {
				if(array[i] >= max) {
					max = array[i];
					index = i;
				}
			}
			
			System.out.println("#"+t+" "+index);
		}
	}
}
