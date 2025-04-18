 import java.util.Scanner;
class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}

public class UserDefineException
{
	
	  static void validate (String str) throws MyException{    
       if(str.length()>6)
	{
		throw new MyException("InValid String");
	}
	else
	{
System.out.print(str.toUpperCase());
	}
     }

	 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String 	str=scanner.next();
		  try  
        {  
            // calling the method   
            validate(str);  
        }  
        catch (MyException ex)  
        {  
           // printing the message from InvalidAgeException object  
            System.out.println("Exception occured: " + ex);  
        }  
  
    }  
	
}