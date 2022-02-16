package algo0215;

import java.util.Scanner;

public class BOJ_Solution_1074_Z {

	static int N, r, c, cnt;
	
	public static void main(String[] args) {
		
		Scanner scann=new Scanner(System.in);
		N=scann.nextInt();
		r=scann.nextInt();
		c=scann.nextInt();
		cnt=0;
		z(0,0,1<<N); //w 한변의 길이
		
	}

	private static void z(int rr, int cc, int width) {
		if(rr==r && cc==c) {  // 찾는 위치 
			System.out.println(cnt);
			return ;
		}
		//범위내 (rr,cc)꼭지점에서 width 범위
		if(r>=rr && r<rr+width && c>=cc && c<cc+width) {
			int w=width/2;    // 반을 나눠서 
			z(rr,cc, w);  //11
			z(rr,cc+w, w);  //3
			z(rr+w,cc, w);  //7
			z(rr+w,cc+w, w);  //5
		}else {
			cnt+=width*width;
		}
	}

}