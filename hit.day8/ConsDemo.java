package hit.day8;

//constructor overloading...
public class ConsDemo {

	public ConsDemo() {
		System.out.println("cons called...");
	}
	
	public ConsDemo(int i) {
		System.out.println("overloaded cons called...");
	}
	public ConsDemo(String s) {
		System.out.println("string constructor called...");
	}
	
	public ConsDemo(int s,String str) {
		System.out.println("multi parameter constructor called...");
	}
	public static void main(String[] args) {
		ConsDemo obj1 = new ConsDemo(1,"hello");
		ConsDemo obj2 = new ConsDemo();
		
		obj2.met();
		obj2.met(1);
		obj2.met("hello");
		obj2.met(1,"Hello");
		//the name of the concept is - VMI(Virtual Method Invocation)
		//only one constructor can be called when one object is created..
	}
	
	void met() {
		System.out.println("method without parameter called...");
	}
	
	void met(int i) {
		System.out.println("method with parameter called...");
	}
	
	void met(String str) {
		System.out.println("method with parameter called...");
	}
	
	void met(int s,String str) {
		System.out.println("multi parameter constructor called...");
	}
}