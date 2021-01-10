package LambdaExpression;

import static org.junit.Assert.*;
import org.junit.Test;

public class InvalidaInputExceptionTest {
	
	@Test
	public void welcomeMessageTest()
	{
		LambdaExpression lambdaExpression=new LambdaExpression();
		String welcomeMessageResult=lambdaExpression.welcomeMessage("Welcome to user registration");
		assertSame("Welcome to user registration",welcomeMessageResult);
	}

}
