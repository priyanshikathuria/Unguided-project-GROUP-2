import java.util.Scanner;
import java.nio.file.*;
import java.net.URL; 
class NameValidator{
	boolean nameValidator(String url1)
        {
  		try 
            {
            //URL IS BEING VALIDATED. 
            new URL(url1).toURI(); 
            return true; 
        } 
          
        // If there was an Exception 
        // while creating URL object 
        catch (Exception e) { 
            return false; 
        } 
	}
	boolean isvalid(String path)
	{
		try
		{
			Paths.get(path);
		}
		catch(InvalidPathException|NullPointerException ex)
		{
			return false;
		}
		return true;
	}

}
		


class testnamevalidator4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s;
                // THE URL IS BEING ENETERED BY THE USER.
		System.out.println("Enter the url:");
		s=sc.nextLine();
		NameValidator csvObject = new NameValidator();
		//csvObject.nameValidator("example.csv","csv");
		boolean checkValidator = csvObject.nameValidator(s);
		System.out.println(checkValidator);
                // THE PATH OF THE OBJECT IS  BEING ENTERED BY THE USER.
		System.out.println("Enter the path");
		String w;
                // PATH IS BEING SCANNED
		w=sc.nextLine();
		boolean a=csvObject.isvalid(w);
		System.out.println(a);

	}
}

