package Collection;

import java.util.ArrayDeque;

public class ArraydequeueExample {

	public static void main(String[] args) {
			
		ArrayDeque<String> a=new ArrayDeque<String>();
		a.offer("riya");
		a.offerFirst("diya");
		a.offerLast("krishna");
		System.out.println(a);
		//a.clear();
		System.out.println(a);
		System.out.println(a.peek());
//		a.poll();
		System.out.println(a);
		a.pollFirst();
		a.pollLast();
		System.out.println(a);
	}
}
