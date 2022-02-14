public class Test3 {


	public void execute(String msg) {
		// 구현 하세요.

		//교수님 코드 : nums가 cnt에 해당
		int [] nums = new int[0];
		for(int i=0; i<msg.length(); i++) {
			nums[msg.charAt(i)-'0']++;
			//'0'을 뺴야하는 이유 : 아스키코드'0'은 숫자값이 0 이아니라 48이므로.
			// 출처 : https://cokes.tistory.com/80
		}
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==0) continue;
			System.out.println(i+" : "+nums[i]);
		}
		
		
		
		
		
		// 1.문자열(String)을 문자 배열(char)로 변환
		char[] char_msg = msg.toCharArray();

		/*
		// 다른 방법 1. String -> int 배열
//		int[] msg_int = new int[msg.length()];
//		for(int i=0; i<msg.length(); i++) {
//			msg_int[i] = Integer.parseInt(msg[i]);
//		}
		 */
 		
		
		/*
		// 또 다른 방법 1. String문자열 -> char배열 -> int배열
//		char[] char_msg = new char[msg.length()];
//		for (int i=0; i<char_msg.length; i++) {
//			char_msg[i] = msg.charAt(i);
//		}
//		
//		int[] int_msg = new int[char_msg.length];
//		for (int i=0; i<int_msg.length; i++) {
//			int_msg[i] = (int)char_msg[i];
//		}
		 */
		
		// 2.cnt배열 : 각 숫자(index)가 출현한 횟수(values)
		int[] cnt = new int[10];
		for (int i=0; i<char_msg.length; i++) {	
			cnt[Character.getNumericValue((char_msg[i]))]++;
		}
		
		// 3. 1회 이상 출현한 숫자들만 출력
		for (int i=0; i<char_msg.length; i++) {
			if(cnt[i]>0) {
			System.out.printf("%d : %d\n",i,cnt[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Test3 c=new Test3();
		c.execute("53290539955364534323455987827332679340558347453272569584");
		System.out.println("=======");
		c.execute("13334444555557777777"); 
	}
}