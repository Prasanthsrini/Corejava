package codes;

public class SwappingWithoutVariable {

	public static void main(String[] args) {
	  
		int a =20,b=10;
		//expected output a=10 & b=20
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of A is "+a);
		System.out.println("Value of B is "+b);

	}

}
