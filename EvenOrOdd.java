package codes;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		int number,reminder;
		Scanner scan=new Scanner(System.in);	
		System.out.println("Enter the number to check it is even or odd");
		number=scan.nextInt();
		
		reminder=number%2;
		
		if(reminder==0) {
			System.out.println(number+" is a Even number.");
		}
		else {
			System.out.println(number+" is a Odd number.");
		}
		
	}

}
