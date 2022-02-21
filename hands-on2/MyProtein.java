package com.org.gen.day2;

class Protein
{
	Protein()
	{
		System.out.println("Proteins are very important for human body");
	}
	Protein(String s){
		this();
		System.out.println(s +" are the best source of protein");
	}
}
class Source extends Protein
{
	Source()
	{
		super();
	}
	Source(String s)
	{
		super(s);
	}
}
public class MyProtein {
	public static void main(String[] args)
	{
		Protein p=new Protein();
		Source s = new Source("Pulses");
	}

}
