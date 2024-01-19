package Modul_2_core_java;

import java.util.ArrayList;

public class A065_ExtraPersion {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		System.out.println(a.subList(1, 4));
	}
}
