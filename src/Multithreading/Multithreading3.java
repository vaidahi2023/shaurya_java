package Multithreading;
class Mythread2 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
public class Multithreading3 {

	public static void main(String[] args) {
		
		Mythread2 t=new Mythread2();
		Mythread2 t1=new Mythread2();
		
		t.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t.start();
		t1.start();
	}
}
