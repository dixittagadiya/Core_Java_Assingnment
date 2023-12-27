package Modul_2_core_java;

import java.util.Scanner;

public class A005_five_no_sum {

	public static void main(String[] args) {
		int sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Value of A :");
		int a= sc.nextInt();
		System.out.println("Enter The Value of B :");
		int b = sc.nextInt();
		System.out.println("Enter The Value of C :");
		int c = sc.nextInt();
		System.out.println("Enter The Value of D :");
		int d = sc.nextInt();
		System.out.println("Enter The Value of E :");
		int e = sc.nextInt();
		
	sum= a+b+c+d+e;
	
	System.out.println("Total =" +sum);
	
	double add;
	
	add = sum/5;
	
	System.out.println("Percentage =" +add);
	
		
	}

}
