import java.util.Arrays;
import java.util.Scanner;

public class Solution_D1_2063_중간값찾기 {
	
	static int N;
	static int[] nums;
	
	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		int N=scann.nextInt();
		nums = new int[N];
		for(int i=0; i<N; i++) {
			nums[i]=scann.nextInt();
		}
		Arrays.sort(nums);
		System.out.println(nums[N/2]);
	}
}