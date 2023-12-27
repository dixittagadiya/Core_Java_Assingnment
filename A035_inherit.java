package Modul_2_core_java;

class Shap
{
	public void Shap1()
	{
		System.out.println("This is a Shap.");
	}
}
class Rectangle extends Shap
{
	public void Rec()
	{
		System.out.println("This is rectangular shape.");
	}
}
class Circle extends Shap
{
	public void Cir()
	{
		System.out.println("This is a circular shape.");
	}
}
class Squre extends Rectangle
{
	public void Squr()
	{
		System.out.println("Square is a rectangle.");
	}
}

public class A035_inherit {

	public static void main(String[] args) {

		Squre s = new Squre();
		s.Shap1();
		s.Rec();
		s.Squr();
		
	}

}
