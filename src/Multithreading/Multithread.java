package Multithreading;

//Multithreading in Java is a feature that enables a program to run multiple threads simultaneously, 
//allowing tasks to execute in parallel and utilize the CPU more efficiently. 
//A thread is a lightweight, independent unit of execution inside a program (process).
//A process can have multiple threads.
//Each thread runs independently but shares the same memory.

//ways to create Thread
//1.thread class
//2.interface runnable

class Multithread extends Thread
{
	public void run()
	{
		System.out.println("running method of thread"+getName());
	}
	public static void main(String args[])
	{
		
		Multithread m=new Multithread();
		Multithread m1=new Multithread();
		Multithread m2=new Multithread();
		m.start();
		m1.start();
		m2.start();
		
	}
}
