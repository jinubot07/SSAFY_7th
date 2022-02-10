package youtube0208;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class StackBrowserTest {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Stack<String> backward = new Stack<String>();
		Stack<String> forward = new Stack<String>();
	
		String current = "http://www.ssafy.com";

		// 횟수를 정확히 안다면  for문, 모른다면 while문
		while(true) {
			String input = in.readLine();
			// V http://www.google.com에서 첫글자(V)만 받아들인다.
			if(input.charAt(0)=='Q') break;
			
			// 공백을 기준으로 문자열을 구분한다.
			StringTokenizer st = new StringTokenizer(input," ");
			
			switch(st.nextToken()) {
			case "V": // visit방문처리
				backward.push(current);
				forward.clear();		// 새로운 페이지 접속시마다 forward스택에 있는 데이터를 모두 다 날려야한다.
				current = st.nextToken();
				break;
			case "B":
				if(backward.isEmpty()) {	// backward스택이 비어있으면 버튼 비활성화
					System.out.println("Ignored..");
					continue;		// 왜 break가 아니라 continue이지?
				}
				forward.push(current);
				current = backward.pop();
				break;
			case "F":
				if(forward.isEmpty()) {
					System.out.println("Ignored..");
					continue;
				}
				backward.push(current);
				current = forward.pop();
				break;
			}
			
			System.out.println("current URL:" + current);
			
		}
	
		
		
	}
}
