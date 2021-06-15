package hit.day8;

import java.util.Scanner;

public class TernaryDemo {
	public static void main(String[] args) {
		//?- ternary operator
		//String result=(10<20)?"10 lesser than 20":"10 is not lesser than 20";
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter a number....");//user input 
		int i=sc.nextInt();
		//int i=11;//input
		String number=(i%2==0)?"Even number...":"odd number..";
		
		System.out.println("Number is ....."+number);
		//(expression) ? "true":"false";
	}
}
		
	
