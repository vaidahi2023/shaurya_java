package Collection;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> p=new PriorityQueue<Integer>();
		p.offer(20);
		p.offer(15);
		p.offer(40);
		System.out.println(p);
		p.poll();
		System.out.println(p);
		System.out.println(p.contains(20));
		System.out.println(p.contains(30));
		
	}
}
