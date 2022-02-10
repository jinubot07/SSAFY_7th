package algo0210;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution_1158_오세푸스 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int N = scann.nextInt();
		int K = scann.nextInt();
		ArrayList<Integer> origin = new ArrayList<>();
		ArrayList<Integer> jose = new ArrayList<>();
		
		for (int i=1; i<N+1; i++) {
			origin.add(i);			
		}
		int loc=0;
		while(!origin.isEmpty()) {
			loc = (loc+K-1)%origin.size();
			jose.add(origin.remove(loc));
		}
		
		System.out.print("<");
		for (int i=0; i<jose.size()-1; i++) {
			System.out.print(jose.get(i)+",");
		}
		System.out.println(jose.get(jose.size()-1)+">");

	}

}
