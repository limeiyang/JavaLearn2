package _5javaBean;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;


//avaBean��Ҫ�����������ݣ�����һ��������ϳ�һ��JavaBean���ڴ��䡣���⣬JavaBean���Է���ر�IDE���߷��������ɶ�д���ԵĴ��룬��Ҫ����ͼ�ν���Ŀ��ӻ�����С�
public class Main {
	public static void main(String[] args) throws Exception {
        BeanInfo info = Introspector.getBeanInfo(Person.class);
        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            System.out.println(pd.getName());
            System.out.println("  " + pd.getReadMethod());
            System.out.println("  " + pd.getWriteMethod());
        }
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
