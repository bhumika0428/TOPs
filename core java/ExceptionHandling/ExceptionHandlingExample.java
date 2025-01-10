package ExceptionHandling;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int number[]= {10,20,30};
		try {
			int result=number[40];
			System.out.println("the result is:"+result);
			
		}catch (ArrayIndexOutOfBoundsException aex) {
			 System.out.println("error message "+aex.getMessage());
		}
		catch (Exception e) {
			System.out.println("exception"+e);
		}
		finally {
			System.out.println("final block");
		}
		System.out.println(" exception handling.");
	}
}
