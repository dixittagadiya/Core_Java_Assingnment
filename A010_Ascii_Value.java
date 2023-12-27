package Modul_2_core_java;

import java.util.Scanner;

public class A010_Ascii_Value {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Char :");
		char ch = sc.next().charAt(0);
		
		System.out.println("The Ascii Value Of" + (int) ch);
		
	}

}
