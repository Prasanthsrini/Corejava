package codes;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
	  int num1,num2,temp;
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the num1");
	  num1=s.nextInt();
	  System.out.println("Enter the num2");
	  num2=s.nextInt();
	  
	  System.out.println("Before Swapping num1="+num1+" and num2="+num2);
	  
	  temp=num1;
	  num1=num2;
	  num2=temp;
	  
	  System.out.println("After Swapping num1="+num1+" and num2="+num2);

	}

}
