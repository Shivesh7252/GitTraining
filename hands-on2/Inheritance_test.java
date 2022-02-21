package com.org.gen.day2;
class Parent{
	void method() {
		System.out.println("This is parent class");
	}
}
class child extends Parent{
	void method1() {
		System.out.println("This is child class");
	}
}
public class Inhreritance_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		  Parent p = new Parent();
		  p.method();
		  child c = new child();
		  c.method1();
		  c.method();
		  
	}

}
