package Modul_2_core_java;

class TestThreadTwice1 extends Thread
{
	public void run() {
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(i);
		}
	}
}

public class A047_SameThread {

	public static void main(String[] args) {
		
		TestThreadTwice1 te1 = new TestThreadTwice1();
		
		te1.run();
		
		te1.start();
		te1.start();

	}

}