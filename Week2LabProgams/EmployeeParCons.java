package week2lab.programs;

public class EmployeeParCons {
	
	int empId;
	String empName;
	//parameterized Constructor with two parameters...
	EmployeeParCons(int id,String name){
		this.empId = id;
		this.empName = name;
	}
	void info() {
		System.out.println("Id: "+empId+" \tName: "+empName);
	}
	public static void main(String[] args) {
		EmployeeParCons obj1 = new EmployeeParCons(10245, "Chaitanya");
		EmployeeParCons obj2 = new EmployeeParCons(93232,"Negan");
		obj1.info();
		obj2.info();
	}
}
