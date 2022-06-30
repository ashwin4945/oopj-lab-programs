

class customException extends Exception
{
	customException(String s)
	{
		super(s);
	}
}

public class prog9 
{
	public static void main(String[] args) 
	{
		System.out.println("We will throw a customized exception");
		try
		{
			throw new customException("customizedexception");
		}
		catch(customException e)
		{
			System.out.println("Exception caught in catch block -> "+e);
		}
		System.out.println("This statement is after the catch block");
	}

}
