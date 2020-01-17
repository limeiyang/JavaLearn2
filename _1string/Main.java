package _1string;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//在Java中 String是一个引用类型，它本身也是一个class
		String s1 = "Hello";
		//实际上字符串在String内部是通过char[]数组表示的，因此，按下面的写法
		String s2 = new String(new char[] {'H', 'e', 'l', 'l', 'o'});
		//因为String太常用了，所以Java提供了"..."这种字符串字面量表示方法
		
		//1 不可变特性
		System.out.println(s1);//Hello
		s1 = s1.toUpperCase();
		System.out.println(s1);//HELLO
		
		//2 字符串比较
		// 引用类型 不能用等于号  必须要用equals()方法
		s1 = "Hello";
		String s3 = "Hello";
		System.out.println(s1 == s3);//true
		//虽然也是true 但是实际上是因为Java对相同字符串的对象放入同一个常量池
		// 下面就不是true啦
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//true
		// 忽视大小写的比较 用equalsIgnoreCase()
		
		//3 搜索子串的方法
		// 3.1 是否包含
		System.out.println("Hello".contains("ll"));//true
		// 3.2 索引文件方法 
		//  indexOf() 查找某个指定的字符串在字符串首次出现的位置（索引值）（即从左到右 第一个 返回索引值）
		System.out.println("Hello".indexOf("l"));//2
		//  lastIndexOf() 从右向左查找某个字符串再字符串中 最后一次出现的位置(即从右向左 第一个 返回索引值) 
		System.out.println("Hello".lastIndexOf("l"));//3
		// 3.4 其他搜索子串
		System.out.println("Hello".startsWith("He"));//true
		System.out.println("Hello".endsWith("lo"));//true
		
		//4 提取子串
		System.out.println("Hello".substring(2));//提取[2,...]
		System.out.println("Hello".substring(2, 4));//提取[2,4)
		
		//5 去除首尾空白字符
		// 5.1 trim() 移除字符首尾空白字符。空白字符包括 \t, \r, \n
		System.out.println("\tHello\r!\n!");
		System.out.println("\tHello\r!\n!".trim());//除去首尾
		//  注意:trim() 并没有改变字符串的内容，而是返回了一个新字符串。
		// 5.2 strip() 移除字符首尾空白字符。包括中文空格\u3000
		System.out.println("\u3000Hello\u3000");
		//System.out.println("\u3000Hello\u3000".strip());
		// 5.3 其他的
		//" Hello ".stripLeading(); // "Hello "
		//" Hello ".stripTrailing(); // " Hello"
		
		//6 判断 空
		// isEmpty() :判断是字符串是否为空
		// isBlank() :判断是否为空白字符串
		"".isEmpty(); // true，因为字符串长度为0
		"  ".isEmpty(); // false，因为字符串长度不为0
		//"  \n".isBlank(); // true，因为只包含空白字符
		//" Hello ".isBlank(); // false，因为包含非空白字符
		
		//7 替换子串
		// 7.1 根据字符或字符串替换
		String s = "hello";
		s.replace('l', 'w'); // "hewwo"，所有字符'l'被替换为'w'
		s.replace("ll", "~~"); // "he~~o"，所有子串"ll"被替换为"~~"
		// 7.2 根据正则表达式替换
		String s12 = "A,,B;C ,D";
		s12.replaceAll("[\\,\\;\\s]+", ","); // "A,B,C,D"
		//  上面的代码通过正则表达式，把匹配的子串统一替换为","。
		
		//8 分割字符串
		// 用split() 方法，并且传入的也是正则表达式
		String s13 = "A,B,C,D";
		String[] s13s = s13.split("\\,");// {"A", "B", "C", "D"}
		
		//9 拼接字符串
		//拼接字符串使用静态方法join()，它用指定的字符串连接字符串数组
		String[] arr = {"A", "B", "C"};
		String s22 = String.join("***", arr); // "A***B***C"
		
		//10 类型转换
		// 10.1 任意基本类型 -> 字符串 
		//  使用静态方法valueOf()。这是一个重载方法，编译器会根据参数自动选择合适的方法
		String.valueOf(123); // "123"
		String.valueOf(45.67); // "45.67"
		String.valueOf(true); // "true"
		String.valueOf(new Object()); // 类似java.lang.Object@636be97c
		// 10.2 String -> int 
		int n1 = Integer.parseInt("123"); // 123
		int n2 = Integer.parseInt("ff", 16); // 按十六进制转换，255
		//  特殊 ：要特别注意，Integer有个getInteger(String)方法，它不是将字符串转换为int，而是把该字符串对应的系统变量转换为Integer
		Integer.getInteger("java.version"); // 版本号，11
		// 10.3 String -> boolean
		boolean b1 = Boolean.parseBoolean("true"); // true
		boolean b2 = Boolean.parseBoolean("FALSE"); // false
		// 10.4 String 和 char[] 互相转换
		char[] cs = "Hello".toCharArray(); // String -> char[]
		String s11 = new String(cs); // char[] -> String
		
		//10  11补 观察输出结果
		char[] cs1 = "Hello".toCharArray();
        String s21 = new String(cs);
        System.out.println(s21);//Hello
        cs1[0] = 'X';
        System.out.println(s21);//Hello
        // 一样 因为new String 创建String实例时 不会直接引用传入的数组 会直接复制一份
        
        //10  12补 观察输出的结果
        int[] scores = new int[] { 88, 77, 51, 66 };
        Score s111 = new Score(scores);
        s111.printScores();//[88, 77, 51, 66]
        scores[2] = 99;
        s111.printScores();//[88, 77, 99, 66]
        //观察两次输出，由于Score内部直接引用了外部传入的int[]数组，这会造成外部代码对int[]数组的修改，影响到Score类的字段。如果外部代码不可信，这就会造成安全隐患。
        //修改方法 对Score中的构造函数进行修改 即查看class Score
        
        //11 字符编码
        /*
                * 按时间发展·········
         * 1 ASCII 0到127 包含所有的英文字母，数字和常用符号
         * 2 GB2312 专门针对汉字的编码
         * 3 Unicode 世界上所有主要语言都包含了 
         * 4 UTF-8 改进的Unicode 可变长 不易出错 
         */
        // 在Java中，char类型实际上就是两个字节的Unicode编码
        byte[] b11 = "Hello".getBytes(); // 按ISO8859-1编码转换，不推荐
        byte[] b21 = "Hello".getBytes("UTF-8"); // 按UTF-8编码转换
        byte[] b211 = "Hello".getBytes("GBK"); // 按GBK编码转换
        byte[] b3 = "Hello".getBytes(StandardCharsets.UTF_8); // 按UTF-8编码转换
        System.out.print(b11);
        // 转换编码后，就不再是char类型，而是byte类型表示的数组
        // byte[]转换为String 
        /*byte[] b = ...
        String s1 = new String(b, "GBK"); // 按GBK转换
        String s2 = new String(b, StandardCharsets.UTF_8); // 按UTF-8转换
        */
        // 始终牢记：Java的String和char在内存中总是以Unicode编码表示
        
        
        
	}
}
