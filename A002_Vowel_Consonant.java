package Modul_2_core_java;

import java.util.Scanner;

public class A002_Vowel_Consonant {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No :");
		char ch = sc.next().charAt(0);

		if (Character.isDigit(ch)) 
		{
			System.out.println("Digit..");
		}
		
		else {

			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u')
			{
				System.out.println(ch + " is " + " Vowel :");
			}
			else
			{
				System.out.println(ch + " is " + " consonant");
			}

		}
	}

}
