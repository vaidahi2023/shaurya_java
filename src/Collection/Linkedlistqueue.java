package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Linkedlistqueue {

	public static void main(String[] args) {
		
		Queue<Integer> q=new LinkedList();
		q.offer(12);
		q.offer(13);
		q.offer(16);
		System.out.println(q);
//		q.poll();
//		System.out.println(q);
//		System.out.println(q.peek());
//		q.poll();
		System.out.println(q);
		
		Iterator<Integer> i=q.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
