package packages;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		ch =sc.next().charAt(0);
		if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println(ch+" it is vowel");
		}else {
			System.out.println(ch+" it is not a vowel");
		}
		sc.close();
		
	}

}
