package D_V_O;

public class DatatypeDemo {
	
	public static void main(String[] args) {
		
	
		System.out.println("***BooleanDataTypes***") ;
	  boolean var1 = true;
      if (var1 == true) 
      {
          System.out.println("Boolean value is True");
      }
      else
      {
          System.out.println("Boolean value is False");  
      }
	
	System.out.println("***CharDataType***");
	char ch1 = 'A';
    char ch2 = 'd';
    System.out.println(ch1);
    System.out.println(ch2);
    
    
    System.out.println("***IntegerDataTypes***");
    int a = 10;
    short s = 2;
    byte b = 6;
    long l = 125362133223l;
 
    System.out.println("The integer variable is " + a + '\n');
    System.out.println("The short variable is " + s  + '\n');
    System.out.println("The byte variable is " + b + '\n');
    System.out.println("The long variable is " + l);
    
    System.out.println("***FloatDataTypes***");
    float f = 65.20298f;
    double d = 876.765d;
 
    System.out.println("The float variable is " + f);
    System.out.println("The double variable is " + d);
	}
}

