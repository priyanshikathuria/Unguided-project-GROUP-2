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
        boolean checkhttp (String url2)
        {
		String s2=url2.substring(0,4);
		if(s2.equals("https"))
		return true;
		else 
		return false;
}

}
		


class testnamevalidator3
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
		boolean checkvalidator1=csvObject.checkhttp(s);
		System.out.println(checkvalidator1);
	}
}

