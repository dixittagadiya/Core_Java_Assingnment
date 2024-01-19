package Modul_2_core_java;

import java.util.ArrayList;
import java.util.Collections;

public class A067_SwapingElement {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		Collections.swap(a, 1, 2);
		
		System.out.println(a);
	}
}
