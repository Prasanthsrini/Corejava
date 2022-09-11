package codes;

import java.util.Scanner;

public class GeneratePrimeNumbers {

	public static void main(String[] args) {
		int range;
		Scanner prime=new Scanner(System.in);
		System.out.println("Enter the last range number to find prime number");
		range=prime.nextInt();
			for(int i=1;i<=range;i++) {
				int count=0;
				for(int j=1;j<=i;j++) {
					if(i%j==0) {
						count++;
					}
				}
				if(count==2) {
						System.out.print(i+" ");
					}
		}	
	}
}
