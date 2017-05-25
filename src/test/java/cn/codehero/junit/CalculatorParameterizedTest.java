package cn.codehero.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//要使用Parameterized的测试运行器来运行一个测试类，必须满足以下要求：
//1.测试类必须使用@RunWith注释,并且要将Parameterized类作为它的参数
@RunWith(value = Parameterized.class)
public class CalculatorParameterizedTest {
	
    //2.必须声明测试中所使用的实例变量	
	private double expected;
	private double valueOne;
	private double valueTwo;
	
	//3.提供一个用@Parameters注释的方法
	//这个方法的签名必须是@Parameters public static java.util.Collection,无任何参数
	//Collection元素必须是相同长度的数组，这个数组的长度必须要和这个唯一的公共构造函数的参数数量相匹配
	@Parameters
	public static Collection<Integer[]> getTestParameters(){
		return Arrays.asList(new Integer[][]{
			{2,1,1}, //expected,valueOne,valueTwo
			{3,2,1},  //expected,valueOne,valueTwo
			{4,3,1},  //expected,valueOne,valueTwo
		});
	}

	//4.可以接受参数的构造函数
	public CalculatorParameterizedTest(double expected,double valueOne ,double valueTwo){
		this.expected = expected;
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
	}
	
	//5.@Test方法：实例化了要测试的类
	@Test 
	public void sum(){
		Calculator calc = new Calculator();
		assertEquals(expected,calc.add(valueOne, valueTwo),0);
	}
	
}