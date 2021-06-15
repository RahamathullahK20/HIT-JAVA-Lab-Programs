package hit.day8;

public class Service108 {

		void help(Police p) {
			System.out.println("the caller is a police man..");
		}
		void help(AccidentVictim a) {
			System.out.println("the caller is a accident victim...");
		}
		void help(Helper h) {
			System.out.println("the caller is helper...");
		
		//void help(Object o) {
		//	if(o instanceof Police) {
		//		System.out.println("Police");
		//	}
		//	else if (o instanceof AccidentVictim) {
		//		System.out.println("AccidentVictim");
		//	}
		//	else if (o instanceof Helper) {
		//		System.out.println("Helper");
		//	}
		}
		
		public static void main(String[] args) {
			Service108 obj108= new Service108();
			Police captain = new Police();
			AccidentVictim ac = new AccidentVictim();
			Helper ramasamy = new Helper();
			
			obj108.help(ramasamy);
		}
}
class Police{
	
}
class AccidentVictim{
	
}
class Helper{
	
}