public class Test1 {
	public static void main(String[] args) {
		// 구현하세요.
		int n=5;
		for (int i=0; i<n; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.printf("*");
			};
			System.out.println();
		}
	}
}
