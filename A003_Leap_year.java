package Modul_2_core_java;

import java.util.Scanner;

public class A003_Leap_year {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No :");
		
		int year =sc.nextInt();
		
		if(year % 4 == 0)
		{
			System.out.println("Leap year");
		}
		
		else
		{
			System.out.println("Not Leap year");
		}
	}

}
