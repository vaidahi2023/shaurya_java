package Collection;

import java.util.LinkedList;

public class Linkedlist1 {

		public static void main(String[] args) {
			
			LinkedList<Integer> l=new LinkedList<Integer>();
			l.add(12);
			//l.add("hi");
			l.add(23);
			l.add(30);
			l.add(40);
			System.out.println(l);
			l.addFirst(20);
			l.addLast(23);
			System.out.println(l);
			l.removeFirst();
			System.out.println(l);
			l.removeLast();
			System.out.println(l);
			//l.clear();
			System.out.println(l);
			System.out.println(l.contains(23));
			System.out.println(l.contains(45));
			System.out.println(l.indexOf(23));
			System.out.println(l.get(0));
			System.out.println(l.getFirst());
			System.out.println(l.getLast());
			
		}
}
