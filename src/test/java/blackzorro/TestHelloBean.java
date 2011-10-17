import org.junit.Test;

import main.java.blackzorro.HelloBean;
import junit.framework.Assert;
import junit.framework.TestCase;


public class TestHelloBean {
@Test
	public void testSimpleMessage() {
	     String message = new HelloBean("Maven 2").sayHello();
	     Assert.assertEquals("Test Hello Machine", "Hello, Maven 2", message);
	  } 
	
}
