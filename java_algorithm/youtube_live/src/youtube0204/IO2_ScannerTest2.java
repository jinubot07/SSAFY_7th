package youtube0204;

import java.util.Scanner;

public class IO2_ScannerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		System.out.print("몇 기?");
		System.out.println("==>SSAFY "+scann.nextInt()+"기");
		// 경우1. 구분자를 엔터가 아닌 스페이스를 사용할 경우, 구분자까지 함께 읽음.
		// next(), nextInt(), nextDouble()은 구분자space 직전까지 읽어들이고, 구분자를 별도로 처리하지 않음.
		// 두 번째 next(), nextInt(), nextDouble은 구분자space를 포함한 값을 읽어들이지만 자동으로 구분자를 제거해서 파싱 오류 발생X
		// 단 nextLine()의 구분자는 enter이기 때문에 space를 유효문자로 읽어들인다. 즉, space도 같이 출력한다.
		
		// 경우2. 구분자를 엔터로 줄 경우, 개행문자가 다음 입력에 영향을 주지 않도록 제거
		scann.nextLine();
		
		System.out.println("우리 기수를 나타내는 한마디?");
		System.out.println("==>"+scann.nextLine());
	}

}
