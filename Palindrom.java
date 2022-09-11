package codes;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		int n;
		int rev=0;
		System.out.println("Enter the number to check it is palindrom or not");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int backup=n;
		
		while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;	
		}
		
		if(backup==rev) {
			System.out.println(backup+" is a palindrom number");
		}else {
			System.out.println(backup+" is not a palindrom number");
		}
	}

}
