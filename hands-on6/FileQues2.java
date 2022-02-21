package com.org.gen.day7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileQues2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      FileReader fr = new FileReader("F:\\data.txt");
      Writer writer = new FileWriter("F:\\data.txt",false);
      writer.write("content");
      writer.close();
      int i;
      while((i=fr.read())!= -1) 
    	  System.out.print((char)i);
          fr.close();
	}
	

}
