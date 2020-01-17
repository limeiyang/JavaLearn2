package _1string;

import java.util.Arrays;

public class Score {
	private int[] scores;
	
    public Score(int[] scores) {
        this.scores = scores;
    	
        //修改如下 将scores复制一份 而不是直接赋值引用
        //this.scores = scores.clone();
        //函数引用数组的时候，没有改变内部的需求的话，最好使用克隆的办法，否则会造成代码逻辑的混乱
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}
