package com.comp.abc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandlingReadWrite {
	    public static void main(String [] args) throws IOException  {

	        String Name = "Document";
            String text;

		    {
		       
		       String message = "Great we can write the text here!!!";
		       System.out.println("The below is to write:");
		       Path Name1 = Path.of("hello");
		       Files.writeString(Name1, message);
		       String context = Files.readString(Name1);
		       System.out.println(context);
		    }

	        try {
	          
	            FileReader fileReader = new FileReader(Name);
                 BufferedReader bufferedReader =new BufferedReader(fileReader);
                while((text = bufferedReader.readLine()) != null) 
                {
	                System.out.println(text);
	            }   
             bufferedReader.close();         
	        }
	        catch(FileNotFoundException fe)
	        {
	        	System.out.println("---------------------------------------------------------");
	        	System.out.println("The below is to read: ");
	            System.out.println( "This file cannot be opened right now " + Name );                
	        }
	        catch(IOException fe)
	        {
	            System.out.println("This can not be read " + Name );                  
	          
	        }
	    }
	    
	    
	}









