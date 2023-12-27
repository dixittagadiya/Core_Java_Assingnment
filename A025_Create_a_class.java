package Modul_2_core_java;
class Member
{
	String name ="Dixit";
	int id = 8;
	int age= 18;
	long ph = 9876122832l;
	String add = "Surat";
	double sal = 80000;
	
	public void Printsalary(int a)
	{
		System.out.println("Salary is :" + sal);
		
	}
	
}

public class A025_Create_a_class {

	public static void main(String[] args) {

		Member m = new Member();
		m.Printsalary(80000);
		
	}

}
