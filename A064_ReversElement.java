package Modul_2_core_java;

import java.util.ArrayList;
import java.util.Collections;

public class A064_ReversElement {

	public static void main(String[] args) {
		
		ArrayList<Integer> d = new ArrayList<Integer>();
		d.add(1);
		d.add(2);
		d.add(3);
		d.add(4);
		d.add(5);
		
		Collections.reverse(d);
		
		System.out.println(d);
		
	}
}
