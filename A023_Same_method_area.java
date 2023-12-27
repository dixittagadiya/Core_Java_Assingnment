package Modul_2_core_java;
class area
{
	public void Squar(int i)
	{
		System.out.println("Squar area is :" +i*i);
	}
	public void Squar(int l, int b)
	{
		System.out.println("Squar area is :" +l*b);
	}
	
}

public class A023_Same_method_area {

	public static void main(String[] args) {

		area a = new area();
		a.Squar(20);
		a.Squar(20, 30);
		
	}

}
