package com.demo.file;

import java.io.BufferedReader;
import java.io.FileReader;

public class LineToLong 
{   
    public static void main(String[] args) throws LineToLongException
    {
       
        int charCount = 0 ;
        int wordCount = 0;  
        int lineCount=0;
        try
        {
            FileReader f1=new FileReader("E:\\Sample.txt");
        	BufferedReader reader = new BufferedReader(f1);
           
            String lines = reader.readLine();
             
            while (lines!= null)
            {
                
                lineCount++;
               
                String[] words =lines.split(" ");
               
                wordCount = wordCount + words.length;
                 
                for (String word : words)
                {
                  
                     
                    charCount = charCount + word.length();
                }
                 
             
               lines= reader.readLine();
                
            }
            if(charCount>80)
            {
            	throw new LineToLongException();
			  
            }
            else
            {	
            System.out.println("Number Of Chars In A File : "+charCount);
            System.out.println("Number Of Chars In A File : "+wordCount);
            System.out.println("Number Of Chars In A File : "+lineCount);
            }
         
             
           
        } 
      
        catch (LineToLongException ex) 
        {
          System.out.println("Line has more than 80  characters:");
           ex.printStackTrace();
        }
        catch(Exception ex)
        {
        	System.out.println(ex.getMessage());
        }
       
        
    }   
   
}

class LineToLongException extends Exception
{
	public LineToLongException()
	{
		
	}
}