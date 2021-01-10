package LambdaExpression;

import static org.junit.Assert.*;
import org.junit.Test;

import LambdaExpression.LambdaExpression;

public class InvalidaInputExceptionTest {
	
	@Test
	public void welcomeMessageTest()
	{
		LambdaExpression lambdaExpression=new LambdaExpression();
		String welcomeMessageResult=lambdaExpression.welcomeMessage("Welcome to user registration");
		assertSame("Welcome to user registration",welcomeMessageResult);
	}

	@Test
	public void NameTest()
	{
		try {
			try {
				LambdaExpression name = new LambdaExpression();            	
                boolean output = name.nameTest("ilta");
                assertTrue(output);
			}
            catch (NullPointerException e) {
                e.printStackTrace();
            }
        } catch (InvalidInputException e) {
        	e.printStackTrace();
        }
	}

	@Test
	public void EmailIdTest()
	{
		try
		{	try {
				LambdaExpression newEmail = new LambdaExpression();
				boolean output = newEmail.emailTest("abc1234@gmail.com");
				assertTrue(output);
            }
            catch (NullPointerException e)
             {
            	e.printStackTrace();
             }
       }
       catch(InvalidInputException e)
       {
           e.printStackTrace();
       }
    }

	@Test
	public void MobileTest()
	{
		try
		{	try	{
    	   		LambdaExpression phoneNumber = new LambdaExpression();
                boolean output = phoneNumber.mobileNumberTest("91 1204356789");
                assertTrue(output);
            }
       		catch (NullPointerException e)
       		{
       			e.printStackTrace();
       		}
		}
       catch(InvalidInputException e)
       {
           e.printStackTrace();
       }
	}

	@Test
    public void PasswordTest()
    {
       try
       {    try	{
    	   		LambdaExpression passWord = new LambdaExpression();
    	   		boolean output = passWord.passwordTest("Thomas#2@87B");
    	   		assertTrue(output);
            }
            catch (NullPointerException e)
            {
                e.printStackTrace();
            }
       }
       catch(InvalidInputException e)
       {
           e.printStackTrace();
       }
    }
	
}
