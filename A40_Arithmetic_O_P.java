package Modul_2_core_java;

import java.util.Scanner;

public class A040_Arithmetic_O_P {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The First Number :");
		int i= sc.nextInt();
		
		System.out.println("Enter The Second Number :");
		int j = sc.nextInt();
		
		try {
			int sum =i/j;
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
