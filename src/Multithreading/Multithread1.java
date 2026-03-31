package Multithreading;

class Mt1 implements Runnable 
{

	public void run() {
		System.out.println("it is runnable interface");
	}
	
}
public class Multithread1 {
	public static void main(String[] args) {
	
			Thread m=new Thread(new Mt1());
			m.run();
	}
}
