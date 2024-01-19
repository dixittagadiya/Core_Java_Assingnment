package Modul_2_core_java;
import java.util.HashMap;

public class A063_CoutNumberMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "Dixit");
		h.put(2, "Sahil");
		h.put(3, "Mayank");
		h.put(4, "Arun");
		h.put(5, "Janak");
		

		System.out.println("Element size is : "+h.size());
	}
}
