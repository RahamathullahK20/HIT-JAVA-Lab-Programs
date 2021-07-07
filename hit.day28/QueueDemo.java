package hit.day28;

//Queue Collections

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
			Queue<String> queue=new LinkedList<>();
			queue.add("one");
			queue.add("two");
			queue.add("three");
			
			System.out.println(queue);
			
			queue.remove();
			System.out.println(queue);

	}

}
