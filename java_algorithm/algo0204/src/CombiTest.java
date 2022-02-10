import java.util.Arrays;

public class CombiTest {

	static int[] p = {1,2,3,4,5,6};
	static int N = p.length;
	static int R;
	static int [] nums;
	static int count;
	
	public static void main(String[] args) {
		R=3;
		nums=new int[R];
		//Arrays.fill(nums,0);
		go(0,0); //지역변수
		System.out.println(count);
	}

	private static void go(int cnt,int start) {
		// basis condition
		if(cnt==R) {
			count++;
			System.out.println(Arrays.toString(nums));//타입 골뱅이 해쉬코드 참조변수이므로
			return;			
		}

		// 유도 코드 : start 다움부터 진행
		for (int i=start; i<N; i++) {
			nums[cnt] = i;	
			go(cnt+1,i+1);
		}
		
	}
}
