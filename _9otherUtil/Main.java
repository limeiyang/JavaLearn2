package _9otherUtil;

import java.security.SecureRandom;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		//1 Math--��ѧ����
		Math.abs(-100); //����ֵ 100
		Math.abs(-7.8); // 7.8
		Math.max(100, 99); //ȡ���ֵ 100
		Math.min(1.2, 2.3); // 1.2
		Math.pow(2, 10); // 2��10�η�=1024
		Math.sqrt(2); // ��2�θ��� 1.414...
		Math.exp(2); // e��2 �η� 7.389...
		Math.log(4); // ��eΪ�׵Ķ��� 1.386...
		Math.log10(100); // ��10Ϊ�׵Ķ��� 2
		// ���Ǻ���
		Math.sin(3.14); // 0.00159...
		Math.cos(3.14); // -0.9999...
		Math.tan(3.14); // -0.0015...
		Math.asin(1.0); // 1.57079...
		Math.acos(1.0); // 0.0
		//��ѧ����
		double pi = Math.PI; // 3.14159...
		double e = Math.E; // 2.7182818...
		Math.sin(Math.PI / 6); // sin(��/6) = 0.5
		//�����
		Math.random(); // 0.53907... ÿ�ζ���һ��
		double x = Math.random(); // x�ķ�Χ��[0,1)
	    double min = 10;
	    double max = 50;
        double y = x * (max - min) + min; // y�ķ�Χ��[10,50)
        long n = (long) y; // n�ķ�Χ��[10,50)������
        System.out.println(y);
        System.out.println(n);
        
        //2 Random --α�����
        // Random��������α���������να���������ָֻҪ����һ����ʼ�����ӣ��������������������ȫһ���ġ�
        // Ҫ����һ�������������ʹ��nextInt()��nextLong()��nextFloat()��nextDouble()
        Random r = new Random();
        r.nextInt(); // 2071575453,ÿ�ζ���һ��
        r.nextInt(10); // 5,����һ��[0,10)֮���int
        r.nextLong(); // 8811649292570369305,ÿ�ζ���һ��
        r.nextFloat(); // 0.54335...����һ��[0,1)֮���float
        r.nextDouble(); // 0.3716...����һ��[0,1)֮���double
        // ǰ���û��α����� ��Ϊû�и������� ����Randomʵ��ʱ��������������ӣ���ʹ��ϵͳ��ǰʱ�����Ϊ���ӣ����ÿ������ʱ�����Ӳ�ͬ���õ���α��������оͲ�ͬ��
        Random r1 = new Random(12345);
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+r1.nextInt(100));//51 80 41 28 55 84 75 2 1 89 һֱ��
        }
        
        //3 SecureRandom --�������
        // ʵ�����������������ֻ��ͨ��������ѧԭ������ȡ����������Ҫ����һ������Ԥ��İ�ȫ���������SecureRandom��������������ȫ���������
        SecureRandom sr = new SecureRandom();
        System.out.println(sr.nextInt(100));
	}
}
