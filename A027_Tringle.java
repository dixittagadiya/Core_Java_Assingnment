package Modul_2_core_java;

class Tringle
{
	int a;
	int b;
	int c;
	
	Tringle()
	{
		this.a=3;
		this.b=4;
		this.c=5;
	}
	public void area(int base, int height)
	{
		System.out.println("Area of tringle is :" +(base*height)/2);
	}
	public void perimeter()
	{
		System.out.println("Perimeter of tringle is :" + (a + b + c ));
	}
}

public class A027_Tringle {

	public static void main(String[] args) {

		Tringle t= new Tringle();
		
		t.area(5, 6);
		t.perimeter();
		
	}

}