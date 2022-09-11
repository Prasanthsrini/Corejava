package codes;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		Scanner ch=new Scanner(System.in);
	    int number;
	    int reverse=0;
	    System.out.println("Enter the number to reverse");
	    number=ch.nextInt();
	    System.out.println("The reverse value of "+number+" is : ");
	    
	   while(number!=0) {
		   reverse=reverse*10+number%10;
		   number=number/10;
	   }
       System.out.println(reverse);
	}

}
