package com.org.gen.day1;


import java.util.Scanner;

public class ATM {
	
public static void main(String[] args) {
		int count = 1;
		int savedacctNum = 45678;
		int savedpass = 234;
		 
        do{
        	Scanner sc = new Scanner (System.in);
            System.out.print("Enter your account number: ");
            int acctNum = sc.nextInt();
            System.out.print("Enter your account's password: ");
             int pwd = sc.nextInt();
 
           
 
            if (( savedacctNum != acctNum) && (savedpass != pwd)){
                System.out.println(" Error: Account number and/or password is incorrect ");
                count++;
            }
        }while (count <= 3 && count > 1);
        
        if (count > 3){
            System.out.println(" You have reached the maximum attempts allowed ");
        }
 
        else{
        	System.out.println(" Proceed further ");
        }
	
	}
	}


