package _1string;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//��Java�� String��һ���������ͣ�������Ҳ��һ��class
		String s1 = "Hello";
		//ʵ�����ַ�����String�ڲ���ͨ��char[]�����ʾ�ģ���ˣ��������д��
		String s2 = new String(new char[] {'H', 'e', 'l', 'l', 'o'});
		//��ΪString̫�����ˣ�����Java�ṩ��"..."�����ַ�����������ʾ����
		
		//1 ���ɱ�����
		System.out.println(s1);//Hello
		s1 = s1.toUpperCase();
		System.out.println(s1);//HELLO
		
		//2 �ַ����Ƚ�
		// �������� �����õ��ں�  ����Ҫ��equals()����
		s1 = "Hello";
		String s3 = "Hello";
		System.out.println(s1 == s3);//true
		//��ȻҲ��true ����ʵ��������ΪJava����ͬ�ַ����Ķ������ͬһ��������
		// ����Ͳ���true��
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//true
		// ���Ӵ�Сд�ıȽ� ��equalsIgnoreCase()
		
		//3 �����Ӵ��ķ���
		// 3.1 �Ƿ����
		System.out.println("Hello".contains("ll"));//true
		// 3.2 �����ļ����� 
		//  indexOf() ����ĳ��ָ�����ַ������ַ����״γ��ֵ�λ�ã�����ֵ������������ ��һ�� ��������ֵ��
		System.out.println("Hello".indexOf("l"));//2
		//  lastIndexOf() �����������ĳ���ַ������ַ����� ���һ�γ��ֵ�λ��(���������� ��һ�� ��������ֵ) 
		System.out.println("Hello".lastIndexOf("l"));//3
		// 3.4 ���������Ӵ�
		System.out.println("Hello".startsWith("He"));//true
		System.out.println("Hello".endsWith("lo"));//true
		
		//4 ��ȡ�Ӵ�
		System.out.println("Hello".substring(2));//��ȡ[2,...]
		System.out.println("Hello".substring(2, 4));//��ȡ[2,4)
		
		//5 ȥ����β�հ��ַ�
		// 5.1 trim() �Ƴ��ַ���β�հ��ַ����հ��ַ����� \t, \r, \n
		System.out.println("\tHello\r!\n!");
		System.out.println("\tHello\r!\n!".trim());//��ȥ��β
		//  ע��:trim() ��û�иı��ַ��������ݣ����Ƿ�����һ�����ַ�����
		// 5.2 strip() �Ƴ��ַ���β�հ��ַ����������Ŀո�\u3000
		System.out.println("\u3000Hello\u3000");
		//System.out.println("\u3000Hello\u3000".strip());
		// 5.3 ������
		//" Hello ".stripLeading(); // "Hello "
		//" Hello ".stripTrailing(); // " Hello"
		
		//6 �ж� ��
		// isEmpty() :�ж����ַ����Ƿ�Ϊ��
		// isBlank() :�ж��Ƿ�Ϊ�հ��ַ���
		"".isEmpty(); // true����Ϊ�ַ�������Ϊ0
		"  ".isEmpty(); // false����Ϊ�ַ������Ȳ�Ϊ0
		//"  \n".isBlank(); // true����Ϊֻ�����հ��ַ�
		//" Hello ".isBlank(); // false����Ϊ�����ǿհ��ַ�
		
		//7 �滻�Ӵ�
		// 7.1 �����ַ����ַ����滻
		String s = "hello";
		s.replace('l', 'w'); // "hewwo"�������ַ�'l'���滻Ϊ'w'
		s.replace("ll", "~~"); // "he~~o"�������Ӵ�"ll"���滻Ϊ"~~"
		// 7.2 ����������ʽ�滻
		String s12 = "A,,B;C ,D";
		s12.replaceAll("[\\,\\;\\s]+", ","); // "A,B,C,D"
		//  ����Ĵ���ͨ��������ʽ����ƥ����Ӵ�ͳһ�滻Ϊ","��
		
		//8 �ָ��ַ���
		// ��split() ���������Ҵ����Ҳ��������ʽ
		String s13 = "A,B,C,D";
		String[] s13s = s13.split("\\,");// {"A", "B", "C", "D"}
		
		//9 ƴ���ַ���
		//ƴ���ַ���ʹ�þ�̬����join()������ָ�����ַ��������ַ�������
		String[] arr = {"A", "B", "C"};
		String s22 = String.join("***", arr); // "A***B***C"
		
		//10 ����ת��
		// 10.1 ����������� -> �ַ��� 
		//  ʹ�þ�̬����valueOf()������һ�����ط���������������ݲ����Զ�ѡ����ʵķ���
		String.valueOf(123); // "123"
		String.valueOf(45.67); // "45.67"
		String.valueOf(true); // "true"
		String.valueOf(new Object()); // ����java.lang.Object@636be97c
		// 10.2 String -> int 
		int n1 = Integer.parseInt("123"); // 123
		int n2 = Integer.parseInt("ff", 16); // ��ʮ������ת����255
		//  ���� ��Ҫ�ر�ע�⣬Integer�и�getInteger(String)�����������ǽ��ַ���ת��Ϊint�����ǰѸ��ַ�����Ӧ��ϵͳ����ת��ΪInteger
		Integer.getInteger("java.version"); // �汾�ţ�11
		// 10.3 String -> boolean
		boolean b1 = Boolean.parseBoolean("true"); // true
		boolean b2 = Boolean.parseBoolean("FALSE"); // false
		// 10.4 String �� char[] ����ת��
		char[] cs = "Hello".toCharArray(); // String -> char[]
		String s11 = new String(cs); // char[] -> String
		
		//10  11�� �۲�������
		char[] cs1 = "Hello".toCharArray();
        String s21 = new String(cs);
        System.out.println(s21);//Hello
        cs1[0] = 'X';
        System.out.println(s21);//Hello
        // һ�� ��Ϊnew String ����Stringʵ��ʱ ����ֱ�����ô�������� ��ֱ�Ӹ���һ��
        
        //10  12�� �۲�����Ľ��
        int[] scores = new int[] { 88, 77, 51, 66 };
        Score s111 = new Score(scores);
        s111.printScores();//[88, 77, 51, 66]
        scores[2] = 99;
        s111.printScores();//[88, 77, 99, 66]
        //�۲��������������Score�ڲ�ֱ���������ⲿ�����int[]���飬�������ⲿ�����int[]������޸ģ�Ӱ�쵽Score����ֶΡ�����ⲿ���벻���ţ���ͻ���ɰ�ȫ������
        //�޸ķ��� ��Score�еĹ��캯�������޸� ���鿴class Score
        
        //11 �ַ�����
        /*
                * ��ʱ�䷢չ������������������
         * 1 ASCII 0��127 �������е�Ӣ����ĸ�����ֺͳ��÷���
         * 2 GB2312 ר����Ժ��ֵı���
         * 3 Unicode ������������Ҫ���Զ������� 
         * 4 UTF-8 �Ľ���Unicode �ɱ䳤 ���׳��� 
         */
        // ��Java�У�char����ʵ���Ͼ��������ֽڵ�Unicode����
        byte[] b11 = "Hello".getBytes(); // ��ISO8859-1����ת�������Ƽ�
        byte[] b21 = "Hello".getBytes("UTF-8"); // ��UTF-8����ת��
        byte[] b211 = "Hello".getBytes("GBK"); // ��GBK����ת��
        byte[] b3 = "Hello".getBytes(StandardCharsets.UTF_8); // ��UTF-8����ת��
        System.out.print(b11);
        // ת������󣬾Ͳ�����char���ͣ�����byte���ͱ�ʾ������
        // byte[]ת��ΪString 
        /*byte[] b = ...
        String s1 = new String(b, "GBK"); // ��GBKת��
        String s2 = new String(b, StandardCharsets.UTF_8); // ��UTF-8ת��
        */
        // ʼ���μǣ�Java��String��char���ڴ���������Unicode�����ʾ
        
        
        
	}
}
