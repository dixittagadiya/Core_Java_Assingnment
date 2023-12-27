package Modul_2_core_java;

class Rectengle
{
	double  length;
	double breadth;
	
	public Rectengle(double length , double breadth)
	{
		this.length=length;
		this.breadth = breadth;
	}
	public void arearec()
	{
		double area = length*breadth;
		
		System.out.println("Area of rectengle is :"+area);
	}
	public void perimeter()
	{
		 double perimeter = 2 * (length + breadth);
		 System.out.println("Perimeter of Rectangle: " + perimeter);
	}
}
class Square extends Rectengle
{
	public Square (double side)
	{
		super(side,side);
	}
	public void sq (double side)
	{
		System.out.println("Perimeter is :"+side * 4);
	}
}

public class A026_rectangle_and_square {

	public static void main(String[] args) {

		Rectengle r = new Rectengle(20,20);
		r.arearec();
		r.perimeter();
		
		System.out.println();
		
		Square s = new Square(4);
		s.sq(4);
		
	}

}
