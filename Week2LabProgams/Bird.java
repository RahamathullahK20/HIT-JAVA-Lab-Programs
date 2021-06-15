package week2lab.programs;
//A program in JAVA to create a class Bird also declares the different
//parameterized constructor to display the name of Birds.

class Bird {

	int age;
	String name;
	Bird(){
		System.out.println("This is the parrot");
	}
	Bird(String x){
		name=x;
		System.out.println("This is the "+name);
	}
	Bird(int y, String  z){
		age = y;
		name = z;
		System.out.println("This is the "+age+ "years "+name);
	}
	public static void main(String[] args) {
		Bird a=new Bird();
		//a.Bird();
		Bird b=new Bird("maina");
		Bird c=new Bird(20,"sparrow");
	}
	
}
