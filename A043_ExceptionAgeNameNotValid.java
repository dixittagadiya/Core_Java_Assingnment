package Modul_2_core_java;

class AgeNotValidException extends Exception {
	int a;

	public AgeNotValidException(int a) {
		this.a = a;
		System.err.println("Age Not VAlid...");
	}
}

class NameNotValidException extends Exception {
	String n;

	public NameNotValidException(String n) {
		this.n = n;
		System.err.println("Name Not Valid...");
	}
}

class student
{
	int r;
	int a;
	String n;
	String c;

	public student(int r, int a, String n, String c) 
	{
		super();
		this.r = r;
		this.a = a;
		this.n = n;
		this.c = c;
	}

	public void Age() throws AgeNotValidException {

		if(15<a && 21>a)
		{
			System.out.println("Age Is Valid.");
		}
		else
		{
			throw new AgeNotValidException(a);
			
		}
	}
	public void Name() throws NameNotValidException
	{
		for(int i = 0 ; i<n.length(); i++ )
		{
			if(!Character.isLetter(n.charAt(i))&&!Character.isWhitespace(n.charAt(i)))
			{
				throw new NameNotValidException(n);
			}
		}
		System.out.println("Name Is Valid.");
	}

}

public class A043_ExceptionAgeNameNotValid {

	public static void main(String[] args) {
		
		student s = new student(10, 11, "Dixit", "FullStack");
		try {
			s.Age();
		} catch (AgeNotValidException e) {
			e.printStackTrace();
		}
		try {
			s.Name();
		} catch (NameNotValidException e) {
			e.printStackTrace();
		}
	}

}