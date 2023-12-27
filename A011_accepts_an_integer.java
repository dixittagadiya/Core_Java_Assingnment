package Modul_2_core_java;

import java.util.Scanner;

public class A011_accepts_an_integer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No :");
		int num =sc.nextInt();
		
		System.out.println("Num Of : " +num+" + "+ (num*10+num)+" + "+(num*100+num*10+num));
		
	}
}
