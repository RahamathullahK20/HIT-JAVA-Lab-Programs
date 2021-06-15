package hit.day7diff;

import hit.day7.AccessModDemo;

public class AccessDemoDiffPackSubClass extends AccessModDemo {

	void met() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(nomod);
		System.out.println(pri);
	}
}
//private is class scope
//no modifier is package scope
//protected is relationship(inheritance) scope
//public is global scope
class AccessDemoDiffPackageNonSubClass {
	
	void met() {
		AccessModDemo obj=new AccessModDemo();
		System.out.println(obj.pub);
		System.out.println(obj.pro);
		System.out.println(obj.nomod);
		System.out.println(obj.pri);
	}
}
