package Modul_2_core_java;

abstract class parent1
{
	public abstract void message();
}
class SubclassA extends parent1
{
	public void message()
	{
		System.out.println("This is first subclass. ");
	}
}
class SecondSubclass extends parent1
{
	public void message() 
	{
		System.out.println("This is second subclass. ");
	}
}
public class A029_Absract {

	public static void main(String[] args) {

		SubclassA f = new SubclassA();
        f.message();

        SecondSubclass s = new SecondSubclass();
        s.message();
		
	}

}