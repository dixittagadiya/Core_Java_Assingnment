package Modul_2_core_java;
abstract class Marks
{
	public abstract void getPersentage();
}

class StudentA extends Marks 
{
	double a;
	double b;
	double c;
	
	
	StudentA(double a,double b,double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void getPersentage()
	{
		System.out.println("Persentage Of Student A is ="+(a+b+c)/3);
	}
}
class StudentB extends Marks
{
	double a;
	double b;
	double c;
	double d;
	
	
	StudentB(double a,double b,double c,double d)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	
	public void getPersentage()
	{
		System.out.println("Persentage Of Student A is ="+(a+b+c)/3);
	}
}

public class A031_Calculator {

	public static void main(String[] args) {

		StudentA s1= new StudentA(90,85,80);
		s1.getPersentage();
		
		StudentB s2 = new StudentB(90,85,90,80);
		s2.getPersentage();
		
	}
}
