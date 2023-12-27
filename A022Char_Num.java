package Modul_2_core_java;

class display
{
	public void num (int n , char ch)
	{
		System.out.println("The Number is :" + n +"The Charactor is :"+ch);
	}
	public void num (char ch,int n)
	{
		System.out.println("The charactor is :" +ch+"The Number is :" + n);
	}
	
}

public class A022Char_Num {

	public static void main(String[] args) {

		display p = new display();
		p.num(10, 'H');
		p.num('H', 20);
		
		
		
	}

}
