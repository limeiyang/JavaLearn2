package _4packageManage;

public class Main {
	public static void main(String[] args) {
		//1 包装类型
		//基本类型 byte, short, int, long, boolean, float, double, char
		//引用类型 ：所有class和interface
		// 其中 引用类型可以赋值为null 表示空 但是基本类型不能赋值为null
		String s = null;
		//int n = null;//compile error!
		// 那么如何将一个基本类型视为对象（引用类型）
		// 比如，想要把int基本类型变成一个引用类型，我们可以定义一个Integer类，它只包含一个实例字段int，这样，Integer类就可以视为int的包装类（Wrapper Class）
		// 如类 Integer 定义好后 就可以把int和Integer互相转换
		Integer1 n = null;
		Integer1 n2 = new Integer1(99);
		int n3 = n2.intValue();
		/*
		 * 实际上，因为包装类型非常有用，Java核心库为每种基本类型都提供了对应的包装类型：
		 * 
		 * 基本类型	对应的引用类型
			boolean	java.lang.Boolean
			byte	java.lang.Byte
			short	java.lang.Short
			int	java.lang.Integer
			long	java.lang.Long
			float	java.lang.Float
			double	java.lang.Double
			char	java.lang.Character
		 */
		// 都可以直接使用 如：
		float i = 100.0f;//浮点型结尾要加f
        // 通过new操作符创建Integer实例(不推荐使用,会有编译警告):
		Float n1 = new Float(i);
        // 通过静态方法valueOf(float)创建Float实例:
		Float n22 = Float.valueOf(i);
        // 通过静态方法valueOf(String)创建Float实例:
		Float n32 = Float.valueOf("100");
        System.out.println(n32.floatValue());
        
        //2 Auto Boxing 自动装拆箱
        // 因为int和Integer可以互相转换
        int i1 = 100;
        Integer n11 = Integer.valueOf(i1);
        int x = n11.intValue();
        // 所以，Java编译器可以帮助我们自动在int和Integer之间转型
        //Integer n112 = 100; // 编译器自动使用Integer.valueOf(int)
        //int x12 = n112; // 编译器自动使用Integer.intValue()
        //注意：自动装箱和自动拆箱只发生在编译阶段，目的是为了少写代码。
        //装箱和拆箱会影响代码的执行效率，因为编译后的class代码是严格区分基本类型和引用类型的。并且，自动拆箱执行时可能会报NullPointerException：
        
        //3 不变类
        // 所有的包装类型都是不变类。我们查看Integer的源码可知，它的核心代码如下 
        /*
         * public final class Integer {
    			private final int value;
			}
			因此，一旦创建了Integer对象，该对象就是不变的。
			对两个Integer实例进行比较要特别注意：绝对不能用==比较，因为Integer是引用类型，必须使用equals()比较
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
         * 仔细观察结果的童鞋可以发现，==比较，较小的两个相同的Integer返回true，较大的两个相同的Integer返回false，这是因为Integer是不变类，
         * 编译器把Integer x = 127;自动变为Integer x = Integer.valueOf(127);，为了节省内存，Integer.valueOf()对于较小的数，始终返回相同的实例，
         * 因此，==比较“恰好”为true，但我们绝不能因为Java标准库的Integer内部有缓存优化就用==比较，必须用equals()方法比较两个Integer。
         * 
         */
        //
        
        
        
        
        
        
	}
}
