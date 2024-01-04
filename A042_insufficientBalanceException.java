package Modul_2_core_java;

public class A042_insufficientBalanceException extends Exception
{
	double need;
	public A042_insufficientBalanceException(double need)
	{
		this.need=need;
	}
	public void message()
	{
		System.err.println("You need More :"+need);
	}
}
