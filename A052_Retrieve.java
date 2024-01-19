package Modul_2_core_java;

import java.util.ArrayList;

public class A052_Retrieve {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Java");
		a.add("Phython");
		a.add("Android");
		a.add("DataBase");
		a.add("React");
		
		System.out.println(a.get(0));
	}
}
