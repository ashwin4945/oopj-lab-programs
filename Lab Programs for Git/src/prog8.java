
import java.io.*;

public class prog8 
{
	static int a=12;
    static int b;
	static void reThrow()
	{
		try
        {
        	System.out.println("Inside try block");
        	b=a/0;
        }
        catch(ArithmeticException e)
        {
        	System.out.println("Arithmetic Exception caught "+e);
        	throw new NullPointerException("NPE");
        }
	}
	
	public static void main(String[] args) throws IOException 
	{
		
		//  CHECKED EXCEPTION
		
		/* // Creating a file and reading from local repository
        FileReader file = new FileReader("C:\\test\\a.txt");
 
        // Reading content inside a file
        BufferedReader fileInput = new BufferedReader(file);
 
        // Printing first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());
 
        // Closing all file connections
        // using close() method
        // Good practice to avoid any memory leakage
        fileInput.close(); */
        
        //---------------------------------------------------------------------------------------------------------
        
        
		//  UNCHECKED EXCEPTION
		
        
        
        System.out.println("Before entering try block");
        
        
        try
        {
        	reThrow();
        }
        catch(NullPointerException e)
        {
        	System.out.println("Null Pointer Exception caught "+e);
        	throw new ArrayIndexOutOfBoundsException("AIOoBE");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("Array Index out of bound Exception caught "+e);
        	throw new ArithmeticException("AE rethrown");
        }
        catch(Exception e)
        {
        	System.out.println("Generic Exception caught "+e);
        }
        finally
    	{
    		System.out.println("Inside try block 2");
    	}
        
        System.out.println("After the exception is caught");
	}

}
