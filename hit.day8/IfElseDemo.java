package hit.day8;

public class IfElseDemo {
	public static void main(String[] args) {
		int i=10;
		if(i>20) {
			System.out.println("i is less than 20");
		}
		else if(i==10){
			System.out.println("i is equal to ten...");
		}
		else {
			System.out.println("i is greated than 20");
	}
	
		IfElseDemo obj = new IfElseDemo();
		String result = obj.met(i);
		System.out.println("The result is ..."+result);
		
		boolean b=false;
		obj.met3(b);
		
		String str="hello";
		obj.met4(str);
	}
	
	String met(int i) {
		if(i==10 ||i<20) {
			return "Condition satisfied...";
		}
		else {
			return "condition not satisfied...";
		}
	}
	
	void met3(boolean valid) {//checking boolean value...
		if(valid) {
			System.out.println("the value od valid is true");
		}
		else {
			System.out.println("the value of valid is false...");
		}
	}
	
	void met4(String s) {
		if(s.equals("Hello")) {// equal and equalignoranceCase
			System.out.println("the value of string is hello...");
		}
		else {
				System.out.println("not equal....");
		}
	}
}
