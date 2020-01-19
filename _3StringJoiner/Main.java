package _3StringJoiner;

import java.util.StringJoiner;

public class Main {
	public static void main(String[] args) {
		//1 要高效的拼接字符串，应该使用SringBuilder
		// 拼接 Hello Bob, Alice, Grace!
		String[] names = {"Bob","Alice","Grace"};
		StringBuilder sb = new StringBuilder();
		sb.append("Hello ");
		/*for(String name:names) {
			sb.append(name).append(", ");
		}*/
		for(int i=0;i<names.length;i++) {
			sb.append(names[i]).append(", ");
		}
		// 去掉最后一个 ，
		sb.delete(sb.length() - 2, sb.length());
		sb.append("! ");
		System.out.println(sb.toString());
		
		//2 类似用分隔符拼接数组的需求很常见，所以java标准库还提供了一个StringJoiner来干这个事
		StringJoiner sj = new StringJoiner(", ");
        /*for (String name : names) {
            sj.add(name);
        }*/
		for(int i=0;i<names.length;i++) {
			sj.add(names[i]);
		}
        System.out.println(sj.toString());
        // 接着加入首尾
        StringJoiner sj1 = new StringJoiner(", ", "Hello ", "!");//(分隔符，开头，结尾)
        /*for (String name : names) {
            sj1.add(name);
        }*/
		for(int i=0;i<names.length;i++) {
			sj1.add(names[i]);
		}
		System.out.println(sj1.toString());
		
		//3 String.join()
		// String还提供了一个静态方法join()，这个方法在内部使用了StringJoiner来拼接字符串，在不需要指定“开头”和“结尾”的时候，用String.join()更方便：
		String[] namess = {"Bob", "Alice", "Grace"};
		String s = String.join(", ", namess);
	}
}
