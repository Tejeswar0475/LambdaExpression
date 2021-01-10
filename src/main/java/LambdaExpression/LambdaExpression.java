package LambdaExpression;

import com.google.common.base.Predicate;
import LambdaExpression.InvalidInputException;

public class LambdaExpression {

	String welcomeMessage(String welcomeMessage)
	{
		return welcomeMessage;
	}
	
	boolean nameTest(String name) throws InvalidInputException
    {
        Predicate<String> matcher = n ->(n.matches("^[A-Z]{1}[A-Za-z]{2,12}$"));
        if (matcher.test(name))
            return true;
        else
            throw new InvalidInputException("plz enter name with First Letter Capital ");

    }
	
    boolean mobileNumberTest(String number) throws InvalidInputException
    {
        Predicate<String> matcher = n ->(n.matches("^[0-9]{2}\s[1-9]{1}[0-9]{9}$"));
        boolean result=matcher.test(number);
        if (result)
            return true;
        else
            throw new InvalidInputException("plz enter phone number n ths :91 1234567890: format");
    }
    
    boolean emailTest(String email)	throws InvalidInputException
    {
       Predicate<String> matcher = n ->(n.matches("^([a-zA-Z0-9]+)([_+.-]{1}[a-z0-9]+)*@([A-Za-z0-9]+).([a-z]{2,4})((.[a-z]{2,3})?)$"));
        boolean result=matcher.test(email);
        if (result)
            return true;
        else
            throw new InvalidInputException("Email format ex: abc.xyz@gmail.com.on with xyz and .in optional ");
    }
  
    boolean passwordTest(String password) throws InvalidInputException
    {
        Predicate<String> matcher = n ->(n.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!_%*#?&]{1})[a-zA-Z0-9@$!_%*#?&]{8,}$"));
        boolean result=matcher.test(password);
        if (result)
            return true;
        else
            throw new InvalidInputException("Password should have at minimum one uppercase and one numeric and exctly one special charecters");
    }
}
