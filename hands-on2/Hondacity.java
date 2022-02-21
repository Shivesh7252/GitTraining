package com.org.gen.day2;


class Vehcile {
	int x;
	Vehcile(int x) {
		this.x = x;
		System.out.println("vehical class :" +x);
	}

	 public void sound() {
		  System.out.println(" This is sound method ");
	 }
	 public void engine() {
		  System.out.println(" This is engine method ");
	 }
	 public void price() {
		  System.out.println(" This is price method ");
	 }
	 public void sitting() {
		  System.out.println(" This is sitting method ");
	 }
}
class car extends Vehcile{
	car() {
		super(67);
		System.out.println("Car class Constructor");
	}
	public void color() {
		System.out.println(" This is color method ");
	}
	public void model() {
		System.out.println(" This is model method ");
	}
}
class Honda extends car{
	public void HP() {
		System.out.println(" This is HP method ");
	}
}
class Hondacity extends Honda{
	public void features() {
		System.out.println(" This is features method ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Hondacity h = new Hondacity();
           h.sound();
           h.color();
           h.HP();
           h.features();
           
	}

}
