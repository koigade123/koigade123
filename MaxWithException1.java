package com.demo.file;

import java.io.*;

public class MaxWithException1 {
  public static void main (String args[]) 
  {
    try 
    {
    	FileReader f1=new FileReader("E:\\test.txt");
    	BufferedReader br = new BufferedReader(f1);
       
                
      int max = -1;

      String line = br.readLine();
               
      while (line != null) 
      {
        int n = Integer.parseInt(line);
        if(n<0)
          {
             throw new Exception("Number is less than 0");
          }
        
        if (n > max) max = n;
           {
		        line = br.readLine();
		        System.out.println("Maximum = " + max);
           }
        br.close();       
      }
      
  }
    catch (FileNotFoundException e) 
    {
       System.out.println("The file does not exist.");
    }
    catch (IOException e) 
    {
       System.out.println("The file cannot be read.");
    }
    catch (NumberFormatException e) 
    {
       System.out.println("The file contains non numeric data.");
    }
    catch (Exception e) 
    {
       System.out.println(e.getMessage());
    }
  }
}