package Exception;

public class Exception2 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		
		try
		{	
			System.out.println("a[5]="+a[5]);
			System.out.println("try block");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array error");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally 
		{
			System.out.println("finnaly block");
		}
		
	}
}