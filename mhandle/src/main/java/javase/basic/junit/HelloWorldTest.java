package javase.basic.junit;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * @author eleven
 * "maven实战”中的第3.4章,编写测试代码
 */
public class HelloWorldTest
{
	@Test
	public void sayHello()
	{
		HelloWorld helloWorld = new HelloWorld();
		
		String result =helloWorld.sayHello();
		
		assertEquals("Hello Maven",result);	
	}	
}