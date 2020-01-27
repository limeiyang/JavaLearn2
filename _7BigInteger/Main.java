package _7BigInteger;

import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		//1 BigInteger 大数
		// 在java中，由CPU原生提供的整型最大范围是64位long型整数。使用long型整数可以直接通过CPU指令进行计算，速度非常快。
		// 如果我们使用的整数范围超过了long型怎么办？这个时候，就只能用软件来模拟一个大整数。java.math.BigInteger就是用来表示任意大小的整数。BigInteger内部用一个int[]数组来模拟一个非常大的整数
		BigInteger bi = new BigInteger("1234567890");
		System.out.println(bi.pow(5));//2867971860299718107233761438093672048294900000
		
		//2 加法运算
		// 对BigInteger做运算的时候，只能使用实例方法
		BigInteger i1 = new BigInteger("1234567890");
		BigInteger i2 = new BigInteger("12345678901234567890");
		BigInteger sum = i1.add(i2); // 12345678902469135780
		// 和long型整数运算比，BigInteger不会有范围限制，但缺点是速度比较慢。
		
		//3 BigInteger -> int
		BigInteger i = new BigInteger("123456789");
		System.out.println(i.longValue());//123456789
		System.out.println(i.multiply(i).longValueExact()); // java.lang.ArithmeticException: BigInteger out of long range
		// a.multiply(b) : a*b
		// 使用longValueExact()方法时，如果超出了long型的范围，会抛出ArithmeticException
		
		//4 BigInteger -> others
		/*
		 BigInteger和Integer、Long一样，也是不可变类，并且也继承自Number类。因为Number定义了转换为基本类型的几个方法：
			转换为byte：byteValue()
			转换为short：shortValue()
			转换为int：intValue()
			转换为long：longValue()
			转换为float：floatValue()
			转换为double：doubleValue()
			因此，通过上述方法，可以把BigInteger转换成基本类型。如果BigInteger表示的范围超过了基本类型的范围，转换时将丢失高位信息，即结果不一定是准确的。如果需要准确地转换成基本类型，可以使用intValueExact()、longValueExact()等方法，在转换时如果超出范围，将直接抛出ArithmeticException异常
		 */
		// float 超过范围
		BigInteger n = new BigInteger("999999").pow(99);
        float f = n.floatValue();
        System.out.println(f);// Infinity (无穷)
	}
}