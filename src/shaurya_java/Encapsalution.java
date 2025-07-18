package shaurya_java;

//what is Encapsalution
//Encapsalution  is the process of wrapping data in single unit .

class D1
{
	private int x;
	void setx(int x)
	{
		this.x=x;
	}
	int getx()
	{
		return x;
	}
}

public class Encapsalution {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			D1 d=new D1();
			d.setx(12);
			System.out.println("x="+d.getx());
	}

}
