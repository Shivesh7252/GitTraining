package com.org.gen.day3;

abstract class Bank
{
	int balance;
	Bank(int b)
	{
		balance = b;
	}
	void getBalance() {}
	
}
class BankA extends Bank
{
	BankA(int a)
	{
		super(a);
	}
	void getBalance()
	{
		System.out.println("Balance in dollars:"+super.balance);
	}
}
class BankB extends Bank
{
	BankB(int a)
	{
		super(a);
	}
	void getBalance()
	{
		System.out.println("Balance in dollars:"+balance);
	}
}
class BankC extends Bank
{
	BankC(int a)
	{
		super(a);
	}
	void getBalance()
	{
		System.out.println("Balance in dollars:"+balance);
	}
}
public class Q2 {
	public static void main(String[] args) {
		Bank A = new BankA(100);
		Bank B = new BankB(150);
		Bank C = new BankC(200);
		A.getBalance();B.getBalance();C.getBalance();
	}

}
