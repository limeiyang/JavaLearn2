package _6enumerationClass;
// 枚举类
// 枚举是一个被命名的整型常数的集合，用于声明一组带标识符的常数
public class Main {
	public static void main(String[] args) {
		int day = 1;
		//1 引用枚举类
		if(day == Weekday.MON) {
			System.out.printf("true");
		}
		
		//2 使用 String 常量
		String color = "r";
		if(Color.RED.equals(color)) {
			System.out.println("true");
		}
		
		//3 无论是int常量还是String常量，使用这些常量来表示一组枚举值的时候，有一个严重的问题就是，编译器无法检查每个值的合理性。
		
		//4 enum 枚举类型
		// 为了让编译器能自动检查某个值在枚举的集合内，并且，不同用途的枚举需要不同的类型来标记，不能混用，我们可以使用enum来定义枚举类
		// --1 下面定义Weekdayss类型的枚举类
		Weekdayss day1 = Weekdayss.SUN;
		if(day1 == Weekdayss.SUN) {
			System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }
		
		// 不同类型的枚举不能互相比较或者赋值，因为类型不符。例如，不能给一个Weekday枚举类型的变量赋值为Color枚举类型的值：
		/*
		 * Weekday x = Weekday.SUN; // ok!
           Weekday y = Color.RED; // Compile error: incompatible types 
		 */
		
		//5 enum的比较
		// 使用enum定义的枚举类是一种引用类型。前面我们讲到，引用类型比较，要使用equals()方法，如果使用==比较，它比较的是两个引用类型的变量是否是同一个对象。因此，引用类型比较，要始终使用equals()方法，但enum类型可以例外。
		// 这是因为enum类型的每个常量在JVM中只有一个唯一实例，所以可以直接用==比较：
		/*
		 * if (day == Weekday.FRI) { // ok!
			}
			if (day.equals(Weekday.SUN)) { // ok, but more code!
			}
		 * 
		 */
		
		//6 enum类型
		// 通过enum定义的枚举类，和其他的class有什么区别？
		// 答 没有任何区别 enum定义的类型就是class，只不过它有以下几个特点：
		/*
		 *  定义的enum类型总是继承自java.lang.Enum，且无法被继承；
			只能定义出enum的实例，而无法通过new操作符创建enum的实例；
			定义的每个实例都是引用类型的唯一实例；
			可以将enum类型用于switch语句。
		 */
		// 例如看 --2
		
		//7 enum枚举类的一些方法
		// 7.1 name() 返回常量名
		String s = Weekdayss.SUN.name(); // "SUN"
		// 7.2 ordinal() 返回定义的常量的顺序，从0开始计数
		int n = Weekdayss.MON.ordinal(); // 1
		// 改变枚举常量定义的顺序就会导致ordinal()返回值发生变化。
		// 因为enum本身是class，所以我们可以定义private的构造方法，并且，给每个枚举常量添加字段
		// 默认情况下，对枚举常量调用toString()会返回和name()一样的字符串。但是，toString()可以被覆写，而name()则不行。我们可以给Weekday添加toString()方法
		/*
		 *public class Main {
		    public static void main(String[] args) {
		        Weekday day = Weekday.SUN;
		        if (day.dayValue == 6 || day.dayValue == 0) {
		            System.out.println("Today is " + day + ". Work at home!");
		        } else {
		            System.out.println("Today is " + day + ". Work at office!");
		        }
		    }
		}
		
		enum Weekday {
		    MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"), SUN(0, "星期日");
		
		    public final int dayValue;
		    private final String chinese;
		
		    private Weekday(int dayValue, String chinese) {
		        this.dayValue = dayValue;
		        this.chinese = chinese;
		    }
		
		    @Override
		    public String toString() {
		        return this.chinese;
		    }
		}
		 */
		
		//8 switch
		// 枚举类可以应用在switch语句中。因为枚举类天生具有类型信息和有限个枚举常量，所以比int、String类型更适合用在switch语句中
		/*
		 *  public class Main {
			    public static void main(String[] args) {
			        Weekday day = Weekday.SUN;
			        switch(day) {
			        case MON:
			        case TUE:
			        case WED:
			        case THU:
			        case FRI:
			            System.out.println("Today is " + day + ". Work at office!");
			            break;
			        case SAT:
			        case SUN:
			            System.out.println("Today is " + day + ". Work at home!");
			            break;
			        default:
			            throw new RuntimeException("cannot process " + day);
			        }
			    }
			}
			
			enum Weekday {
			    MON, TUE, WED, THU, FRI, SAT, SUN;
			}
		 */
		
	}
}

// --1
enum Weekdayss{
	SUN, MON, TUE, THU, FRI, SAT;
}

// --2
// 定义的Color枚举类
enum Color1 {
    RED, GREEN, BLUE;
}
// 编译器编译出的class大概就像这样：
/*
public final class Color extends Enum { // 继承自Enum，标记为final class
    // 每个实例均为全局唯一:
    public static final Color RED = new Color();
    public static final Color GREEN = new Color();
    public static final Color BLUE = new Color();
    // private构造方法，确保外部无法调用new操作符:
    private Color() {}
}
*/

