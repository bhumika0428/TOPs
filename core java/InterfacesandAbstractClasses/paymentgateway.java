package InterfacesandAbstractClasses;

interface paymentgate
{
	boolean processPayment(double amount,String recipient);
}
class creditcard implements paymentgate
{
	private String cardnumber;
	private String cardholdername;
	public creditcard(String cardnumber, String cardholdername) {
		super();
		this.cardnumber = cardnumber;
		this.cardholdername = cardholdername;
	}
	@Override
	public boolean processPayment(double amount, String recipient) {
		// TODO Auto-generated method stub
		System.out.println("Processing Credit Card payment...");
        System.out.println("Card Holder: " + cardholdername);
        System.out.println("Payment Amount: $" + amount);
        System.out.println("Payment to: " + recipient);
		return true;
	}
	
}
class paypal implements paymentgate
{
	String email;

	public paypal(String email) {
		super();
		this.email = email;
	}

	@Override
	public boolean processPayment(double amount, String recipient) {
		// TODO Auto-generated method stub
		 System.out.println("Processing PayPal payment...");
	        System.out.println("PayPal Account: " + email);
	        System.out.println("Payment Amount: $" + amount);
	        System.out.println("Payment to: " + recipient);
		return true;
	}

	
	
}
class bankTransfer implements paymentgate
{

	private String bankAccountNumber;
    private String bankName;
    
	public bankTransfer(String bankAccountNumber, String bankName) {
		super();
		this.bankAccountNumber = bankAccountNumber;
		this.bankName = bankName;
	}

	@Override
	public boolean processPayment(double amount, String recipient) {
		 System.out.println("Processing Bank Transfer payment...");
	        System.out.println("Bank Account: " + bankAccountNumber + " (" + bankName + ")");
	        System.out.println("Payment Amount: $" + amount);
	        System.out.println("Payment to: " + recipient);
		return true;
	}
	
}
public class paymentgateway  {

	public static void main(String[] args) {
		paymentgate paypalobj= new paypal("bhumika@gmail.com");
		paypalobj.processPayment(347689.0,"bhumika" );
		
		paymentgate creditcardobj= new creditcard("87779878787", "sahin");
		creditcardobj.processPayment(3567.9, "mesho");
		
		paymentgate  bankobj =new bankTransfer("475874878", "sbi");
		bankobj.processPayment(4544, "mesho");
	}

	
}
