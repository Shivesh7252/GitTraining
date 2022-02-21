package com.org.gen.day7;


public class MultipleTaskQues2 implements Runnable {
              
	     public void run() {
            for(int i = 1; i <= 3; i++) {
            try {
              Thread.sleep(500);
             } 
            catch (Exception e) {
              
             }	
           System.out.println(Thread.currentThread() + " is: " +i); 
            }
          }
         public static void main(String[] args) {
        	 MultipleTaskQues2 a1 = new MultipleTaskQues2();
             Thread t1 = new Thread(a1, "First Child Thread");

             MultipleTaskQues2 a2 = new MultipleTaskQues2();
             Thread t2 = new Thread(a2, "Second Child Thread");

             t1.start();
             t2.start();
          }
    }

      
