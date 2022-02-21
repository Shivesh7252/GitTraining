package com.org.gen.day3;

abstract class Parent
{
	void message() {}
}
class Subclass1 extends Parent
{
	void message()
	{
		System.out.println("This is first subclass");
	}
}
class Subclass2 extends Parent
{
	void message()
	{
		System.out.println("This is second subclass");
	}
}
public class Q1 {
	public static void main(String[] args) {
		Subclass1 s1 = new Subclass1();
		Subclass2 s2 =new Subclass2();
		s1.message();
		s2.message();
	}

}
