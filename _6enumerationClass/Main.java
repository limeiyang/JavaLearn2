package _6enumerationClass;
// ö����
// ö����һ�������������ͳ����ļ��ϣ���������һ�����ʶ���ĳ���
public class Main {
	public static void main(String[] args) {
		int day = 1;
		//1 ����ö����
		if(day == Weekday.MON) {
			System.out.printf("true");
		}
		
		//2 ʹ�� String ����
		String color = "r";
		if(Color.RED.equals(color)) {
			System.out.println("true");
		}
		
		//3 ������int��������String������ʹ����Щ��������ʾһ��ö��ֵ��ʱ����һ�����ص�������ǣ��������޷����ÿ��ֵ�ĺ����ԡ�
		
		//4 enum ö������
		// Ϊ���ñ��������Զ����ĳ��ֵ��ö�ٵļ����ڣ����ң���ͬ��;��ö����Ҫ��ͬ����������ǣ����ܻ��ã����ǿ���ʹ��enum������ö����
		// --1 ���涨��Weekdayss���͵�ö����
		Weekdayss day1 = Weekdayss.SUN;
		if(day1 == Weekdayss.SUN) {
			System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }
		
		// ��ͬ���͵�ö�ٲ��ܻ���Ƚϻ��߸�ֵ����Ϊ���Ͳ��������磬���ܸ�һ��Weekdayö�����͵ı�����ֵΪColorö�����͵�ֵ��
		/*
		 * Weekday x = Weekday.SUN; // ok!
           Weekday y = Color.RED; // Compile error: incompatible types 
		 */
		
		//5 enum�ıȽ�
		// ʹ��enum�����ö������һ���������͡�ǰ�����ǽ������������ͱȽϣ�Ҫʹ��equals()���������ʹ��==�Ƚϣ����Ƚϵ��������������͵ı����Ƿ���ͬһ��������ˣ��������ͱȽϣ�Ҫʼ��ʹ��equals()��������enum���Ϳ������⡣
		// ������Ϊenum���͵�ÿ��������JVM��ֻ��һ��Ψһʵ�������Կ���ֱ����==�Ƚϣ�
		/*
		 * if (day == Weekday.FRI) { // ok!
			}
			if (day.equals(Weekday.SUN)) { // ok, but more code!
			}
		 * 
		 */
		
		//6 enum����
		// ͨ��enum�����ö���࣬��������class��ʲô����
		// �� û���κ����� enum��������;���class��ֻ�����������¼����ص㣺
		/*
		 *  �����enum�������Ǽ̳���java.lang.Enum�����޷����̳У�
			ֻ�ܶ����enum��ʵ�������޷�ͨ��new����������enum��ʵ����
			�����ÿ��ʵ�������������͵�Ψһʵ����
			���Խ�enum��������switch��䡣
		 */
		// ���翴 --2
		
		//7 enumö�����һЩ����
		// 7.1 name() ���س�����
		String s = Weekdayss.SUN.name(); // "SUN"
		// 7.2 ordinal() ���ض���ĳ�����˳�򣬴�0��ʼ����
		int n = Weekdayss.MON.ordinal(); // 1
		// �ı�ö�ٳ��������˳��ͻᵼ��ordinal()����ֵ�����仯��
		// ��Ϊenum������class���������ǿ��Զ���private�Ĺ��췽�������ң���ÿ��ö�ٳ�������ֶ�
		// Ĭ������£���ö�ٳ�������toString()�᷵�غ�name()һ�����ַ��������ǣ�toString()���Ա���д����name()���С����ǿ��Ը�Weekday���toString()����
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
		    MON(1, "����һ"), TUE(2, "���ڶ�"), WED(3, "������"), THU(4, "������"), FRI(5, "������"), SAT(6, "������"), SUN(0, "������");
		
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
		// ö�������Ӧ����switch����С���Ϊö������������������Ϣ�����޸�ö�ٳ��������Ա�int��String���͸��ʺ�����switch�����
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
// �����Colorö����
enum Color1 {
    RED, GREEN, BLUE;
}
// �������������class��ž���������
/*
public final class Color extends Enum { // �̳���Enum�����Ϊfinal class
    // ÿ��ʵ����Ϊȫ��Ψһ:
    public static final Color RED = new Color();
    public static final Color GREEN = new Color();
    public static final Color BLUE = new Color();
    // private���췽����ȷ���ⲿ�޷�����new������:
    private Color() {}
}
*/

