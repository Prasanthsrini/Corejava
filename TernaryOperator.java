package codes;

public class TernaryOperator {

	public static void main(String[] args) {
		Integer num1=10;
		Integer num2=40;
		Integer num3=30;
		
		Integer lar=(num1>num2&&num1>num3)?num1:(num2>num1&& num2>num3)?num2:num3;
		
		System.out.println("The Largest number is : "+lar);

	}

}
