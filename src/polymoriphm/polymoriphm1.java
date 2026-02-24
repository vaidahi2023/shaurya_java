package polymoriphm;

//poly -- same
//moriphm  --different type /form 
//types of polymoriphm
//1.complie time polymoriphm
////		--method overloading
//		-- same name with different argument
//2.run time polymoriphm
//		-- method overriding
//  	-- same name different class 
//complie time polymoriphm
public class polymoriphm1 {

	void sum(int a,int b)
	{
		int sum=0;
		sum=a+b;
		System.out.println("sum="+sum);
	}
	void sum(int a,int b,int c)
	{
		int sum=0;
		sum=a+b+c;
		System.out.println("sum="+sum);
	}
	public static void main(String[] args) {
		
		polymoriphm1 p=new polymoriphm1();
		p.sum(12, 10);
		p.sum(12, 10, 40);
		
		
	}
}
