package _3StringJoiner;

import java.util.StringJoiner;

public class Main {
	public static void main(String[] args) {
		//1 Ҫ��Ч��ƴ���ַ�����Ӧ��ʹ��SringBuilder
		// ƴ�� Hello Bob, Alice, Grace!
		String[] names = {"Bob","Alice","Grace"};
		StringBuilder sb = new StringBuilder();
		sb.append("Hello ");
		/*for(String name:names) {
			sb.append(name).append(", ");
		}*/
		for(int i=0;i<names.length;i++) {
			sb.append(names[i]).append(", ");
		}
		// ȥ�����һ�� ��
		sb.delete(sb.length() - 2, sb.length());
		sb.append("! ");
		System.out.println(sb.toString());
		
		//2 �����÷ָ���ƴ�����������ܳ���������java��׼�⻹�ṩ��һ��StringJoiner���������
		StringJoiner sj = new StringJoiner(", ");
        /*for (String name : names) {
            sj.add(name);
        }*/
		for(int i=0;i<names.length;i++) {
			sj.add(names[i]);
		}
        System.out.println(sj.toString());
        // ���ż�����β
        StringJoiner sj1 = new StringJoiner(", ", "Hello ", "!");//(�ָ�������ͷ����β)
        /*for (String name : names) {
            sj1.add(name);
        }*/
		for(int i=0;i<names.length;i++) {
			sj1.add(names[i]);
		}
		System.out.println(sj1.toString());
		
		//3 String.join()
		// String���ṩ��һ����̬����join()������������ڲ�ʹ����StringJoiner��ƴ���ַ������ڲ���Ҫָ������ͷ���͡���β����ʱ����String.join()�����㣺
		String[] namess = {"Bob", "Alice", "Grace"};
		String s = String.join(", ", namess);
	}
}
