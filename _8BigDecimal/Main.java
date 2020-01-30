package _8BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
	public static void main(String[] args) {
		//1 ��bigInteger���ƣ�BigDecimal���Ա�ʾһ�������С�Ҿ�����ȫ׼ȷ�ĸ�����
		BigDecimal bd = new BigDecimal("123.4567");
		System.out.println(bd.multiply(bd)); // 15241.55677489\
		
		//2 BigDecimal��scale()��ʾС��λ��
		BigDecimal d1 = new BigDecimal("123.45");
		BigDecimal d2 = new BigDecimal("123.4500");
		BigDecimal d3 = new BigDecimal("1234500");
		System.out.println(d1.scale()); // 2,��λС��
		System.out.println(d2.scale()); // 4
		System.out.println(d3.scale()); // 0
		
		//3 ȥ��ĩβ��o -- stripTrailingZeros()
		BigDecimal d11 = new BigDecimal("123.4500");
		BigDecimal d21 = d11.stripTrailingZeros();
		System.out.println(d11.scale()); // 4
		System.out.println(d21.scale()); // 2,��Ϊȥ����00

		BigDecimal d31 = new BigDecimal("1234500");
		BigDecimal d4 = d31.stripTrailingZeros();
		System.out.println(d31);//1234500
		System.out.println(d31.scale()); // 0
		System.out.println(d4);//1.2345E+6
		System.out.println(d4.scale()); // -2
		
		//4 ��һ��BigDecimal����scale
		// ���Զ�һ��BigDecimal��������scale��������ȱ�ԭʼֵ�ͣ���ô����ָ���ķ������������������ֱ�ӽض�
		BigDecimal d111 = new BigDecimal("123.456789");
        BigDecimal d211 = d111.setScale(4, RoundingMode.HALF_UP); // �������룬123.4568
        BigDecimal d311 = d111.setScale(4, RoundingMode.DOWN); // ֱ�ӽضϣ�123.4567
        System.out.println(d211);//123.4568
        System.out.println(d311);//123.4567
        
        //5 �Ӽ��˳�
        // ��BigDecimal���ӡ�������ʱ�����Ȳ��ᶪʧ������������ʱ�������޷��������������ʱ���ͱ���ָ�������Լ���ν��нض�
        BigDecimal d1111 = new BigDecimal("123.456");
        BigDecimal d2111 = new BigDecimal("23.456789");
        BigDecimal d3111 = d1111.divide(d2111, 10, RoundingMode.HALF_UP); // ����10λС������������
        //BigDecimal d41 = d1111.divide(d2111); // ����ArithmeticException����Ϊ������
        System.out.println(d3111);//5.2631244626
        // �����Գ�����ͬʱ������
        BigDecimal n = new BigDecimal("12.345");
        BigDecimal m = new BigDecimal("0.12");
        BigDecimal[] dr = n.divideAndRemainder(m);
        System.out.println(dr[0]); // 102 ��
        System.out.println(dr[1]); // 0.105 ����
        //����divideAndRemainder()����ʱ�����ص������������BigDecimal���ֱ����̺���������������������������������ڳ�����
        // �����ж�dr[1]==0 ? ���ж�����BigDecimal�Ƿ��������
        
        //6 �Ƚ�BigDecimal
        // �ڱȽ�����BigDecimal��ֵ�Ƿ����ʱ��Ҫ�ر�ע�⣬ʹ��equals()��������Ҫ������BigDecimal��ֵ��ȣ���Ҫ�����ǵ�scale()���
        BigDecimal d12 = new BigDecimal("123.456");
        BigDecimal d22 = new BigDecimal("123.45600");
        System.out.println(d12.equals(d22)); // false,��Ϊscale��ͬ
        System.out.println(d12.equals(d22.stripTrailingZeros())); // true,��Ϊd2ȥ��β��0��scale��Ϊ2
        System.out.println(d12.compareTo(d22)); // 0
        // ����ʹ��compareTo()�������Ƚϣ�����������ֵ�Ĵ�С�ֱ𷵻ظ�����������0���ֱ��ʾС�ڡ����ں͵���
        
        
	}
	
}
