package algo0207;

import java.util.Scanner;
import java.util.Stack;

public class SWEA_Solution_D4_1218_괄호짝짓기 {
	
	static int T =10;
	static int L;
	static char[] g= {'(','[','{','<'};
	static char[] e= {')',']','}','>'};
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		for (int t=1; t<T; t++) {
			Stack<Character> stack = new Stack();
			L = scann.nextInt();
			String s = scann.next();
				char[] sc = s.toCharArray();
			boolean isS = true;
			
			for (int i=0; i<L; i++) {
				String string = args[i];
				// 읽은 문자가 ( [ { < 인가? -> 맞으면 stack에 넣는다.
				// if(){}
				// else{}
				// 스태겡 문자가 있고 짝이 맞는가?
			}		
			if(!stack.isEmpty()) {
				isS=false;
			}
			System.out.println("#"+t+" "+(isS?1:0));
		}
	}
}
