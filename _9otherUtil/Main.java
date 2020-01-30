package _9otherUtil;

import java.security.SecureRandom;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		//1 Math--数学计算
		Math.abs(-100); //绝对值 100
		Math.abs(-7.8); // 7.8
		Math.max(100, 99); //取最大值 100
		Math.min(1.2, 2.3); // 1.2
		Math.pow(2, 10); // 2的10次方=1024
		Math.sqrt(2); // 开2次根号 1.414...
		Math.exp(2); // e的2 次方 7.389...
		Math.log(4); // 以e为底的对数 1.386...
		Math.log10(100); // 以10为底的对数 2
		// 三角函数
		Math.sin(3.14); // 0.00159...
		Math.cos(3.14); // -0.9999...
		Math.tan(3.14); // -0.0015...
		Math.asin(1.0); // 1.57079...
		Math.acos(1.0); // 0.0
		//数学常数
		double pi = Math.PI; // 3.14159...
		double e = Math.E; // 2.7182818...
		Math.sin(Math.PI / 6); // sin(π/6) = 0.5
		//随机数
		Math.random(); // 0.53907... 每次都不一样
		double x = Math.random(); // x的范围是[0,1)
	    double min = 10;
	    double max = 50;
        double y = x * (max - min) + min; // y的范围是[10,50)
        long n = (long) y; // n的范围是[10,50)的整数
        System.out.println(y);
        System.out.println(n);
        
        //2 Random --伪随机数
        // Random用来创建伪随机数。所谓伪随机数，是指只要给定一个初始的种子，产生的随机数序列是完全一样的。
        // 要生成一个随机数，可以使用nextInt()、nextLong()、nextFloat()、nextDouble()
        Random r = new Random();
        r.nextInt(); // 2071575453,每次都不一样
        r.nextInt(10); // 5,生成一个[0,10)之间的int
        r.nextLong(); // 8811649292570369305,每次都不一样
        r.nextFloat(); // 0.54335...生成一个[0,1)之间的float
        r.nextDouble(); // 0.3716...生成一个[0,1)之间的double
        // 前面的没有伪随机数 因为没有给定种子 创建Random实例时，如果不给定种子，就使用系统当前时间戳作为种子，因此每次运行时，种子不同，得到的伪随机数序列就不同。
        Random r1 = new Random(12345);
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+r1.nextInt(100));//51 80 41 28 55 84 75 2 1 89 一直是
        }
        
        //3 SecureRandom --真随机数
        // 实际上真正的真随机数只能通过量子力学原理来获取，而我们想要的是一个不可预测的安全的随机数，SecureRandom就是用来创建安全的随机数的
        SecureRandom sr = new SecureRandom();
        System.out.println(sr.nextInt(100));
	}
}
