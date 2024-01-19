package Modul_2_core_java;

import java.util.ArrayList;

public class A049_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Red");
		a.add("White");
		a.add("Black");
		a.add("Blue");
		a.add("Green");
		
		for(String n:a)
		{
			System.out.println(n);
		}
		
	}
}
