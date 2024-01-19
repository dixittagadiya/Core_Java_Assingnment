package Modul_2_core_java;

import java.util.ArrayList;

public class A054_removeArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		
		a1.remove(2);
		
		for(int n:a1)
		{
			System.out.println(n);
		}
		
	}
}
