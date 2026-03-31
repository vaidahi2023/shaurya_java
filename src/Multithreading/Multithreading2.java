package Multithreading;

class Mythread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++) {
            System.out.println(i);
            try {
                Thread.sleep(5000);
            } catch(Exception e){}
        }
	}
}

public class Multithreading2 {

	public static void main(String[] args) {
		
		Mythread1 t=new Mythread1();
		t.start();
		
	}
}
