package Modul_2_core_java;

class myClass implements Runnable
{
	public void run()
	{
		System.out.println("Hello Java :");
	}
}

public class A044_TheredImplementingRunnableInterface {

	public static void main(String[] args) {

		myClass m = new myClass();
		Thread t1 = new Thread(m);
		
		t1.start();
		
		
	}

}
