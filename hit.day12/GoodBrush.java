package hit.day12;

public class GoodBrush {

	public static void main(String[] args) {
		GoodPaintBrush brush = new GoodPaintBrush();
		RedPaint rp=new RedPaint();
		Bluepaint bp=new Bluepaint();
		GreenPaint gp=new GreenPaint();
		
		brush.rp=rp;
		brush.doPaint();

	}
}
class GoodPaintBrush{//in this paintbrush the code is not modified whenever a new color is chosen
	Paint rp;
	public void doPaint(){
		System.out.println(rp);
	}
}

class BadPaintBrush{// in this paintbrush the code gets modified whenever a new color is chosen
	public void doPaint(int choice) {
		if(choice==1) {
			System.out.println("red colour...");
		}
		else if(choice==2) {
			System.out.println("blue colour...");
		}
		else if(choice==3) {
			System.out.println("green colour...");
		}
	}
}

class Paint{
	
}
class RedPaint extends Paint{
	
}
class Bluepaint extends Paint{
	
}
class GreenPaint extends Paint{
	
}