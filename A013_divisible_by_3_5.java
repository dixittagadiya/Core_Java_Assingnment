package Modul_2_core_java;

import java.util.Scanner;

public class A013_divisible_by_3_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 100; i++) 
		{
			if (i % 3 == 0 && i % 5 == 0)
			{
				System.out.println(i + " (divisible by 3 and 5)");
			} 
			else if (i % 3 == 0) 
			{
				System.out.println(i + " (divisible by 3)");
			}
			else if (i % 5 == 0)
			{
				System.out.println(i + " (divisible by 5)");
			}
		}
	}

}
