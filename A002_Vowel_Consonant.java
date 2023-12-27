package Modul_2_core_java;

import java.util.Scanner;

public class A002_Vowel_Consonant 
{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No :");
		String ch =sc.next();
		 
		
		
		if(ch == "A"||ch=="E"||ch=="I"||ch=="O"||ch=="U"||ch=="a"||ch=="e"||ch=="i"||ch=="o"||ch=="u")
		{
			System.out.println(ch+ " is "+" Vowel :");
		}
		else if (! ch.matches("[a-zA-Z]") && ch.length() >=1)
		{
			System.out.println("Error");
		}
		
		else
		{
			System.out.println(ch+ " is "+" consonant");
		}
	}

}