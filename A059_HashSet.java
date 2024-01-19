package Modul_2_core_java;

import java.util.LinkedHashSet;

public class A059_HashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
		
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(50);
		h.add(60);
	
		
		System.out.println(h);
		
		h.add(70);
		
		System.out.println(h);
	}
}
