package codes;

import java.util.Scanner;

public class Vowels {

	private static Scanner scs;

	public static void main(String[] args) {
		char ch;
		scs = new Scanner(System.in);
		System.out.println("Enter any one character to check its vowel are not :");
		ch=scs.next().toLowerCase().charAt(0);
		if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
			System.out.println(ch+" is a vowel");
		}else {
			System.out.println(ch+" is not a vowel");
		}

	}

}
