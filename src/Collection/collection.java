package Collection;

import java.util.ArrayList;

//collection is a framework in java
//collection interface in java.util package
//types of collection
//1.list
//2.queue --
//3.set
//list -- arraylist,linkedlist
//queue--linkedlistqueue,arraydeque,priporityqueue

public class collection {

	
public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(12);
		a.add(13);
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(2);
		a1.add(3);
//		a.remove(0);
//		a.removeAll(a);
		a.addAll(a1);
//		a.clear();
		a.contains("2");
		a.set(0, 15);
		System.out.println(a);
		System.out.println(a.contains(2));
		System.out.println(a.indexOf(3));
		System.out.println(a.size());
		System.out.println(a.get(0));
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		for(int n:a)
		{
			System.out.println(n);
		}
		
		
	}

}
