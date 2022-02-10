import java.util.Scanner;

public class Main_2438_별찍기1 {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Scanner scann = new Scanner(System.in);
		int N = scann.nextInt();
		
		for (int i=0; i < N; i++) {
			for (int j=0; j < i+1; j++) {
				System.out.print("*");
				}
			System.out.println();
			}
		}
}
