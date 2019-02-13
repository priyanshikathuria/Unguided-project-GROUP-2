import java.util.Scanner;
class NameValidator
{
	boolean nameValidator(String url1)
	{
		System.out.println("URL is:"+url1);
		return true;
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
