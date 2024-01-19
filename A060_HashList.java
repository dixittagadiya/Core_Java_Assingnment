package Modul_2_core_java;

import java.util.HashSet;
import java.util.Iterator;

public class A060_HashList {

	public static void main(String[] args) {
		
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(50);
		h.add(60);
		h.add(10);
		

		Iterator<Integer> itr = h.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
