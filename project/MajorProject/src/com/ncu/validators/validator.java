package com.ncu.validators;
import java.util.Scanner;
import java.nio.file.*;
import java.net.URL;
import java.util.*;
import java.io.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

class NameValidator
{
	public static final Logger logger = Logger.getLogger(NameValidator.class);
	boolean nameValidator(String url1)
    	{
		boolean b=false;
		Properties prop = new Properties();
		FileInputStream input=null;
		PropertyConfigurator.configure("C:\\Users\\jaika\\Desktop\\MajorProject\\configs\\logger\\logger.properties");
		try
		{	
			if(url1.equals(""))
			{
				throw new URLisEmpty("URL is Empty.");
			}
			input = new FileInputStream("C:\\Users\\jaika\\Desktop\\MajorProject\\configs\\constants\\exceptions.properties");
			prop.load(input);
			//URL IS BEING VALIDATED. 
            		new URL(url1).toURI(); 
         	   	b=true; 
		} 
         
		// If there was an Exception 
		// while creating URL object 
		
		catch(URLisEmpty e)
		{
			logger.error("\n \n"+e+prop.getProperty("EmptyURL")+"\n");
			b=false;
		}
		catch(Exception e)
		{
			System.out.println(e);
			b=false;
		}return b;
	}
	boolean isvalid(String path)
	{

		boolean b=false;
		try
		{
			//PATH IS BEING VALIDATED.
			Paths.get(path);
		}
		catch(InvalidPathException|NullPointerException ex)
		{
			b=false;
		}
		return b;
	
	}	
}
	
class URLisEmpty extends Exception
{
	URLisEmpty(String s)
	{
		super(s);
	}
}

class validator
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
	String FILE_URL;
        // THE URL IS BEING ENETERED BY THE USER.
		System.out.println("Enter the url:");
		FILE_URL=sc.nextLine();
		NameValidator nvObject = new NameValidator();
		
		//nvObject.nameValidator(FILE_URL);
		
		boolean checkValidator = nvObject.nameValidator(FILE_URL);
		System.out.println(checkValidator);

        // THE PATH OF THE OBJECT IS  BEING ENTERED BY THE USER.
		System.out.println("Enter the path");
		String FILE_NAME;
        // PATH IS BEING SCANNED
		FILE_NAME=sc.nextLine();
		boolean checkValidator1=nvObject.isvalid(FILE_NAME);
		System.out.println(checkValidator1);
	
	}
}

