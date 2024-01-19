package Modul_2_core_java;

import java.util.HashMap;

public class A071_chakeWheather {

	public static void main(String[] args) {
		
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		
		m.put(1, "Java");
		m.put(2, "Android");
		m.put(3, "SQL");
		m.put(4, "Php");
		m.put(5, "Phython");
		
		System.out.println(m.isEmpty());
	}
}
