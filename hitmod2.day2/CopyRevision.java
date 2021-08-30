package hitmod2.day2;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyRevision {

	public static void main(String[] args) {
		try(
		FileReader in  = new FileReader("temp.txt");
		FileWriter out = new FileWriter("copy.txt");
	){
		int i=0;
		char buffer[] = new char[6];
		while((i=in.read(buffer))!=-1) {
			System.out.println("No of Character read..."+i);
			String s= new String(buffer,0,i);
			System.out.println(s);
			out.write(buffer,0,i);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}
