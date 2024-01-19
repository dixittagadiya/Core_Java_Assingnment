package Modul_2_core_java;

import java.util.ArrayList;

public class A053_UdateSpecific {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("iphone");
		a.add("Redmi");
		a.add("Oppo");
		a.add("Vivo");
		a.add("Nokia");
		
		a.set(4, "Samsung");
		
		
		System.out.println(a);
	}
}
