package Modul_2_core_java;

import java.util.ArrayList;

public class A051_insertEliment {

	public static void main(String[] args) {
		
		ArrayList<String> s1 = new ArrayList<String>();
		
		s1.add("Apple");
		s1.add("Banana");
		s1.add("Gavava");
		s1.add("Mango");
		
		s1.add(0, "Kiwi");
		
		
		for(String n : s1)
		{
			System.out.println(n);
		}
		
	}
}
