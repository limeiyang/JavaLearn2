package _2stringBuilder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1 �۲������ѭ������
    	// Java�е�String����ֱ���ã�ȥƴ���ַ���
    	String s = "";
    	for (int i = 0; i < 10; i++) {
    	    s = s + "," + i;
    	}
    	System.out.println(s);
    	// ��Ȼ����ֱ��ƴ���ַ��������ǣ���ѭ���У�ÿ��ѭ�����ᴴ���µ��ַ�������Ȼ���ӵ��ɵ��ַ��������������󲿷��ַ���������ʱ���󣬲����˷��ڴ棬����Ӱ��GCЧ�ʡ�
    	// Ϊ���ܸ�Чƴ���ַ��� java��׼���ṩ��StringBuilder ����һ���ɱ���󣬿���Ԥ���仺��������������StringBuilder�������ַ�ʱ�����ᴴ���µ���ʱ����
    	StringBuilder sb = new StringBuilder(10);//���ɱ�String��С��ʼ��Ϊ10
    	for (int i = 0; i < 10; i++) {
    	    sb.append(',');
    	    sb.append(i);
    	}
    	String s1 = sb.toString();
    	System.out.println(s1);
    	
    	// 1.1 StringBuilder ֧����ʽ����
    	StringBuilder sb1 = new StringBuilder(1024);
        sb1.append("Mr ")
          .append("Bob")
          .append("!")
          .insert(0, "Hello, ");
        System.out.println(sb1.toString());
        // ����������append����ʽ���� ���¶���ʵ��----Adder
        Adder adder = new Adder();
        adder.add(3)
             .add(5)
             .inc()
             .add(10);
        System.out.println(adder.value());
     
    }
}
