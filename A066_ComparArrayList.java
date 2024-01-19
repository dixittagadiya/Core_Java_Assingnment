package Modul_2_core_java;

import java.util.ArrayList;

public class A066_ComparArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(20);
		a1.add(10);
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(10);
		a2.add(20);
		a2.add(20);
		a2.add(10);
		
int m=0;
		
		if(a1.size()!= a2.size())
		{
			System.out.println("Not Equal");
		}
		else
		{
			for(int i=0;i<a1.size();i++)
			{
				if(a1.get(i)!=a2.get(i))
				{
					m=1;
					break;
				}
				
			}
			
			if(m==0)
			{
				System.out.println("Equal");
			}
			else
			{
				System.out.println("Not Equal");
			}
		}
		
	}
}
