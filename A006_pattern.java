package Modul_2_core_java;

import java.util.Scanner;

public class A006_pattern {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter No :");
			int a = sc.nextInt();
			
			for(int i =1; i<=a ; i++)
			{
				for(int j =1; j<=i; j++)
				{
					System.out.print(j +" ");
				}
				System.out.println();
			}
			
		}

	}
