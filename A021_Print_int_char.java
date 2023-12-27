package Modul_2_core_java;
class print
{
	public void print(int n)
	{
		System.out.println("Print Integer :" + n);
	}
	public void print(float n)
	{
		System.out.println("Print Float :" + n);
	}
	public void print(double n)
	{
		System.out.println("Print Double :" + n);
	}
	public void print(String n)
	{
		System.out.println("Print String :" + n);
	}
}

public class A021_Print_int_char {

	public static void main(String[] args) {

		
		print p = new print();
		p.print(10);
		p.print(20.10f);
		p.print(5.23423);
		p.print("Hello");
		
		
		
	}

}
