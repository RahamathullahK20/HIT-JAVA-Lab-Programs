package week2lab.programs;

public class whileLoopDemo {

	public static void main(String[] args) {
		int x = 1, sum=0;
		while(x<=10) {
			sum=sum+x;
			x++;
		}
		System.out.println("Summation: " + sum);
	}
}
