import java.util.Scanner;

public class Solution_D2_1204_최빈수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T=0;
		int N=0;
		int[] nums;
		Scanner scann=new Scanner(System.in);
		T=scann.nextInt();
		for (int t=1; t<T; t++) {
			N=scann.nextInt();
			nums=new int[100+1];
			for (int i=0; i<1000; i++) {
				int temp=scann.nextInt();
				nums[temp]++;
			}
			
		}
	}

}
