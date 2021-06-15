package hit.day10;

public class inherDemo {

	public static void main(String[] args) {
		Employee p = new Attender();
		Engineer eng = new Engineer();

	}
}

class Employee{
	
}
//inheritance or generalization
class Engineer extends Employee{//child is a kind of parent...child can replace parent.
	
}

class Attender extends Employee{
	
}