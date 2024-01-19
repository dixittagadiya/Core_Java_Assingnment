package Modul_2_core_java;

import java.util.ArrayList;
import java.util.Collections;

public class A056_SortArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		
		Collections.sort(a);
		System.out.println(a);
		
	}
}
