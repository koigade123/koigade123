package com.demo.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckErrors 
{
	public static boolean isFileExists(File file) 
	 {
	     return file.exists() ;
	 }
	public static boolean isDouble(String s)
	  {
			
		   boolean isValidDouble =false;
		  try 
		  {
			  Double.parseDouble(s);
		
			   isValidDouble = true;
		  }
		  catch(Exception ex)
		  {
			  System.out.print(ex.getMessage());
		  }
		   
			return isValidDouble;
	  }
	 public static boolean isInt(String s)
	  {
			
		   boolean isValidDouble =false;
		  try
		  {
			  Integer.parseInt(s);
		
			   isValidDouble = true;
		  }
		  catch(NumberFormatException ex)
		  {
			  System.out.print(ex.getMessage());
		  }
		   
			return isValidDouble;
	  }
	
	public static void main(String[] args)
	{
		String[] string = {"sxvsc","45","5.6","14nxn","4566","0.4465"};
		File file = new File("E:\\File1.txt");

		for(int i=0 ; i<string.length ; i++)
		{
			boolean isDouble = isDouble(string[i]);
			if(isDouble) 
			{
				System.out.println(string[i]+ " is  real number: "+ isDouble);
			}
			else 
			{
				System.out.println(string[i]+ " is not real number : " + isDouble);
			}
		}
		System.out.println();
		for(int i=0 ; i<string.length ; i++)
		{
			boolean isInt = isInt(string[i]);
			if(isInt) 
			{
				System.out.println(string[i]+ " is an integer: "+ isInt);
			}
			else 
			{
				System.out.println(string[i]+ " is not an integer : " + isInt);
			}
		}
		System.out.println();
		boolean result;
		//
		result=file.exists();
		if(result)
		{
			
			System.out.println("File exists... reading the contents");
			
			try 
			{
				Scanner	s = new Scanner(file);
				//print the contents of the file
				while(s.hasNextLine())
				{
					System.out.println(s.nextLine());
				}
			} 
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			}
			
		}
		else
		{
			//print message that the file does not exist
			System.out.println("File does not exists");
		}
	}

}
