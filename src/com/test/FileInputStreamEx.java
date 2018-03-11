package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) throws IOException {
		FileInputStream sourceFile = null;
		FileOutputStream destinationFile = null;
	      int bytes_read = 0;
	      char c;
	      byte[] buffer = new byte[10];
	      
	      try{
	    	  sourceFile = new FileInputStream("C://Santosh//test.txt");
	    	  destinationFile = new FileOutputStream("C://Santosh//test2.txt");
	         
	         // read bytes to the buffer
	         //bytes_read=sourceFile.read(buffer);
	         System.out.println("Number of bytes read: "+bytes_read);
	         
	         /*for(byte b:buffer)
	         {
	            // converts byte to character
	            c=(char)b;
	            
	            // print
	            System.out.print(c);
	         }  */
	         
	         while( (bytes_read=sourceFile.read(buffer)) != -1){
	        	 destinationFile.write(buffer, 0, bytes_read);
	         }
	         System.out.println("Writing to file complete");
	      }catch(Exception ex){
	         ex.printStackTrace();
	      }finally{
	         // releases all system resources from the streams
	         if(sourceFile!=null)
	        	 sourceFile.close();
	         if(destinationFile!=null)
	        	 destinationFile.close();
	      }
	}

}
