package hit.day14;

public class RedoDogProgram {

	public static void main(String[] args) {
		Child ramu = new Child();
		Dog tiger =new Dog();
		Item item =new Stone();
		ramu.playWithDog(tiger, item);

	}
}
abstract class DogExceptions extends Exception{
	
}
class DogBiteException extends DogExceptions{
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;
	}
	public String toString() {
		return this.msg;
	}
}
class DogBarkException extends DogExceptions{
	String msg;
	public DogBarkException(String msg) {
		this.msg=msg;
	}
	public String toString() {
		return this.msg;
	}
}
abstract class Item{
	public abstract void execute()throws DogExceptions;
}
class Stick extends Item{
	public void execute()throws DogExceptions{
		throw new DogBiteException("You beat I bite.....");
	}
}
class Stone extends Item{
	public void execute()throws DogExceptions{
		throw new DogBarkException("You hit i bark....");
	}
}
class Dog{
	public void play(Item item)throws DogExceptions{
		item.execute();
	}
}
class Child{
	public void playWithDog(Dog tiger,Item item) {
		try {
			tiger.play(item);
		}catch(DogExceptions de) {
			System.out.println(de);
		}
	}
}
