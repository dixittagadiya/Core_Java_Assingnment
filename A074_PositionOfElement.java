package Modul_2_core_java;

import java.util.ArrayList;
import java.util.Scanner;

public class A074_PositionOfElement {

	public static void main(String[] args) {
		
		ArrayList<Integer> p = new ArrayList<Integer>();
		p.add(12);
		p.add(33);
		p.add(10);
		p.add(20);
		p.add(22);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Total Element is : "+p);
		
		System.out.println("Choose Element for 0 to 4 : " );
		int a = sc.nextInt();
		
		System.out.println("Your Element is : "+p.get(a));
		
		sc.close();
	}
}
