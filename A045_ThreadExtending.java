package Modul_2_core_java;

class th1 extends Thread
{
	public void run() 
	{
		System.out.println("Running Th1...");
	}
}
class th2 extends Thread
{
	public void run()
	{
		System.out.println("Running Th2...");
	}
}

public abstract class A045_ThreadExtending {

	public static void main(String[] args) {

		th1 t1 = new th1();
		th2 t2 = new th2();
		
		t1.start();
		t2.start();
		
		
	}

}
