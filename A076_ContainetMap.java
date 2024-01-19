package Modul_2_core_java;

import java.util.HashMap;

public class A076_ContainetMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		
		h.put(1, "Apple");
		h.put(2, "Banana");
		h.put(3, "Mango");
		
		System.out.println(h.entrySet());
		
		
	}
}
