package Exception;


public class ExceptionD {

	
	public static void main(String[] args) {
		
		int a=10,b=0,ans=0;
		try
		{
			ans=a/b;
			System.out.println("it is try block");
		}catch (Exception e) {
			System.out.println("divide by zero is not possible");
		}
		
	}
	
	
}
