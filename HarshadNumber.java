package codes;
public class HarshadNumber {

	public static void main(String[] args) {
		// Harshad numbers 1 to 10, 12, 18, 20, 21, 24
		int num=12;
		int sum=0;
		int temp;
		int original=num;
		
		while(num!=0) {
			temp=num%10;
			sum=sum+temp;
			num=num/10;
		}
		if(original % sum ==0) {
			System.out.println("It is Harshad Number");
		}else {
			System.out.println("It is not an Harshad Number");
		}

	}

}
