package Modul_2_core_java;

import java.util.Scanner;

public class A001_Greater_No {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No A :");
		int a =sc.nextInt();
		
		System.out.println("Enter No B :");
		int b =sc.nextInt();

		System.out.println("Enter No C :");
		int c =sc.nextInt();

		
		
		if(a>b && a>c)
		{
			System.out.println("A is Greater :");
		}
		else if (b>c)
		{
			System.out.println("B is Greater :");
		}
		else
		{
			System.out.println("C is Greater :");
		}
		
	}

}
