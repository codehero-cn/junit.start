package javase.basic.junit;

import junit.framework.TestCase;
/**
 * 测试类.
 * 1.每个包含测试的类都必须由TestCase继承而来
 * 2.基类TestCase提供了我们所需的大部分的单元测试功能,包括各种断言
 * 3.所有以test开头的方法都会被JUnit自动运行.你也可以通过定义suite方法指定特殊的函数来运行.
 * @author eleven
 *
 */
public class TestLargest extends TestCase{
	/**
	 * 基类TestCase需要一个以String为参数的构造函数,因而我们必须调用super以传递这么一个名字.
	 * 我们不知道这个名字此时是什么,因而我们就仅仅让我们自己的构造函数接受String参数传递给基类.
	 * @param name 好象是随便定的
	 */
	public TestLargest(String name){
		super(name);
	}
	/**
	 * 简单测试
	 */
	public void testSimple(){
		assertEquals(9,Largest.largest(new int[]{7,8,9}));
	}
	/**
	 * 数组中数字不同顺序测试
	 */
	public void testOrder(){
		assertEquals(9,Largest.largest(new int[]{9,8,7}));
		assertEquals(9,Largest.largest(new int[]{7,9,8}));
		assertEquals(9,Largest.largest(new int[]{7,8,9}));
	}
	/**
	 * 数组中有重复数字的情况测试
	 */
	public void testDups(){
		assertEquals(9,Largest.largest(new int[]{9,7,9,8}));
	}
	/**
	 * 数组中只有一个数字
	 */
	public void testOne(){
		assertEquals(1,Largest.largest(new int[]{1}));
	}
	/**
	 * 都是负值的list
	 */
	public void testNegative(){
		int[] negList = new int[] {-9,-8,-7};
		assertEquals(-7,Largest.largest(negList));
	}
	/**
	 * 空数组
	 */
	public void testEmpty(){
		try{
			Largest.largest(new int[]{});
			fail("Should have thrown an exception");
		}catch(RuntimeException e){
			assertTrue(true);
		}
	}
}
