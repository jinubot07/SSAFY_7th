package java0127;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadTest2 {
	
	public static void main(String[] args) {
	
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		String line="";
		try {
			while((line=br.readLine())!=null) {	// EOF -> ctrl+c -> ctrl+x or ctrl+z
			
				System.out.println(line);
			}
		} catch(IOException e) {
			System.out.println(e);
		} catch(Exception e){
			System.out.println(e);
		}
		
		// overriding 아들의 접근제한자는 부모의 접근제한자보다 같거나 커야한다.
		// overriding 부몬의 자식의 보다 같거나 커야한다.
		// 자식 -> 장점은 취하고, 단점은-> 수정한다.
		
		// overriding 안되는 것 : static 하고 변수, 
		// 부모와 똑같은 자식이  있을떄, 메소드가 불린고셍 시작함.
		
		// ctrl + z로 프로그램 종료
	}
}
