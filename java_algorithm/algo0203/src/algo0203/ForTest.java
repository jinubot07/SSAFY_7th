package algo0203;

import java.util.Arrays;
import java.util.Comparator;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class ForTest {

	public static void main(String[] args) {

		for (int i=0,j=3; i<5&&j<10; i++,j+=3) {// 동시에증가
			System.out.println("i:" + i+",j:" +j);
			
		}
			
		// 배열 선언방식
		int [] aa= {1,2,3,4}; 
		// aa= {1,2,3,4,5,6,7}	//재할당 불가능
		
		int [] ab= new int[] {1,2,3,4};	// 초기화 하면서
		ab = new int[] {1,2,3,4,5,6,7}; //재할당 가능
		
		
		// 깊은 복사, 주소복사
		int [] ac = new int[4];
		System.arraycopy(aa,0,ac,0,4);	//깊은 복사 ac를 바꿔도 aa는 관계없다.
		int [] ad = aa ; 	//얕은 복사 : 
		
		
		// 초기화 방법
		Arrays.fill(ac,-1);	//-1로 모두 초기화 하겠다.
		Arrays.sort(ac);
		
		Integer[] ia = new Integer[4];
		System.arraycopy(aa, 0, ia, 0, 4);	// 깊은 복사
		Arrays.sort(ia,Comparator.reverseOrder()); //
		
		// 향상된 파일 출력
		for(int a:ac) {
			System.err.println(a);
		}
	}
	
}
