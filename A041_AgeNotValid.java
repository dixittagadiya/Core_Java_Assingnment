package Modul_2_core_java;

public class A041_AgeNotValid extends Exception 
{
	int AgeChake;
	public A041_AgeNotValid (int AgeChake)
	{
		this.AgeChake = AgeChake;
	}
	public void getmessage()
	{
		System.err.println("your Need More " +AgeChake +"Year to eligibe");
	}
}
