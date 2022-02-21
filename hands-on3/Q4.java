package com.org.gen.day3;


abstract class Check
{
	Check()
	{
		System.out.println("Constuctor of abstract class");
	}
	void amethod() {}
	void method()
	{
		System.out.println("Non - abstract method, normal method of abstract class");
	}
}
class Subclass extends Check
{
	void amethod()
	{
		System.out.println("this is abstract method");
	}
}

public class Q4 {
	public static void main(String[] args) {
		Subclass s1= new Subclass();
		s1.amethod();
		s1.method();
	}

}
