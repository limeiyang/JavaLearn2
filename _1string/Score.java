package _1string;

import java.util.Arrays;

public class Score {
	private int[] scores;
	
    public Score(int[] scores) {
        this.scores = scores;
    	
        //�޸����� ��scores����һ�� ������ֱ�Ӹ�ֵ����
        //this.scores = scores.clone();
        //�������������ʱ��û�иı��ڲ�������Ļ������ʹ�ÿ�¡�İ취���������ɴ����߼��Ļ���
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}
