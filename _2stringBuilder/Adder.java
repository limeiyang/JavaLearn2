package _2stringBuilder;

public class Adder {
	private int sum = 0;
	
	public Adder add(int n) {
		sum += n;
		return this;//ʵ����ʽ����
	}
	
	public Adder inc() {
		sum ++;
		return this;
	}
	
	public int value() {
        return sum;
    }
}
