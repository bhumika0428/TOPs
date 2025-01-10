package PackagesandAccessModifiers;

public class accessmodifiersmain {

	public static void main(String[] args) {
		
		accessmodifiers obj=new accessmodifiers();
		System.out.println("access modifiers using public field "+obj.a);
		obj.publicmethod();
		
		System.out.println("access modifiers using private ");
		obj.privatemethod();
		
		System.out.println("access modifiers using protected field "+obj.b);
		obj.protectedmethod();
		System.out.println("access modifiers using default field "+obj.d);
		obj.defaultmethod();
		
		
	}
}
