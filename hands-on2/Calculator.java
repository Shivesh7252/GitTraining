package com.org.gen.day2;

//java hands on
public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public float add(int a, int b, int c) {
		return a + b + c;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		System.out.println(c1.add(5, 2, 3));
		System.out.println(c1.add(2, 3));
		System.out.println(c1.subtract(5.4, 2.3));
		System.out.println(c1.subtract(2, 3));

	}

}
