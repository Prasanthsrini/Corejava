package codes;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int number;
		int check=0;
		int temp;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number to check is it armstrong number or not");
     number=sc.nextInt();
     int original=number;
     while(number>0) {
    	 
    	 temp=number%10;
    	 check=check+(temp*temp*temp);
    	 number=number/10;
     }
     if(original==check) {
    	 System.out.println("It is Armstrong number");
     }
     else
    	 System.out.println("It is not an Armstrong number");
	}

}
