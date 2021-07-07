package hit.day28;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
			
		Stack<String> Basic = new Stack<>();
		Basic.push("hello");
		Basic.push("world");
		Basic.push("program");
		Basic.push("welcome");
	
		System.out.println(Basic);
		
		Basic.pop();
		System.out.println(Basic);
		
	}
}