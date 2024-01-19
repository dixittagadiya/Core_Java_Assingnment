package Modul_2_core_java;

import java.util.HashSet;

public class A069_ConvertHashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(23);
		h.add(32);
		h.add(12);
		h.add(21);
		
		System.out.println(h);
		
		Integer a[]=new Integer[4];
		h.toArray(a);
		
		for(int i:a)
		{
			System.out.println(i);
		}
		
	}
}
