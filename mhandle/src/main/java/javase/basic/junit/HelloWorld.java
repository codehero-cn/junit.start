package javase.basic.junit;
/**
 * "maven实战"书中的案例
 * @author eleven
 * "maven实战”中的第3章例子
 */
public class HelloWorld
{
	public String sayHello()
	{
		return "Hello Maven";
	}
	
	public static void main(String[] args)

	{
		System.out.print(new HelloWorld().sayHello());
	}
}