package Modul_2_core_java;

class thre1 extends Thread {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("thre1 :"+i);
		}
	}
}

class thre2 extends Thread {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("thre2 :"+i);
		}
	}
}

public class A046_ThreadSleep {

	public static void main(String[] args) {

		thre1 t1 = new thre1();
		thre2 t2 = new thre2();

		try {
			t1.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
		t2.start();

	}

}
