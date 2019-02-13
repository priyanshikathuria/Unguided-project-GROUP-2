import java.util.Scanner;
import java.net.URL; 
class NameValidator{
	boolean nameValidator(String url1)
        {
  		try { 
            new URL(url1).toURI(); 
            return true; 
        } 
          
        // If there was an Exception 
        // while creating URL object 
        catch (Exception e) { 
            return false; 
        } 
	}
}
		


class testnamevalidator
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter the url:");
		s=sc.nextLine();
		NameValidator csvObject = new NameValidator();
		//csvObject.nameValidator("example.csv","csv");
		boolean checkValidator = csvObject.nameValidator(s);
		System.out.println(checkValidator);
	}
}

