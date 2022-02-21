package com.org.gen.day1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				// TODO Auto-generated method stub
		         Scanner sc = new Scanner(System.in);
		         int year;
		         System.out.println("Enter the Year");
		         year= sc.nextInt();
		         if((year % 4 == 0) && (year % 100 != 0)|| (year % 400 == 0))
		        	 System.out.println(" Leap Year");
		         else
		        	 System.out.println(" Non Leap Year");
			}


}

