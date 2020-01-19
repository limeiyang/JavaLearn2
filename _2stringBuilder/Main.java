package _2stringBuilder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1 观察下面的循环代码
    	// Java中的String可以直接用＋去拼接字符串
    	String s = "";
    	for (int i = 0; i < 10; i++) {
    	    s = s + "," + i;
    	}
    	System.out.println(s);
    	// 虽然可以直接拼接字符串，但是，在循环中，每次循环都会创建新的字符串对象，然后扔掉旧的字符串。这样，绝大部分字符串都是临时对象，不但浪费内存，还会影响GC效率。
    	// 为了能高效拼接字符串 java标准库提供了StringBuilder 它是一个可变对象，可以预分配缓冲区，这样，往StringBuilder中新增字符时，不会创建新的临时对象
    	StringBuilder sb = new StringBuilder(10);//将可变String大小初始化为10
    	for (int i = 0; i < 10; i++) {
    	    sb.append(',');
    	    sb.append(i);
    	}
    	String s1 = sb.toString();
    	System.out.println(s1);
    	
    	// 1.1 StringBuilder 支持链式操作
    	StringBuilder sb1 = new StringBuilder(1024);
        sb1.append("Mr ")
          .append("Bob")
          .append("!")
          .insert(0, "Hello, ");
        System.out.println(sb1.toString());
        // 类似这样的append的链式操作 如下定义实现----Adder
        Adder adder = new Adder();
        adder.add(3)
             .add(5)
             .inc()
             .add(10);
        System.out.println(adder.value());
     
    }
}
