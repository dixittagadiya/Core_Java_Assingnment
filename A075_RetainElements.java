package Modul_2_core_java;

import java.util.HashSet;

public class A075_RetainElements {

	public static void main(String[] args) {
		
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(50);
		
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(40);
		h1.add(50);
		
		System.out.println(h.equals(h1));
		
		HashSet<Integer>h2 = new HashSet<Integer>(h1);
		h2.retainAll(h2);
		
		System.out.println(h2);
		
		
	}
}
