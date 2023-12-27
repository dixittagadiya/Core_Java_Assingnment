package Modul_2_core_java;

import java.util.Scanner;

public class A015_Char_add {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The String 1:");
		String s1 = sc.nextLine();
		
		System.out.println("Enter The String 2:");
		String s2 = sc.nextLine();
		
		String s3 = s1 + s2;
		
		System.out.println(s3);
	}

}
