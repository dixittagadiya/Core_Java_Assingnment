package Modul_2_core_java;

class TestDemon extends Thread
{
	public void run()
	{
		if(currentThread().isDaemon())
		{
			System.out.println("Demon Class.");
		}
		else
		{
			System.out.println("Non Demon Class.");
		}
	}
}
public class A048_SetDemo {

	public static void main(String[] args) {
		
		TestDemon t1 = new TestDemon();
		TestDemon t2 = new TestDemon();
		TestDemon t3 = new TestDemon();
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		
	}
}
