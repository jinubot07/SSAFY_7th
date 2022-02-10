package youtube0207;

import java.util.Stack;

public class StackAPITest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		System.out.println(stack.size()+"//"+stack.empty());
		stack.push("A");
		stack.push("B");
		stack.push("C");

		System.out.println(stack.size()+"//"+stack.empty());
		System.out.println(stack.pop());
		System.out.println(stack.size()+"//"+stack.empty());
		System.out.println(stack.peek());
		System.out.println(stack.size()+"//"+stack.empty());
		System.out.println(stack.pop());
		System.out.println(stack.size()+"//"+stack.empty());
		System.out.println(stack.pop());
		System.out.println(stack.size()+"//"+stack.empty());
		// 공백스택인 상황
		
		
		System.out.println(stack.pop());
		
	}
}
