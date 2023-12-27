package Modul_2_core_java;
class parent
{
	public void par()
	{
		System.out.println("Parent class :");
	}
}
class child extends parent
{
	public void chil()
	{
		System.out.println("Child Class :");
	}
}

public class A024_parent_Child {

	public static void main(String[] args) {

		
		parent p = new parent();
		child c = new child();
		
		p.par();
		c.chil();
		c.par();
	}

}
