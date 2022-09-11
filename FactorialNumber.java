package codes;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// 4*3*2*1 =24
		int number;
		long factorial=1;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to find factorial");
		number=scan.nextInt();
		
		if(number < 0) 
			System.out.println("No negative values can perform the factorial");
		
		else if(number <= 1)
			System.out.printf("%d!=%d",number,factorial);	
		
		else {
			for(int counter=1;counter<=number;counter++) {
				factorial=factorial*counter;
			}
			System.out.printf("The factorial of %d is %d ",number,factorial);
		}

	}
}

