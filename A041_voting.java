package Modul_2_core_java;

import java.util.Scanner;

import javax.security.sasl.SaslException;

class voting
{

	int age;
	public void age(int age) throws A041_AgeNotValid
	{
		
		if(age<18)
		{
			int AgeChake = 18 - age;
			throw new A041_AgeNotValid(AgeChake);
		}
		else
		{
			System.out.println("your Eligible to vot ");
		}
	}
}

public class A041_voting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		
		voting v = new voting();
		try 
		{
			v.age(age);
		} 
		catch (A041_AgeNotValid e) 
		{

			e.printStackTrace();
			e.getmessage();
		}
		
	}

}
