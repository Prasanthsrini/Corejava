package codes;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
	   int num1,num2,num3;
	   Scanner scanner=new Scanner(System.in);
	   System.out.println("Enter the 1st number");
	   num1=scanner.nextInt();
	   System.out.println("Enter the 2nd number");
	   num2=scanner.nextInt();
	   System.out.println("Enter the 3rd number");
	   num3=scanner.nextInt();
	   
	   if(num1>num2 && num1>num3) {
		   System.out.println(num1+" "+" is a largest amoung "+num2+" and "+num3);
	   }
	   else if(num2>num1 && num2>num3){
		   System.out.println(num2+" "+"is a largest amoung "+num1+" and "+num3);
	   }else 
	      System.out.println(num3+" "+"is a largest amoung "+num1+" and "+num2);
	   

	}

}
