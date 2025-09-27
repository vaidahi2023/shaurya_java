package shaurya_java;
class Am
{
	private int pr=1;
	protected int pro=10;
	public int pu=20;
	
}
public class Access {
	public static void main(String[] args) {
	
		Am e=new Am();
		//System.out.println("private="+e.pr);
		System.out.println("protected="+e.pro);
		System.out.println("pu="+e.pu);
	}
}
