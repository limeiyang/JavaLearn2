package _4packageManage;

public class Main {
	public static void main(String[] args) {
		//1 ��װ����
		//�������� byte, short, int, long, boolean, float, double, char
		//�������� ������class��interface
		// ���� �������Ϳ��Ը�ֵΪnull ��ʾ�� ���ǻ������Ͳ��ܸ�ֵΪnull
		String s = null;
		//int n = null;//compile error!
		// ��ô��ν�һ������������Ϊ�����������ͣ�
		// ���磬��Ҫ��int�������ͱ��һ���������ͣ����ǿ��Զ���һ��Integer�࣬��ֻ����һ��ʵ���ֶ�int��������Integer��Ϳ�����Ϊint�İ�װ�ࣨWrapper Class��
		// ���� Integer ����ú� �Ϳ��԰�int��Integer����ת��
		Integer1 n = null;
		Integer1 n2 = new Integer1(99);
		int n3 = n2.intValue();
		/*
		 * ʵ���ϣ���Ϊ��װ���ͷǳ����ã�Java���Ŀ�Ϊÿ�ֻ������Ͷ��ṩ�˶�Ӧ�İ�װ���ͣ�
		 * 
		 * ��������	��Ӧ����������
			boolean	java.lang.Boolean
			byte	java.lang.Byte
			short	java.lang.Short
			int	java.lang.Integer
			long	java.lang.Long
			float	java.lang.Float
			double	java.lang.Double
			char	java.lang.Character
		 */
		// ������ֱ��ʹ�� �磺
		float i = 100.0f;//�����ͽ�βҪ��f
        // ͨ��new����������Integerʵ��(���Ƽ�ʹ��,���б��뾯��):
		Float n1 = new Float(i);
        // ͨ����̬����valueOf(float)����Floatʵ��:
		Float n22 = Float.valueOf(i);
        // ͨ����̬����valueOf(String)����Floatʵ��:
		Float n32 = Float.valueOf("100");
        System.out.println(n32.floatValue());
        
        //2 Auto Boxing �Զ�װ����
        // ��Ϊint��Integer���Ի���ת��
        int i1 = 100;
        Integer n11 = Integer.valueOf(i1);
        int x = n11.intValue();
        // ���ԣ�Java���������԰��������Զ���int��Integer֮��ת��
        //Integer n112 = 100; // �������Զ�ʹ��Integer.valueOf(int)
        //int x12 = n112; // �������Զ�ʹ��Integer.intValue()
        //ע�⣺�Զ�װ����Զ�����ֻ�����ڱ���׶Σ�Ŀ����Ϊ����д���롣
        //װ��Ͳ����Ӱ������ִ��Ч�ʣ���Ϊ������class�������ϸ����ֻ������ͺ��������͵ġ����ң��Զ�����ִ��ʱ���ܻᱨNullPointerException��
        
        //3 ������
        // ���еİ�װ���Ͷ��ǲ����ࡣ���ǲ鿴Integer��Դ���֪�����ĺ��Ĵ������� 
        /*
         * public final class Integer {
    			private final int value;
			}
			��ˣ�һ��������Integer���󣬸ö�����ǲ���ġ�
			������Integerʵ�����бȽ�Ҫ�ر�ע�⣺���Բ�����==�Ƚϣ���ΪInteger���������ͣ�����ʹ��equals()�Ƚ�
         */
        Integer x11 = 127;
        Integer y11 = 127;
        Integer m11 = 99999;
        Integer n111 = 99999;
        System.out.println("x == y: " + (x11==y11)); // true
        System.out.println("m == n: " + (m11==n111)); // false
        System.out.println("x.equals(y): " + x11.equals(y11)); // true
        System.out.println("m.equals(n): " + m11.equals(n111)); // true
        
        /*
         * ��ϸ�۲�����ͯЬ���Է��֣�==�Ƚϣ���С��������ͬ��Integer����true���ϴ��������ͬ��Integer����false��������ΪInteger�ǲ����࣬
         * ��������Integer x = 127;�Զ���ΪInteger x = Integer.valueOf(127);��Ϊ�˽�ʡ�ڴ棬Integer.valueOf()���ڽ�С������ʼ�շ�����ͬ��ʵ����
         * ��ˣ�==�Ƚϡ�ǡ�á�Ϊtrue�������Ǿ�������ΪJava��׼���Integer�ڲ��л����Ż�����==�Ƚϣ�������equals()�����Ƚ�����Integer��
         * 
         */
        //
        
        
        
        
        
        
	}
}
