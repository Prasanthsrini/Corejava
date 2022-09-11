package codes;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		int num;
		int count=0;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to check prime or not");
		num=s.nextInt();
		
		if(num>1){
			for(int i=1;i<=num;i++) {
				if(num%i == 0)
				count++;
			}
			if(count ==2) {
				System.out.println("It is Prime number");
			}
			else {
				System.out.println("It is not prime number");
			}
			
		}

	}

}
