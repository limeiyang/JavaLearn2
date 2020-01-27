package _7BigInteger;

import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		//1 BigInteger ����
		// ��java�У���CPUԭ���ṩ���������Χ��64λlong��������ʹ��long����������ֱ��ͨ��CPUָ����м��㣬�ٶȷǳ��졣
		// �������ʹ�õ�������Χ������long����ô�죿���ʱ�򣬾�ֻ���������ģ��һ����������java.math.BigInteger����������ʾ�����С��������BigInteger�ڲ���һ��int[]������ģ��һ���ǳ��������
		BigInteger bi = new BigInteger("1234567890");
		System.out.println(bi.pow(5));//2867971860299718107233761438093672048294900000
		
		//2 �ӷ�����
		// ��BigInteger�������ʱ��ֻ��ʹ��ʵ������
		BigInteger i1 = new BigInteger("1234567890");
		BigInteger i2 = new BigInteger("12345678901234567890");
		BigInteger sum = i1.add(i2); // 12345678902469135780
		// ��long����������ȣ�BigInteger�����з�Χ���ƣ���ȱ�����ٶȱȽ�����
		
		//3 BigInteger -> int
		BigInteger i = new BigInteger("123456789");
		System.out.println(i.longValue());//123456789
		System.out.println(i.multiply(i).longValueExact()); // java.lang.ArithmeticException: BigInteger out of long range
		// a.multiply(b) : a*b
		// ʹ��longValueExact()����ʱ�����������long�͵ķ�Χ�����׳�ArithmeticException
		
		//4 BigInteger -> others
		/*
		 BigInteger��Integer��Longһ����Ҳ�ǲ��ɱ��࣬����Ҳ�̳���Number�ࡣ��ΪNumber������ת��Ϊ�������͵ļ���������
			ת��Ϊbyte��byteValue()
			ת��Ϊshort��shortValue()
			ת��Ϊint��intValue()
			ת��Ϊlong��longValue()
			ת��Ϊfloat��floatValue()
			ת��Ϊdouble��doubleValue()
			��ˣ�ͨ���������������԰�BigIntegerת���ɻ������͡����BigInteger��ʾ�ķ�Χ�����˻������͵ķ�Χ��ת��ʱ����ʧ��λ��Ϣ���������һ����׼ȷ�ġ������Ҫ׼ȷ��ת���ɻ������ͣ�����ʹ��intValueExact()��longValueExact()�ȷ�������ת��ʱ���������Χ����ֱ���׳�ArithmeticException�쳣
		 */
		// float ������Χ
		BigInteger n = new BigInteger("999999").pow(99);
        float f = n.floatValue();
        System.out.println(f);// Infinity (����)
	}
}