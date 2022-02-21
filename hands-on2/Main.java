package com.org.gen.day2;

class Digital{
	  public void memory()
	  {
	    System.out.println("memory");
	  }
	  public void power()
	  {
	    System.out.println("power");
	  }
	}
	class Laptop extends Digital {
	  public void ScreenSize ()
	  {
	    System.out.println("ScreenSize");
	  }
	  public void displayQuality()
	  {
	    System.out.println("displayQuality");
	  }
	}
	class Ipad extends Digital {
	  public void color()
	  {
	    System.out.println("color");
	  }
	  public void model()
	  {
	    System.out.println("model");
	  }
	}
	class ChromeBook extends Laptop {
	  public void noOfKeys()
	  {
	    System.out.println("Number of Keys");
	  }
	}
	class Main{
	  public static void main(String []args)
	  {
	    ChromeBook cb=new ChromeBook();
	    cb.noOfKeys();
	    cb.displayQuality();
	    cb.ScreenSize();
	    Ipad ip=new Ipad();
	    ip.color();
	    ip.model();
	    ip.memory();
	    ip.power();
	  }
	}