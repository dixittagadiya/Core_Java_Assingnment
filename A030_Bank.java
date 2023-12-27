package Modul_2_core_java;

abstract class Bank
{
	int a = 100;
	int b = 150;
	int c = 200;
	
	public abstract void getBalance();
}
class BankA extends Bank
{
//	@Override
	public void getBalance()
	{
		System.out.println("Balance of Account A is $ :" + a);
	}
}
class BankB extends Bank
{
//	@Override
	public void getBalance()
	{
		System.out.println("Balance of Account B is $ :" + b);
	}
}
class BankC extends Bank
{
//	@Override
	public void getBalance()
	{
		System.out.println("Balance of Account C is $ :" + c);
	}
}



public class A030_Bank {

	public static void main(String[] args) {
		
	BankA b1 = new BankA();
	b1.getBalance();
	BankB b2 = new BankB();
	b2.getBalance();
	BankC b3 = new BankC();
	b3.getBalance();
	
		
	}

}
