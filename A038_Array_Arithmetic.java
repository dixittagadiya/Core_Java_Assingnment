package Modul_2_core_java;

import java.util.Scanner;

public class A038_Array_Arithmetic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Value of Num :");
		
		int a[]= new int[3];
		
		for(int i=0; i<=3; i++)
		{
			a[i]=sc.nextInt();
			try 
			{
//				a[i]=sc.nextInt();
				a[i] = a[i]/0;
			} 
			catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
			catch (ArithmeticException e) {
				e.printStackTrace();
			}
			finally {
				sc.close();
			}
		}
		
	}

}