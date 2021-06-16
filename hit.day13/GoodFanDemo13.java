package hit.day13;

import java.util.Scanner;

public class GoodFanDemo13 {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	GoodFan khaitan =new GoodFan();
	while(true) {
		System.out.println("Press key and then enter for pulling chain...");
		scan.next();
		khaitan.pull();
	}
	}

}
class GoodFan{
	State state =new SwitchOffState();//association
	public void pull() {
		state.pull(this);
}
abstract class State{
	public abstract void pull(GoodFan fan);//{}
}
class SwitchOffState extends State{//condition class grouped under a category 
	public void pull(GoodFan fan) {
		System.out.println("Switch on state...");
		fan.state=new SwitchOnState();
	}
}
class SwitchOnState extends State{
	public void pull(GoodFan fan) {
		System.out.println("medium speed state......");
		fan.state=new MediumSpeedState();
	}
}
class MediumSpeedState extends State{
	public void pull(GoodFan fan) {
		System.out.println("high speed state.....");
		fan.state =new HighSpeedState();
	}
}
class HighSpeedState extends State{
	public void pull(GoodFan fan) {
		System.out.println("swtich off state.....");
		fan.state=new SwitchOffState();
}
}
}