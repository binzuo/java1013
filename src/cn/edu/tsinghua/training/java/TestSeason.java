package cn.edu.tsinghua.training.java;
/**
 * Created by Administrator on 2016/10/13 0013.
 */
public class TestSeason {
    public TestSeason(Season s) {
        System.out.println(s.getName() + ",是一个" + s.getCharacteristic() + "的季节");

    }

    public static void main(String[] args) {
        new TestSeason(Season.Spring);
    }
}
