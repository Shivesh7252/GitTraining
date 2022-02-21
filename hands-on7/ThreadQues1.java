package com.org.gen.day7;


public class ThreadQues1 implements Runnable {
         
	     public void run() {
         try  {
           Thread.sleep(2000);
          }  
         catch (Exception e) {
             e.printStackTrace();
           }	
         System.out.println("Hello Java");
         System.out.println(Thread.currentThread());
        }
	     
     public static void main(String[] args) {
	     ThreadQues1 a = new ThreadQues1();
         Thread t = new Thread(a, "Child Thread");
         t.start();
         t.interrupt();
   }
}
