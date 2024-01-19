package Modul_2_core_java;

import java.util.Map.Entry;
import java.util.HashMap;

public class A062_HashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> m = new HashMap<Integer, String>();
	
		m.put(10, "Java");
		m.put(20, "Android");
		m.put(30, "Phython");
		m.put(40, "Php");
		
		for(Entry<Integer, String> map :m.entrySet() )
		{
			System.out.println(map.getKey()+" "+map.getValue());
		}
	}
}
