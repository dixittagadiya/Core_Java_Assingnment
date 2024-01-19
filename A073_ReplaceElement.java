package Modul_2_core_java;

import java.util.ArrayList;
import java.util.Collections;

public class A073_ReplaceElement {

	public static void main(String[] args) {
		
		ArrayList<String> s = new ArrayList<String>();
		s.add("Dixit");
		s.add("Shahil");
		s.add("Mayank");
		s.add("Janak");
		s.add("Arun");
		s.add("Shahil");
		
		System.out.println(s);
		
		Collections.swap(s, 2, 4);
		
		System.out.println(s);
	}
}
