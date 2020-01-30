package _8BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
	public static void main(String[] args) {
		//1 和bigInteger类似，BigDecimal可以表示一个任意大小且精度完全准确的浮点数
		BigDecimal bd = new BigDecimal("123.4567");
		System.out.println(bd.multiply(bd)); // 15241.55677489\
		
		//2 BigDecimal用scale()表示小数位数
		BigDecimal d1 = new BigDecimal("123.45");
		BigDecimal d2 = new BigDecimal("123.4500");
		BigDecimal d3 = new BigDecimal("1234500");
		System.out.println(d1.scale()); // 2,两位小数
		System.out.println(d2.scale()); // 4
		System.out.println(d3.scale()); // 0
		
		//3 去掉末尾的o -- stripTrailingZeros()
		BigDecimal d11 = new BigDecimal("123.4500");
		BigDecimal d21 = d11.stripTrailingZeros();
		System.out.println(d11.scale()); // 4
		System.out.println(d21.scale()); // 2,因为去掉了00

		BigDecimal d31 = new BigDecimal("1234500");
		BigDecimal d4 = d31.stripTrailingZeros();
		System.out.println(d31);//1234500
		System.out.println(d31.scale()); // 0
		System.out.println(d4);//1.2345E+6
		System.out.println(d4.scale()); // -2
		
		//4 对一个BigDecimal设置scale
		// 可以对一个BigDecimal设置它的scale，如果精度比原始值低，那么按照指定的方法进行四舍五入或者直接截断
		BigDecimal d111 = new BigDecimal("123.456789");
        BigDecimal d211 = d111.setScale(4, RoundingMode.HALF_UP); // 四舍五入，123.4568
        BigDecimal d311 = d111.setScale(4, RoundingMode.DOWN); // 直接截断，123.4567
        System.out.println(d211);//123.4568
        System.out.println(d311);//123.4567
        
        //5 加减乘除
        // 对BigDecimal做加、减、乘时，精度不会丢失，但是做除法时，存在无法除尽的情况，这时，就必须指定精度以及如何进行截断
        BigDecimal d1111 = new BigDecimal("123.456");
        BigDecimal d2111 = new BigDecimal("23.456789");
        BigDecimal d3111 = d1111.divide(d2111, 10, RoundingMode.HALF_UP); // 保留10位小数并四舍五入
        //BigDecimal d41 = d1111.divide(d2111); // 报错：ArithmeticException，因为除不尽
        System.out.println(d3111);//5.2631244626
        // 还可以除法的同时求余数
        BigDecimal n = new BigDecimal("12.345");
        BigDecimal m = new BigDecimal("0.12");
        BigDecimal[] dr = n.divideAndRemainder(m);
        System.out.println(dr[0]); // 102 商
        System.out.println(dr[1]); // 0.105 余数
        //调用divideAndRemainder()方法时，返回的数组包含两个BigDecimal，分别是商和余数，其中商总是整数，余数不会大于除数。
        // 可以判断dr[1]==0 ? 来判断两个BigDecimal是否可以整除
        
        //6 比较BigDecimal
        // 在比较两个BigDecimal的值是否相等时，要特别注意，使用equals()方法不但要求两个BigDecimal的值相等，还要求它们的scale()相等
        BigDecimal d12 = new BigDecimal("123.456");
        BigDecimal d22 = new BigDecimal("123.45600");
        System.out.println(d12.equals(d22)); // false,因为scale不同
        System.out.println(d12.equals(d22.stripTrailingZeros())); // true,因为d2去除尾部0后scale变为2
        System.out.println(d12.compareTo(d22)); // 0
        // 必须使用compareTo()方法来比较，它根据两个值的大小分别返回负数、正数和0，分别表示小于、大于和等于
        
        
	}
	
}
