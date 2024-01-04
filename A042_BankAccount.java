package Modul_2_core_java;

class Bank1
{
	double balance;
	
	public void getBlance()
	{
		System.out.println("Your current Balance is :" + balance);
	}
	public void deposit(double amt)
	{
		balance = balance + amt;
	}
	public void Withdraw (double amt) throws A042_insufficientBalanceException
	{
		if(amt>balance)
		{
			double need = amt - balance;
			throw new A042_insufficientBalanceException(need);
		}
		else
		{
			balance = balance - amt;
		}
	}
}

public class A042_BankAccount {

	public static void main(String[] args) {

		Bank1 b = new Bank1();
		b.getBlance();
		
		b.deposit(2000);
		
		b.getBlance();
		
		try {
			b.Withdraw(2500);
		} catch (A042_insufficientBalanceException e) {
			e.printStackTrace();
			e.message();
		}		
	}

}
