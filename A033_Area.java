package Modul_2_core_java;

abstract class Shap1
{
	public abstract void Rect(double len, double width);

	public abstract void Squre(double len);

	public abstract void Circle(double radius);
}

class Area1 extends Shap1 
{
	@Override
	public void Rect(double len, double width) 
	{
		System.out.println("The Area Of Rectangle is :" + len * width);
	}
	
	@Override
	public void Squre(double len) 
	{
		System.out.println("The Area Of Squre is :" + len * len);
	}
	
	@Override
	public void Circle(double radius)
	{
		System.out.println("The Area of Circle is :" + radius * 3.14);
	}
}

public class A033_Area {
	public static void main(String[] args) {

		Area1 a = new Area1();
		a.Rect(20, 40);
		a.Squre(10);
		a.Circle(20);

	}
}