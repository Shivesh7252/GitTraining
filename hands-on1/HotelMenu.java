package com.org.gen.day1;

import java.util.Scanner;

public class HotelMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Welcome to Usha Palace");
  System.out.println();
  
      System.out.println(" Enter your choice ");
	  System.out.println(" Enter 1,  for South Indian Food ");
	  System.out.println(" Enter 2, for North Indian Food ");
	  System.out.println(" Enter 3,  for Rajasthani Dish ");
	  System.out.println(" Enter 4,  for Gujrati Dish ");
	  System.out.println(" Enter 5,  for Bengali Dish ");
	  System.out.println(" Enter 6,  for Desserts ");
	  System.out.println(" Enter 7, to exit ");
	  
	  System.out.println();
	  
	 
	  int choice = sc.nextInt();
	  
	  switch(choice) {
	  case 1: System.out.println("Welcome to South Indian Food court ");
	  southIndianFood(); 
	  break;
	  
	  case 2: System.out.println("Welcome to North Indian Food Court");
	  northIndianFood();
	  break;
	  
	  case 3: System.out.println("Welcome to Rajasthani Food Court");
	  rajasthaniFood();
	  break;
		
	  case 4: System.out.println("Welcome to Gujrati Food Court");
	  gujratiFood();
	  break;
		
	  case 5: System.out.println("Welcome to Bengali Food Court");
	  bengaliFood();
	  break;			
		
	  case 6: System.out.println("Welcome to Desserts Food Court");
	  desserts();
	  break;
		
	  case 7: System.out.println("Thanks for Visiting... Visit again");
	  System.exit(0);
	   break;
		
	  default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
		}
	}

public static void southIndianFood(){
	System.out.println("You get:");
	System.out.println("Idli : 2 Pieces: Rs.60");
	System.out.println("Butter Cheese Dosa : 1 Pieces: Rs.200");
	System.out.println("Vada : 2 Pieces: Rs.50");

}

public static void northIndianFood(){
	System.out.println("You get:");
	System.out.println("Chole Bhature : 2 Pieces: Price : Rs.100");
	System.out.println("Litti Chokha : 4 Pieces: Rs.50");
}

public static void rajasthaniFood(){
	System.out.println("You get:");
	System.out.println("Dal Baati Churma : Rs.350");
	System.out.println("Methi Bajra puri : Rs.250");

}

public static void gujratiFood(){
	System.out.println("You get:");
	System.out.println("Dhokla : 2 pieces : Rs.70");
	System.out.println("Khandvi : Rs.150");
	System.out.println("Methi ka Thepla : Rs.100");
}

public static void bengaliFood(){
	System.out.println("You get:");
	System.out.println("Maach Bhaat : Rs.490");
	System.out.println("Aalu Luchi : Rs.89");
}

public static void desserts(){
	System.out.println("You get:");
	System.out.println("Rasmalai : Rs.500");
	System.out.println("Rasgulla : 2 Pieces : Rs.50");
	System.out.println("Emarti : 2 Pieces : Rs.100");
	System.out.println("Gajar ka halwa : Rs.150");

}

}

	

